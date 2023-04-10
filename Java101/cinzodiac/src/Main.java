import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogum, sonuc;

        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Yazın");
        dogum = inp.nextInt();
        sonuc = dogum % 12;
        switch (sonuc) {
            case 0:
                System.out.print(" Çin Burcunuz: Maymun ");
                break;
            case 1:
                    System.out.print(" Çin Burcunuz: Horoz ");
                break;
            case 2:
                System.out.print(" Çin Burcunuz: Köpek ");
                break;
            case 3:
                System.out.print(" Çin Burcunuz: Domuz ");
                break;
            case 4:
                System.out.print(" Çin Burcunuz: Fare ");
                break;
            case 5:
                System.out.print(" Çin Burcunuz: Öküz ");
                break;
            case 6:
                System.out.print(" Çin Burcunuz: Kaplan ");
                break;
            case 7:
                System.out.print(" Çin Burcunuz: Tavşan ");
                break;
            case 8:
                System.out.print(" Çin Burcunuz: Ejderha ");
                break;
            case 9:
                System.out.print(" Çin Burcunuz: Yılan ");
                break;
            case 10:
                System.out.print(" Çin Burcunuz: At ");
                break;
            case 11:
                System.out.print(" Çin Burcunuz: Koyun ");
                break;
            default:
                System.out.print(" Geçersiz bir durum var");
        }
    }
}