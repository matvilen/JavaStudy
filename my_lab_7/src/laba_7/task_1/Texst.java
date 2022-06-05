package laba_7.task_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Scanner;

//3.	В тексте после буквы Р, если она не последняя в слове, ошибочно напечатана буква А вместо О. Внести исправления в текст.
public class Texst {
    public static void main(String[] args) {

        File file_1 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_7\\src\\laba_7\\task_1\\my_text.txt");
        Path file_2_path = Paths.get("C:\\Users\\metel\\IdeaProjects\\my_lab_7\\src\\laba_7\\task_1\\my_text_changed.txt");
        File file_2 = new File("C:\\Users\\metel\\IdeaProjects\\my_lab_7\\src\\laba_7\\task_1\\my_text_changed.txt.txt");

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
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("РА", "РО");
            line = line.replaceAll("ра", "ро");
            line = line.replaceAll("Ра", "Ро");
            line = line.replaceAll("рА", "рО");

            try {
                Files.write(file_2_path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
