package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E10_UcakBileti {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Gideceginiz mesafeyi (KM) giriniz : " );
        int mesafe= scan.nextInt();
        System.out.print("Yasinizi Giriniz :");
        int yas=scan.nextInt();
        System.out.println("1 => Tek Yön , 2 => Gidiş Dönüş");
        int yolculukTipi=scan.nextInt();

        if (mesafe>0 && yas>0){

            double normalTutar;
            double yasIndirimi;
            double indirimliTutar = 0;
            double gidisDonusIndirim=0;
            double toplamTutar=0;

            switch (yolculukTipi){
                case 1:
                    normalTutar = mesafe * 0.1;
                    if (yas>0 && yas<=12){
                        yasIndirimi= normalTutar* 0.5;
                        indirimliTutar=normalTutar-yasIndirimi;
                    }else if (yas>12 && yas<=24){
                        yasIndirimi=normalTutar*0.1;
                        indirimliTutar=normalTutar-yasIndirimi;
                    }else if (yas>24 && yas<65){
                        indirimliTutar=normalTutar;
                    }else if (yas>=65 && yas<100){
                        yasIndirimi=normalTutar*0.3;
                        indirimliTutar=normalTutar-yasIndirimi;
                    }else
                        System.out.println("Hatali yas girdiniz!");

                    System.out.println("indirimliTutar = " + indirimliTutar);
                    break;
                case 2:
                    normalTutar = mesafe * 0.1;
                    if (yas>0 && yas<=12){
                        yasIndirimi= normalTutar* 0.5;
                        indirimliTutar=normalTutar-yasIndirimi;
                        gidisDonusIndirim=indirimliTutar*0.2;
                        toplamTutar=(indirimliTutar-gidisDonusIndirim)*2;
                    }else if (yas>12 && yas<=24){
                        yasIndirimi=normalTutar*0.1;
                        indirimliTutar=normalTutar-yasIndirimi;
                        gidisDonusIndirim=indirimliTutar*0.2;
                        toplamTutar=(indirimliTutar-gidisDonusIndirim)*2;
                    }else if (yas>24 && yas<65){
                        indirimliTutar=normalTutar;
                        gidisDonusIndirim=normalTutar*0.2;
                        toplamTutar=(indirimliTutar-gidisDonusIndirim)*2;
                    }else if (yas>=65 && yas<100){
                        yasIndirimi=normalTutar*0.3;
                        indirimliTutar=normalTutar-yasIndirimi;
                        gidisDonusIndirim=indirimliTutar*0.2;
                        toplamTutar=(indirimliTutar-gidisDonusIndirim)*2;
                    }else
                        System.out.println("Hatali yas girdiniz!");

                    System.out.println("toplamTutar = " + toplamTutar);
                    break;
                default:
                    System.out.println("Hatalı Secim Yaptiniz!");
            }
        }else
            System.out.println("Hatalı Veri Girdiniz!");

    }
}
