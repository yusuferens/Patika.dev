package Giris;
import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz");
        fizik =  input.nextInt();

        System.out.println("Kimya Notunuz");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz");
        turkce = input.nextInt();
        System.out.println("Tarih Notunuz");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz");
        muzik = input.nextInt();

        int toplam = (mat + fizik + turkce + tarih + muzik + kimya);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız :" + sonuc);

        boolean kalmak = sonuc < 60;
        boolean gecmek = sonuc > 60;

        String str = kalmak ? "Sınıfı Geçti" : "Sınıfta Kaldı";


        System.out.println(str);








    }
}
