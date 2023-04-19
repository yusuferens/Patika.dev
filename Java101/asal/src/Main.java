public class Main {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean isAsal = true;
            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    isAsal = false;
                    break;
                }
            }
            if (isAsal) {
                System.out.println(sayi);
            }
        }
    }
}