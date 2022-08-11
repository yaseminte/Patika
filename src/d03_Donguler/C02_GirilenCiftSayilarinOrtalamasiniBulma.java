package d03_Donguler;

import java.util.Scanner;

public class C02_GirilenCiftSayilarinOrtalamasiniBulma {
    public static void main(String[] args) {

        //Ödev
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

        int sayac = 0;
        int rakamlarToplami = 0;

        for (int i = 1; i <= sayi; i++) {
            if (i%3==0 && i%4==0){
                sayac++;
                rakamlarToplami+=i;
            }
        }
        System.out.println(sayac);
        System.out.println(rakamlarToplami);
        System.out.println("Ortalama : " + rakamlarToplami/sayac);

    }
}
