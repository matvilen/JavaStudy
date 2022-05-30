package laba_1.task_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

    public static void main(String[] args)
            throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("Hello, " + name);
    }
}
