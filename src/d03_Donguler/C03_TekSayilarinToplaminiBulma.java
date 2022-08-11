package d03_Donguler;

import java.util.Scanner;

public class C03_TekSayilarinToplaminiBulma {
    public static void main(String[] args) {
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner scan = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Bir sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi % 2 == 1) {
                toplam += sayi;
            }
        }while (sayi > 0) ;

        System.out.print("Tek Sayilarin Toplami : " + toplam);
    }
}
