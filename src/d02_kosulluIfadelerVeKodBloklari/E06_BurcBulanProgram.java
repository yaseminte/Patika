package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E06_BurcBulanProgram {
    public static void main(String[] args) {
    /*
    Burc bulan program yaziniz.

    Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
     */

        String burc="";
        boolean isErr = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kacinci ayda dogdunuz : ");
        int month = scan.nextInt();

        System.out.print("Hangi gun dogdunuz : ");
        int day = scan.nextInt();

        switch (month) {
            case 1 :
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="Oglak";
                    }else {
                        burc = "Kova";
                    }
                }else
                    isErr=true;
                break;
            case 2:
                if (day>=1 && day<=28){
                    if (day<20){
                        burc="Kova";
                    }else
                        burc="Balik";
                }else
                    isErr=true;
                break;
            case 3:
                if (day>=1 && day<=31){
                    if (day<21){
                        burc="Balik";
                    }else
                        burc="Koc";
                }else
                    isErr=true;
                break;
            case 4:
                if (day>=1 && day<=30){
                    if (day<21){
                        burc="Koc";
                    }else
                        burc="Boga";
                }else
                    isErr=true;
                break;
            case 5:
                if (day>=1 && day<=31){
                   if (day<22){
                       burc="Boga";
                   }else
                       burc="Ikizler";
                }else
                    isErr=true;
                break;
            case 6:
                if (day>=1 && day<=30){
                    if (day<23){
                        burc="Ikizler";
                    }else
                        burc="Yengec";
                }else
                    isErr=true;
                break;
            case 7:
                if (day>=1 && day<=31){
                    if (day<23){
                        burc="Yengec";
                    }else
                        burc="Aslan";
                }else
                    isErr=true;
                break;
            case 8:
                if (day>=1 && day<=31){
                    if (day<23){
                        burc="Aslan";
                    }else
                        burc="Basak";
                }else
                    isErr=true;
                break;
            case 9:
                if (day>=1 && day<=30){
                    if (day<23){
                        burc="Basak";
                    }else
                        burc="Terazi";
                }else
                    isErr=true;
                break;
            case 10:
                if (day>=1 && day<=31){
                    if (day<23){
                        burc="Terazi";
                    }else
                        burc="Akrep";
                }else
                    isErr=true;
                break;
            case 11:
                if (day>=1 && day<=30){
                    if (day<23){
                        burc="Akrep";
                    }else
                        burc="Yay";
                }else
                    isErr=true;
                break;
            case 12:
                if (day>=1 && day<=31){
                    if (day<22){
                        burc="Yay";
                    }else
                        burc="Oglak";
                }else
                    isErr=true;
                break;
            default:
                isErr=true;

        }
        if (isErr){
            System.out.println("Hatali Giris Yaptiniz!");
        }else
            System.out.println("Burcunuz : " + burc);


    }
}
