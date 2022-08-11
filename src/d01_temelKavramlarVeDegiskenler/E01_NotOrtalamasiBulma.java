package d01_temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class E01_NotOrtalamasiBulma {
    public static void main(String[] args) {

        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
        60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
         */

        double mat, fizik, kimya, turkce, tarih, muzik, avarage;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat=scan.nextDouble();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=scan.nextDouble();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya=scan.nextDouble();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce=scan.nextDouble();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih=scan.nextDouble();

        System.out.print("Muzik Notunuzu Giriniz: ");
        muzik=scan.nextDouble();

        avarage= (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Not Ortalamaniz : " + avarage);

        System.out.println(avarage>=60 ? "Sinifi Gecti" : "Sinifta Kaldi");


    }
}
