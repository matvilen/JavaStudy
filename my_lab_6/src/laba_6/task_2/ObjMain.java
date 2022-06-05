package laba_6.task_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ObjMain {
    public static void main(String[] args) throws Exception {
        ArrayList<MyObject> list = new ArrayList<MyObject>();

        System.out.println();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\metel\\IdeaProjects\\my_lab_6\\src\\laba_6\\task_2\\obj.txt")), "UTF-8"))) {
            for (String line; (line = br.readLine()) != null;) {
                list.add(new MyObject(line));
            }
        } catch (Exception e) {
            System.out.println("File does not exists");
            System.exit(0);
        }

        System.out.println("Start List: " + list + "\n");

        Collections.sort(list, new Comparator<MyObject>() {
            public int compare(MyObject o1, MyObject o2) {
                if (o1.hash == o2.hash) return 0;
                return o1.hash < o2.hash ? -1 : 1;
            }
        });

        System.out.println("End List: " + list + "\n");

        for (MyObject obj : new ArrayList<MyObject>(list)) if (list.indexOf(obj) != list.lastIndexOf(obj)) list.remove(obj);
        System.out.println("СList without similar records: " + list);
    }
}
