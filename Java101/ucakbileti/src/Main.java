import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int km, yolcu, age, normaltutar, indirimlitutar, gidisdönüs, toplam, sontoplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM türünden giriniz");

        km = input.nextInt();

        if (km <=0) {
            System.out.println("Hatalı veri girdiniz, girdiğiniz veri pozitif sayı olmalıdır.");
            return;
        }



        System.out.println("Yaşınızı Giriniz");

        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz ( 1 = Tek Yön, 2 = Gidiş Dönüş");

        yolcu = input.nextInt();

        normaltutar = (int) (km * 0.10);


        if (yolcu == 1) {
            if (age < 12) {
                toplam = (int) (normaltutar - (normaltutar * 0.50));
                System.out.println("Toplam Tutar: " + toplam);

            } else if (age > 65) {
                toplam = (int) (normaltutar - (normaltutar * 0.30));
                System.out.println("Toplam Tutar: " + toplam);

            } else if (age > 12 && age < 24) {
                toplam = (int) (normaltutar - (normaltutar * 0.10));
                System.out.println("Toplam Tutar: " + toplam);

            } else {
                System.out.println("Toplam Tutar: " + normaltutar);
            }

        } else if (yolcu == 2) {
            if (age < 12) {
                toplam = (int) (normaltutar - (normaltutar * 0.50));
                sontoplam = (int) (2 * (toplam - (toplam / 0.20)));
                System.out.println("Toplam Tutar: " + sontoplam);
            } else if (age > 65) {
                toplam = (int) (normaltutar - (normaltutar * 0.30));
                sontoplam = (int) (2 * (toplam - (toplam * 0.20)));
                System.out.println("Toplam Tutar: " + sontoplam);
            } else if (age > 12 && age < 24) {
                toplam = (int) (normaltutar - (normaltutar * 0.10));
                sontoplam = (int) (2 * (toplam - (toplam * 0.20)));
                System.out.println("Toplam Tutar: " + sontoplam);
            } else {
                toplam = (int) (2 * (normaltutar - (normaltutar * 0.10)));
                System.out.println("Toplam Tutar: " + toplam);
            }

        }else {
            System.out.println("Hatalı Seçim yaptınız. Lütfen 1 ya da 2 giriniz. ");


                }














            }
        }









