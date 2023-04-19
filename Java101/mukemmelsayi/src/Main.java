import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,toplam;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        sayi = input.nextInt();

        int i = 1;
        toplam = 0;
        while(i < sayi){
            if (sayi % i == 0) {

                toplam += i;
            }
            i++;
        }

        if (toplam == sayi) {
            System.out.println("Girdiğiniz Sayı Mükemmel Sayıdır");
        } else {
            System.out.println("Girdiğniz Sayı mükemmel sayı değildir.");
        }




        }


    }
