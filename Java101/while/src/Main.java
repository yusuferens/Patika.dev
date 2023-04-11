import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz");
        int toplam = 0;
        int adet = 0;

        k = inp.nextInt();

        for (int i=0; i<=k ; i++){
            if (i % 3 == 0 && i % 4 == 0){
                toplam += i;
                adet++;
            }
        }

        if (adet > 0 ) {
            double ortalama = (double) toplam / adet;
            System.out.println("0-" + k + "arasındaki 3 ve 4 e tam bölünen sayıların ortalaması:" + ortalama);
        }else{
            System.out.println("0-" + k + "arasında 2 ve 4 e tam bölünen sayı yok");
        }





    }
}