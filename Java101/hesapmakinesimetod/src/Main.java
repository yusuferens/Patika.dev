import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam = " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma = " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma = " + result);
        return result;

    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("Bölme = " + result);
        return result;
    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs alma =" + result);

        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        return result;
    }
    static int calc(int a,int b){
      int result = 2* (a+b);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama işlemi\n"
                + "2 Çıkarma İşlemi\n"
                + "3 Çarpma İşlemi\n"
                + "4 Bölme İşlemi\n"
                + "5 Üslü Sayı Hesaplama İşlemi\n"
                + "6 Mod alma İşlemi\n"
                + "7 Dikdortgen Alan ve Çevre İşlemi\n"
                + "0 Çıkış yap\n";
        int result;
        do{
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz");
            select = scanner.nextInt();
            if (select ==0){
                break;
            }
            System.out.println("İlk sayıyı giriniz");
            int a = scanner.nextInt();
            System.out.println("İkinci Sayıyı Giriniz");
            int b = scanner.nextInt();
            switch (select){
                case 1:
                    result = sum(a, b);
                    break;

                case 2:
                     result = minus(a,b);
                    break;

                case 3:
                    result = times(a,b);
                    break;
                case 4:
                    if (divided(a , b) == 0){
                        System.out.println("İkinci sayı 0 dan farklı olmalıdır");
                    }
                case 5:
                    result = pow(a,b);
                    break;
                case 6:
                    result = mod(a,b);
                    break;
                case 7:
                    result = calc(a,b);
                    break;

            }
        }while (select != 0);
    }
}