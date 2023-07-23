import java.util.Scanner;

public class Main {

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " bir asal sayıdır.");
        } else {
            System.out.println(num + " bir asal sayı değildir.");
        }
    }
}
