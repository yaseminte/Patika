package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E04_HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        //Koşullar :
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int heat;
        Scanner scan=new Scanner(System.in);
        System.out.print("Hava sicaklik degerini giriniz : ");
        heat=scan.nextInt();

        if (heat<5){
            System.out.println("Kayak Yapabilirsin.");
        }else if (heat<25){
            if (heat<15){
                System.out.println("Sinemaya Gidebilirsin.");
            }
            if (heat>10){
                System.out.println("Piknik Yapabilirsin.");
            }
        }else
            System.out.println("Yuzmeye gidebilirsin.");
    }
}
