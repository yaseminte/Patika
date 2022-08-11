package d03_Donguler;

import java.util.Scanner;

public class C11_BasamakSayilarininToplaminiBulma {
    public static void main(String[] args) {

        //Ödev
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        int toplam = 0;
        int kalan;


        for (int i = 0; sayi > 0 ; i++) {

            kalan=sayi%10;
            toplam+=kalan;
            sayi/=10;
        }
        System.out.println("toplam = " + toplam);
    }
}
