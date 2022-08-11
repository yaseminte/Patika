package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E02_KullaniciAdiVeSifre {
    public static void main(String[] args) {

        /*
        Kullanicidan kullanici adini ve parolasini girmesini isteyin
        Kullanici adi ve şifreyi (koşul olarak if içerisinde siz belirleyin)
        Eger kullanıcı adı ve şifre uyumlu ise ekrana "Girisiniz Yapıldı" yazdırın
        Diger durumda "Hatali giris yaptiniz!
                      Sifrenizi sifirlamak isterseniz 'evet' istemezseniz 'hayır' yazın  " mesajını verin
        Kullanici 'hayir' derse ekrana "Giris sonlandirildi!" yazdirin
        Kullanici 'evet' derse ekrana "Sifreniz eski sifreniz ile ayni olmamali!
                                       Yeni sifrenizi Giriniz :" yazdirin
        Farkli bir yanit girdiginde ekrana "Hatali secim yaptınız!" yazdirin
        Kullanicinin olusturdugu yeni sifre eski sifresiyle ayni olursa konsola
        "Sifreniz eski sifreniz ile ayni olamaz !" yazdirin
        Diger durumda ekrana "Yeni sifreniz basariyla olusturuldu !" yazdirin
         */

        String userName, password;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz : ");
        userName = scan.nextLine();

        System.out.print("Sifrenizi Giriniz : ");
        password = scan.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))) {
            System.out.println("**** Girisiniz Yapildi! ****");
        } else
            System.out.println("Hatali giris yaptiniz!\nSifrenizi sifirlamak isterseniz 'evet'" +
                    "\nistemezseniz 'hayır' yazın  ");
        String reset = scan.nextLine().toLowerCase();

        if (reset.equals("hayır")) {
            System.out.println("*** Giris sonlandirildi! ***");
        } else if (reset.equals("evet")) {
            System.out.print("Sifreniz eski sifreniz ile ayni olmamali!\nYeni sifrenizi Giriniz : ");
            String newPassword = scan.nextLine();

            if (newPassword.equals("java123")) {

                System.out.println("Sifreniz eski sifreniz ile ayni olamaz !");
            } else
                System.out.println("*** Yeni sifreniz basariyla olusturuldu ! ***");

        } else
            System.out.println("Hatali secim yaptınız!");
    }
}



