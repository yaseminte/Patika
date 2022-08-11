package d01_temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class E07_ManavKasaProgrami {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        toplam tutarını ekrana yazdıran programı yazın.

         Meyveler ve KG Fiyatları
         Armut : 2,14 TL
         Elma : 3,67 TL
         Domates : 1,11 TL
         Muz: 0,95 TL
         Patlıcan : 5,00 TL

         Örnek Çıktı;
         Armut Kaç Kilo ? :0
         Elma Kaç Kilo ? :1
         Domates Kaç Kilo ? :1
         Muz Kaç Kilo ? :2
         Patlıcan Kaç Kilo ? :3
         Toplam Tutar : 21.68 TL
         */

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplamTutar;

        Scanner scan=new Scanner(System.in);

        System.out.print("Armut Kac Kilo? : ");
        armut*= scan.nextDouble();
        System.out.print("Elma Kac Kilo? : ");
        elma*= scan.nextDouble();
        System.out.print("Domates Kac Kilo? : ");
        domates*=scan.nextDouble();
        System.out.print("Muz Kac Kilo? : ");
        muz*=scan.nextDouble();
        System.out.print("Patlican Kac Kilo? : ");
        patlican*=scan.nextDouble();

        toplamTutar= armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar : " + toplamTutar);



    }
}
