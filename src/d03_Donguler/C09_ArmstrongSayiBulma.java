package d03_Donguler;

import java.util.Scanner;

public class C09_ArmstrongSayiBulma {
    public static void main(String[] args) {
        //Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
        //
        //Armstrong Sayı Nedir ?
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
        //böyle sayılara Armstrong sayı denir.
        //
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        // Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        //
        //1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için
        // armstrong sayı olmaz.
        //
        //1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
        //
        //54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int sayi = scan.nextInt();
        int tempSayi = sayi;

        int basSayisi = 0;
        int basDegeri;
        int usSayi;
        int sonuc = 0;


        while (tempSayi != 0) {
            tempSayi /= 10;
            basSayisi++;
        }
        tempSayi = sayi;

        while (tempSayi != 0) {
            basDegeri = tempSayi % 10;

            usSayi=1;
            for (int i = 1; i <= basSayisi; i++) {
                usSayi *= basDegeri;
            }
            sonuc += usSayi;
            tempSayi /= 10;
        }
        if (sonuc == sayi) {
            System.out.println(sayi + " sayisi bir Armstrong sayidir");
        } else
            System.out.println(sayi + " sayisi bir Armstrong sayi degildir");

    }
}
