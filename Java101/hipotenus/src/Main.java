import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double cevre;
        double u;
        double alan;


        Scanner girdi = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz:");
        a = girdi.nextInt();
        System.out.println("2. Kenarı Giriniz:");
        b = girdi.nextInt();
        System.out.println("3. Kenarı Giriniz");
        c = girdi.nextInt();

        u= (a + b + c) / 2;
        cevre = u*2;
        alan = Math.sqrt(u*(a-u)*(b-u)*(c-u));
        System.out.println("Alan:" + alan);



    }
}