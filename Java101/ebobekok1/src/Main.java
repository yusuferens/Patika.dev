import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int n2 = input.nextInt();

        int i, ebob = 0, ekok;

        i = n1 < n2 ? n1 : n2; //eğer n1 < n2 ise i ye n1 atanıyor tam tersiyse n2 atanıyor

        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}