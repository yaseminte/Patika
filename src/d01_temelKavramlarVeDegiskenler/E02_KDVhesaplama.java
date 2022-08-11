package d01_temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class E02_KDVhesaplama {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp
        ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        double tutar, kdvOran, kdvTutar, kdvliFiyat, kdvsizFiyat;
        boolean kdvDegiskeni;

        Scanner scan=new Scanner(System.in);
        System.out.print("Tutarı giriniz : ");
        tutar=scan.nextDouble();

        kdvDegiskeni=(0<tutar) &&(1000>tutar);
        kdvOran=kdvDegiskeni ? 0.18 : 0.08;

        kdvTutar=tutar*kdvOran;
        kdvliFiyat=tutar+kdvTutar;

        System.out.println("KDV'siz Fiyat : " + tutar);
        System.out.println("KDV'li Fiyat : " + kdvliFiyat);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV Orani : " + kdvOran);


    }
}
