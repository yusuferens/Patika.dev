import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int totaln=1;
        int totalr=1;
        int totalnr=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("N Elemanı");

        int n = inp.nextInt();
        System.out.println("R Elemanı");
        int r = inp.nextInt();

        for (int i = 1; i<=n; i++){
            totaln = totaln * i;


        }
        for (int j = 1; j<=r; j++){

            totalr = totalr * j;
            }
        int nMinusR = n - r;
        for (int k = 1; k<=nMinusR; k++ ) {
            totalnr *= k;
        }
        int nKr = totaln / (totalr * totalnr);

        System.out.println("N nin R ile kombinasyonu: " + nKr);


        }



    }
