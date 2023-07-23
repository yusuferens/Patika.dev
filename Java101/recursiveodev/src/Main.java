import java.util.Scanner;

public class Main {

    static void recursiveOperation(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        recursiveOperation(n - 5);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        recursiveOperation(n);
    }
}
