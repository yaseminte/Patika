package d03_Donguler;

public class C19_TersUcgen {
    public static void main(String[] args) {
        /*
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
        Örnek
        Basamak Sayısı : 10
         */

        int basamak = 10;

        for (int i = 1; i <= basamak; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = basamak; k > i ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
