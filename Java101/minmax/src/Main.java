import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?: ");
        int n = input.nextInt();

        int i, sayi, enBuyuk, enKucuk;

        System.out.print("1. sayıyı girin: ");
        sayi = input.nextInt();

        enBuyuk = sayi;
        enKucuk = sayi;

        for (i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);    }
}