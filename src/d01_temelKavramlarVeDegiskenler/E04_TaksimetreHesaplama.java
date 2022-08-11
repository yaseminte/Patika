package d01_temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class E04_TaksimetreHesaplama {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        int mesafe, total=10;
        double perKm=2.20;

        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe=scan.nextInt();

        total+=mesafe*perKm;

       /*
        int altLimit=20;
        int toplam= total<20 ? altLimit : total;

        System.out.println("Toplam Tutar :" + toplam);

        */
        if (total<20){
            System.out.println("Toplam Tutar : 20 TL");
        }
        else {
            System.out.println("Toplam Tutar : " + total);
        }



    }
}
