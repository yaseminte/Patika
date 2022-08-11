package d03_Donguler;

import java.util.Scanner;

public class C17_MinMaxDegerleriBulma {
    public static void main(String[] args) {

        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
        bu sayıları ekrana yazan programı yazın.
        Senaryo
        Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz : ");
        int N = scan.nextInt();
        int enBuyukSayi = 1;
        int enKucukSayi = 1;

        int i = 1;
        int sayi;
        do {
            System.out.print(i + ". sayiyi giriniz : ");
            sayi = scan.nextInt();
            i++;
            if (sayi == 1) {
                enKucukSayi =sayi;
                enBuyukSayi=sayi;
            }
            if (sayi>enBuyukSayi){
                enBuyukSayi = sayi;
            }
            if (sayi< enKucukSayi){
                enKucukSayi = sayi;
            }

        }while(i <= N);

        System.out.println("enBuyukSayi = " + enBuyukSayi);
        System.out.println("enKucukSayi = " + enKucukSayi);

    }
}
