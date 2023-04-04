import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int r;
    double pi = 3.14;
    int a;
        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını girin");
        r = inp.nextInt();

        Scanner aci = new Scanner(System.in);

        System.out.println("Dairenizin merkez açısını girin");

        a =inp.nextInt();

        double alan = pi * r *r;
        double cevre = 2 * pi * r;
        double alan2 = (pi * (r*r) * alan) / 360;
        System.out.println("Dairenizin alanı; " + alan);
        System.out.println("Dairenizin Çevresi; " + cevre);
        System.out.println("Dairenizin verilen diliminin alanı; " + alan2);
    }

}