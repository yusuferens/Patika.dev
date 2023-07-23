import java.util.Scanner;

public class Main {

    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üssü giriniz: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println(base + " üzeri " + exponent + " = " + result);
    }
}
