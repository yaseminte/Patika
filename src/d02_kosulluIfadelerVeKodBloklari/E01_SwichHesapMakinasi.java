package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E01_SwichHesapMakinasi {
    public static void main(String[] args) {
        /*
        Basit Hesap Makinesi
        Kullanicidan iki tamsayi alin
        4 islemden hangisini yapmak istedigini sorun
        verilen cevaba gore istenilen islemi yaptırın
        eger hatalı islem secerse "Hatali Secim Yaptiniz Yazdirin
         */

        int sayi1, sayi2;

        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz : ");
        sayi1=scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        sayi2=scan.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Lutfen islem seciniz : ");
        int islem=scan.nextInt();

        switch(islem) {
            case 1:
                System.out.print("Toplama isleminin sonucu : " + (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Cikarma isleminin sonucu : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu : " + (sayi1*sayi2 ));
                break;
            case 4:
                System.out.println("Bolme isleminin sonucu : " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali secim yaptiniz");
        }

    }
}
