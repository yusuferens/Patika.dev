import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz :");
        mat = input.nextInt();
        while (mat < 0 || mat > 100) {
            System.out.println("Lütfen 0-100 arası bir not giriniz:");
            mat = input.nextInt();
        }

        System.out.println("Türkçe Notunuz :");
        turkce = input.nextInt();
        while (turkce < 0 || turkce > 100) {
            System.out.println("Lütfen 0-100 arası bir not giriniz:");
            turkce = input.nextInt();
        }

        System.out.println("Fizik Notunuz :");
        fizik = input.nextInt();
        while (fizik < 0 || fizik > 100) {
            System.out.println("Lütfen 0-100 arası bir not giriniz:");
            fizik = input.nextInt();
        }

        System.out.println("Kimya Notunuz :");
        kimya = input.nextInt();
        while (kimya < 0 || kimya > 100) {
            System.out.println("Lütfen 0-100 arası bir not giriniz:");
            kimya = input.nextInt();
        }

        System.out.println("Müzik Notunuz :");
        muzik = input.nextInt();
        while (muzik < 0 || muzik > 100) {
            System.out.println("Lütfen 0-100 arası bir not giriniz:");
            muzik = input.nextInt();
        }

        double average = (mat + fizik + turkce + muzik + kimya) / 5.0;

        if (average <= 55) {
            System.out.println("Kaldınız");
            System.out.println("Ortalamanız :" + average);
        } else {
            System.out.println("Tebrikler Geçtiniz");
        }
    }
}