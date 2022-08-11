package d01_temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class E06_VucutKitleIndeksiHesaplama {
    /*
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    Formül
    Kilo (kg) / Boy(m) * Boy(m)
    Çıktısı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173
     */

     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.print("Boyunuzu giriniz : " );
         double boy=scan.nextDouble();
         System.out.print("Kilonuzu giriniz : " );
         double kilo= scan.nextDouble();

         double vke= kilo / boy * boy ;

         System.out.println("Vucut Kitle Indeksiniz : " + vke);
    }
}
