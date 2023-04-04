import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut;
        double elma;
        double domates;
        double muz;
        double patlıcan;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;


        Scanner inp = new Scanner(System.in);

        System.out.println("Armutun Kilosunu giriniz");

        double armutkg = inp.nextDouble();

        System.out.println("Elmanın Kilosunu Giriniz");

        double elmakg = inp.nextDouble();

        System.out.println("Domatesin Kilosunu giriniz");

        double domateskg = inp.nextDouble();

        System.out.println("Muzun Kilosunu giriniz");

        double muzkg = inp.nextDouble();

        System.out.println("Patlıcanın Kilosunu giriniz");

        double patlıcankg = inp.nextDouble();

        double tutar = (armut * armutkg) + (elma * elmakg) + (domateskg * domates) + (muz * muzkg) + (patlıcan * patlıcankg);

        System.out.println("Toplam ücret" + tutar);



    }
}