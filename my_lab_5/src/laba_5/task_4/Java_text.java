package laba_5.task_4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Java_text {

        public static void main(String[] args) {

            File file_1 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_3\\First_last_word_letter.java");

            File file_2 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_4\\Java_program_changed.java");

            file_2.delete();

            try {
                file_2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Path out_file_path = Path.of(file_2.getPath());

            Scanner scanner = null;
            try {
                scanner = new Scanner(file_1);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                //line = line.replaceAll("\\pP", " ");
                String[] words = line.split("[)!(;\\ #.,:\"]");

                for(String word : words){
                    if (word.length() > 2) {
                        String word_upper = word.toUpperCase(Locale.ROOT);
                        line = line.replace(word, word_upper);
                    };
                }

                try {
                    Files.write(out_file_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}
