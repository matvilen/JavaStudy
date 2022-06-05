package laba_7.task_3;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//4.	Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.

public class Question_sen {
    public static void main(String[] args) {
        String text = "It is no secret that our planet suffer from huge emissions of recycled\n" +
                "fuel. Therefore, some people believe that high prices on the fuel can\n" +
                "help to rectify the situation. In my opinion, this solution is not only\n" +
                " useless, but also might be harmful for human being being?\n" +
                "First of all, increasing the cost of the fuel will cause various social\n" +
                "problems, such as losses for small businesses, refusal to travel for the\n" +
                "poor, stopping the supply of goods to remote regions. And as a result,\n" +
                "even greater stratification between people. Actually, if we can influence\n" +
                "on the price, it is better to downgrade cost of hybrid cars. This way,\n" +
                "people will have more abilities to buy them and take care of the environment.";
        String patternStr = "[^.?!]*[?]";



        Pattern p = Pattern.compile(patternStr);
        Matcher m = p.matcher(text);

        ArrayList<String> words = new ArrayList<String>();

        while (m.find()) {
            String sent = m.group();
            System.out.println(sent);

            for (String word : sent.split(" ")) {
                word = word.replaceAll("[.?,]", "");
                if (!words.contains(word)) words.add(word);
            }
        }

        System.out.println(words);
    }
}
