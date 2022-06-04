package laba_5.task_3;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.Collections;
import java.util.Locale;

public class Glasnaya_letter {
    public static void main(String[] args) {

        File file_1 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\Text.txt");
        Path file_2_path = Paths.get("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\Finish_text_1.txt");
        File file_2 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\Finish_text_1.txt");

        if(file_2.delete()) {
            try {
                file_2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(file_1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String start_letters = "аоэеиыуёюя";

        while(scanner.hasNextLine()) {
            String file_line = scanner.nextLine();
            file_line = file_line.replaceAll("\\pP", "");
            String[] words = file_line.split(" ");
            String out = "";
            for(String word : words){
                String first_letter = word.length() > 1 ? word.substring(0, 1) : word;
                first_letter = first_letter.toLowerCase(Locale.ROOT);
                if (start_letters.contains(first_letter)) {
                    out = out.concat(word).concat(" ");
                };
            }

            try {
                Files.write(file_2_path, Collections.singleton(out), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
