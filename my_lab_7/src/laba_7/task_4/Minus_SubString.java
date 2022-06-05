package laba_7.task_4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//4.	В тексте исключить подстроку максимальной длины, начинающуюся и заканчивающуюся заданными символами.


public class Minus_SubString {
    public static void main(String[] args) {
        String text = "aaaaazzzzzzaaazzzaammaaaazzmzzzzmzaaaaa";

        Matcher matcher = Pattern.compile(args[0] + ".*" + args[1]).matcher(text);
        matcher.find();

        System.out.println("Text before: " + text);

        text = text.replace(matcher.group(), "");
        System.out.println("Text after: " + text);
    }
}
