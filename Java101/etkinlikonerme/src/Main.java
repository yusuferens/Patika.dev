import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kayak,sinema,piknik,yüzme,sıcaklık;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklığı Giriniz");

        sıcaklık = input.nextInt();

        if (sıcaklık < 5) {
            System.out.println("Kayak Yapmalısınız!");
        }
        if (sıcaklık >= 5 && sıcaklık < 15) {
            System.out.println("Sinemaya Gitmelisiniz");
        }
        if (sıcaklık >= 15 && sıcaklık < 25) {
            System.out.println("Pikniğe Gidebilirsiniz");
        }
        if (sıcaklık >= 25) {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }




    }
}