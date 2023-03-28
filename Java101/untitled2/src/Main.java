import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double kdv = 0.18;
        double kdv2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatı Giriniz");

        tutar = input.nextDouble();
        boolean kosul1 = tutar < 1000;
        boolean kosul2 = tutar >= 1000;
        double kdvTutar = tutar * kdv;
        double kdvTutar2 = tutar * kdv2;
        double toplam1 = kdvTutar + tutar;
        double toplam2 = kdvTutar2 + tutar;
        double toplam = kosul2 ? toplam2 : toplam1;
        System.out.println("KDV Oranı: " + (kosul2 ? kdv2 : kdv));
        System.out.println("KDVsiz Fiyat: " + tutar);
        System.out.println("Toplam: " + toplam);













    }
}