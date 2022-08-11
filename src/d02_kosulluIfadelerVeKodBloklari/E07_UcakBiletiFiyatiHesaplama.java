package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E07_UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        İpucu
        Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
        Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
        İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
        Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
        Toplam Tutar = (135-27)* 2 = 216 TL

        Senaryolar
        Senaryo 1
        Mesafeyi km türünden giriniz : 1500
        Yaşınızı giriniz : 20
        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
        Toplam Tutar = 216 TL

        Senaryo 2
        Mesafeyi km türünden giriniz : -500
        Yaşınızı giriniz : 1
        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
        Hatalı Veri Girdiniz !

        Senaryo 3
        Mesafeyi km türünden giriniz : 200
        Yaşınızı giriniz : 35
        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş -->1
        Toplam Tutar = 20.0 TL
        */

        double perKm = 0.10;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gideceginiz mesafeyi km cinsinden giriniz : ");
        int mesafe = scan.nextInt();

        System.out.print("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("Yolculuk Tipini Seciniz :\n1-Tek Yon\n2-Gidis-Donus");
        int yolculukTipi = scan.nextInt();


        if (mesafe <= 0 || yas <= 0 || yolculukTipi < 1 || yolculukTipi > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        double normalFiyat = mesafe * perKm;
        double cocukBiletFiyati = (normalFiyat * 0.50);
        double gencBiletIndirim = (normalFiyat * 0.10);
        double gencBiletFiyati = (normalFiyat - gencBiletIndirim);
        double yasliBiletIndirim = (normalFiyat * 0.30);
        double yasliBiletFiyatı = (normalFiyat - yasliBiletIndirim);

        switch (yolculukTipi) {
            case 1:
                if (yas <= 12) {
                    System.out.println("Toplam Tutar : " + cocukBiletFiyati);
                } else if (yas < 25) {
                    System.out.println("Toplam Tutar : " + (gencBiletFiyati));
                } else if (yas < 65) {
                    System.out.println("Toplam Tutar : " + normalFiyat);
                } else if (yas <= 125)
                    System.out.println("Toplam Tutar : " + (yasliBiletFiyatı));
                else
                    System.out.println("Hatali veri girdiniz!");
                break;

            case 2:
                double gidisDonusIndirim;
                double gidisDonusFiyati;
                if (yas <= 12) {
                    gidisDonusIndirim = cocukBiletFiyati * 0.20;
                    gidisDonusFiyati = ( gidisDonusIndirim * 2);
                    System.out.println("Gidis-Donüs Toplam Fiyat : " + gidisDonusFiyati);

                } else if (yas < 25) {
                    gidisDonusIndirim = gencBiletFiyati * 0.20;
                    gidisDonusFiyati = (gencBiletFiyati - gidisDonusIndirim) * 2;
                    System.out.println("Gidis-Donüs Toplam Fiyat : " + gidisDonusFiyati);

                } else if (yas < 65) {
                   gidisDonusIndirim = normalFiyat * 0.20;
                   gidisDonusFiyati = (normalFiyat - gidisDonusIndirim) * 2;
                    System.out.println("Gidis-Donüs Toplam Fiyat : " + gidisDonusFiyati);

                } else if (yas < 125) {
                    gidisDonusIndirim = yasliBiletFiyatı * 0.20;
                    gidisDonusFiyati = (yasliBiletFiyatı - gidisDonusIndirim) * 2;
                    System.out.println("Gidis-Donüs Toplam Fiyat : " + gidisDonusFiyati);

                } else
                    System.out.println("Hatali veri girdiniz!");

                break;

        }
    }
}

