package d03_Donguler;

import java.util.Scanner;

public class C06_FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        //Java ile faktöriyel hesaplayan program yazıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyel Sayisi : ");
        int f = scan.nextInt();
        int toplam =1;

        for (int i = 1; i <=f ; i++) {
            toplam *= i;
        }
        System.out.println(f+"! : " + toplam);
    }
}
