package d03_Donguler;

import java.util.Scanner;

public class C08_UsluSayiBulma {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        //Ödev
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
        // "For Döngüsü" kullanarak yapınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz : ");
        int sayi = scan.nextInt();
        System.out.print("Us degerini giriniz : ");
        int us = scan.nextInt();

        int toplam = 1;

        for (int i = 1; i <=us ; i++) {
            toplam*=sayi;
        }
        System.out.println(sayi +"^" + us + " = " + toplam);
    }
}
