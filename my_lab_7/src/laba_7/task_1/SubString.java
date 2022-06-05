package laba_7.task_1;
//4.	В тексте слова заданной длины заменить указанной подстрокой, длина которой может не совпадать с длиной слова.

public class SubString {
    public static void main(String[] args) throws Exception{
        String text = "It is no secret that our planet suffer from huge emissions of recycled fuel. Therefore, some people believe that high prices on the fuel can help to rectify the situation. In my opinion, this solution is not only useless, but also might be harmful for human being.";
        String textNew = " ";

        int kol = Integer.parseInt(args[0]);
        String substring = args[1];

        String [] all_words = text.split("\\s");
        for (int k=0; k<all_words.length; ++k){
            if (all_words[k].length() == kol){
                textNew += " " + substring;
            }else {
                textNew += " " + all_words[k];
            }
        }
        System.out.println(text + "\n");
        System.out.println(textNew);
    }
}
