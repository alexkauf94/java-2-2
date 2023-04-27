public class Main {
    public static void main(String[] args) {

        int balance = 100;

        int plusBalance = 1100;

        int percent = 1;
        int sumBalance;

        if (plusBalance < 1000) {
            sumBalance = balance + plusBalance;
        } else {
            sumBalance = (plusBalance * percent / 100) + plusBalance + balance;
        }

        System.out.println(sumBalance);

    }
}