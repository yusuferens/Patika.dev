import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.println("Üssü Alınacak Sayı");
        n = input.nextInt();

        System.out.println("Üs olacak Sayı");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i<=k; i++){
            total *=n;

        }
        System.out.println("Cevap:" + total);

    }
}