package d03_Donguler;

import java.util.Scanner;

public class C12_HarmonikSayilariBulanProgram {
    public static void main(String[] args) {

        //Java ile girilen sayının harmonik serisini bulan program yazacağız.
        //Harmonik Seri Formulü = 1 + (1/2) + (1/3) + (1/4) + (1/n)...

        Scanner scan = new Scanner(System.in);
        System.out.print("n sayisini giriniz : ");
        double n = scan.nextInt();
        double sonuc = 0;

        for (double i = 1; i <= n ; i++) {
            sonuc += (1/i);
        }
        System.out.println(sonuc);
    }
}
