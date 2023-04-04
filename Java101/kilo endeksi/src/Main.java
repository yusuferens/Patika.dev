import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kilonuzu Giriniz");

        kilo = inp.nextInt();

        Scanner pls = new Scanner(System.in);

        System.out.println("Boyunuzu Metre Cinsinden Giriniz");

        boy = pls.nextDouble();



        double index;

        index = kilo / (boy * boy);

        System.out.println("Boy Kilo Endeksiniz: " + index);


    }
}