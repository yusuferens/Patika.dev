import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username,password,select,newPassword;

        Scanner inp =new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        username = inp.nextLine();

        System.out.println("Şifreniz: ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış Şifrenizi sıfırlamak ister misiniz?");

            select = inp.nextLine();

            if (select.equals("evet")) {
                System.out.println("Yeni Şifrenizi Giriniz");
                newPassword = inp.nextLine();

            if(newPassword.equals(password)) {
                System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz !");
            }else {
                System.out.println("Yeni Şifreniz Kaydedildi");
            }
            } else if (select.equals("hayır")) {
                System.out.println("Vazgeçtiniz");
            } else {
                System.out.println("Geçersiz bir seçim yaptınız.");



                }
            }


        }
    }
