import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz");

        n = input.nextInt();

        for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5) {
            System.out.println(i + "\t" + j);


        }
    }
}