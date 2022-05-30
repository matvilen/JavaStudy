package laba_1.task_1;

public class Arguments {
    public static void main(String[] args) {
        //Создать приложение, которое отображает в окне консоли
        // аргументы командной строки метода main() в обратном порядке.
        for (int i = args.length - 1; i >= 0; i--){
            System.out.println("argument# " + i + " = " + args[i]);
        }
    }
}
