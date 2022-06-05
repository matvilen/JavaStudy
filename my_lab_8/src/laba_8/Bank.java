package laba_8;
import java.util.Random;
//1.	Реализовать многопоточное приложение “Банк”. Имеется банковский счет.
// Сделать синхронным пополнение и снятие денежных средств на счет/со счет
// случайной суммой. При каждой операции (пополнения или снятие) вывести текущий
// баланс счета. В том случае, если денежных средств недостаточно – вывести сообщение.
public class Bank {
    public volatile static int account;
    public volatile static Random random;

    public static void main(String[] args) throws InterruptedException {
        random = new Random();
        account = 0;

        new Thread(income).start();
        Thread.sleep(2000);
        new Thread(outcome).start();

    }

    static Runnable income = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int receipt = random.nextInt(100, 500);
                account += receipt;
                System.out.print("New income: ");
                System.out.println(receipt);
                System.out.print("Account: ");
                System.out.println(account);
                System.out.println("-----------");
            }
        }
    };

    static Runnable outcome = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int withdraw = random.nextInt(200, 400);
                if (withdraw <= account) {
                    account -= withdraw;
                    System.out.print("New outcome: ");
                    System.out.println(withdraw);
                    System.out.print("Account: ");
                    System.out.println(account);
                    System.out.println("-----------");
                } else {
                    System.out.print("Tried to write-off: ");
                    System.out.println(withdraw);
                    System.out.print("Account: ");
                    System.out.println(account);
                    System.out.println("Not enough money!");
                    System.out.println("-----------");
                }
            }
        }
    };
}
