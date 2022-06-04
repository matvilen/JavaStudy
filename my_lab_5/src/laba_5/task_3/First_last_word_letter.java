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

public class First_last_word_letter {
    public static void main(String[] args) {

        File file_1 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\Text.txt");
        Path file_2_path = Paths.get("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\Finish_text_2.txt");
        File file_2 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\Finish_text_2.txt");

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

        while(scanner.hasNextLine()) {
            String file_line = scanner.nextLine();
            file_line = file_line.replaceAll("\\pP", "");
            String[] words = file_line.split(" ");
            String out = "";
            for (int i=0; i < words.length -1 ; ++i){
                String last_letter = words[i].length() > 1 ? words[i].substring(words[i].length()-1, words[i].length()-0) : words[i];
                String first_letter = (words[i + 1].length() > 1) ? words[i + 1].substring(0, 1) : words[i + 1];
                if (last_letter.equals(first_letter)){
                    out = words[i] + " " + words[i+1];
                }
            }

            try {
                Files.write(file_2_path, Collections.singleton(out), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
