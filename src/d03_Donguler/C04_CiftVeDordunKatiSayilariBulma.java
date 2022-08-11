package d03_Donguler;

import java.util.Scanner;

public class C04_CiftVeDordunKatiSayilariBulma {
    public static void main(String[] args) {
        //Ödev
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner scan = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Bir sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi % 4 == 0) {
                toplam+=sayi;
            }
        }while (sayi%2==0) ;

        System.out.print("4'e Bolunen Sayilarin Toplami : " + toplam);
    }
}
