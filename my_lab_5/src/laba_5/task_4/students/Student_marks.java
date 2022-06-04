package laba_5.task_4.students;
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

public class Student_marks {
    public static void main(String[] args) {

        File file_2_1 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_4\\students\\Students.txt");

        File file_2_2 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_5\\src\\laba_5\\task_4\\students\\Students_changed.txt");

        file_2_2.delete();

        try {
            file_2_2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path out_file_path = Path.of(file_2_2.getPath());

        Scanner scanner = null;
        try {
            scanner = new Scanner(file_2_1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] words = line.split(" ");
            System.out.println(words[3]);
            Integer mark = Integer.parseInt(words[3]);
            if (mark > 7){
                String word_upper = words[0].toUpperCase(Locale.ROOT);
                line = line.replace(words[0], word_upper);
            }

            try {
                Files.write(out_file_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
