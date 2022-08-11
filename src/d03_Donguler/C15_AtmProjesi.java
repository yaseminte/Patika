package d03_Donguler;

import java.util.Scanner;

public class C15_AtmProjesi {
    //Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
    public static void main(String[] args) {

        String kullaniciAdi, sifre;
        Scanner scan = new Scanner(System.in);

        int hak = 3;
        double bakiye = 1500;
        int islem = 0;

        while (hak > 0) {

            System.out.print("Kullanıcı Adınız : ");
            kullaniciAdi = scan.nextLine();
            System.out.print("Sifreniz :");
            sifre = scan.nextLine();

            if (kullaniciAdi.equals("yasemin") && sifre.equals("y123")) {
                System.out.println("***Merhaba Z Bankası'na Hoşgeldiniz***");

                do {

                    System.out.println("\n1-Para Yatırma \n2-Para Çekme \n3-Bakiye Sorgulama \n4-Çıkış");
                    System.out.print("Lutfen işlem seçiniz : ");
                    islem = scan.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.print("Yatıracağınız tutarı giriniz : ");
                            bakiye += scan.nextDouble();
                            System.out.print("Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekeceğiniz Tutarı Giriniz : ");
                            int tutar = scan.nextInt();
                            if (tutar > bakiye) {
                                System.out.println("Bakiyeniz yetersiz");
                            } else {
                                bakiye -= tutar;
                                System.out.print("Bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }

                } while (islem != 4);
                System.out.println("Çıkışınız Yapıldı.Tekrar Görüşmek Üzere...");
                break;
            } else {
                hak--;
                System.out.println("Kullanıcı adı veya parolanız hatalı \nKalan hakkınız : " + hak);
                if (hak == 0) {
                    System.out.println("Kartınız bloke olmuştur. Banka ile iletişime geçiniz!");
                    break;
                }
            }
        }
    }
}
