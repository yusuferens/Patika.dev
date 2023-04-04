import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz");
        n1 = inp.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        n2 = inp.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçiminiz");
        select = inp.nextInt();
        switch (select) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Bir Sayı 0 a bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız tekrar deneyiniz");
                break;
        }
    }




}