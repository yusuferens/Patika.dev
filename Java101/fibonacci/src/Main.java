import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int once = 0;
        int simdi = 1;
        int x;

        System.out.println("Eleman Sayısını Giriniz : ");

        Scanner inp = new Scanner(System.in);

        x = inp.nextInt();

        for (int i = 2; i <= x; i++){
            int sonrası = once + simdi;
            System.out.println(" " + sonrası);
            once = simdi;
            simdi = sonrası;
        }



    }
}