package laba_7.task_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//4. Найти, каких букв, гласных или согласных, больше в каждом предложении текста.
public class Glasn_sogl {
    public static void main(String[] args) {
        String text = "It is no secret that our planet suffer from huge emissions of recycled fuel. Therefore, some people believe that high prices on the fuel can help to rectify the situation. In my opinion, this solution is not only useless, but also might be harmful for human being.";

        Pattern vowel = Pattern.compile("[aeiouy]");
        Pattern consonant = Pattern.compile("abcdfghjklmnpqrstvwxz");

        for (String sent : text.split("[.!?]")) {
            int vowelCount = 0;
            int consonantCount = 0;

            Matcher vMatcher = vowel.matcher(sent);
            Matcher cMatcher = consonant.matcher(sent);

            while (vMatcher.find()) {
                vowelCount++;
            }

            while (cMatcher.find()) {
                consonantCount++;
            }

            System.out.print("In sentance '" + sent + "' ");
            if (vowelCount > consonantCount) System.out.println("Glasnue");
            else if (vowelCount < consonantCount) System.out.println("Soglasnue ");
            else System.out.println("Equel glasn and soglasn");
        }
    }
}
