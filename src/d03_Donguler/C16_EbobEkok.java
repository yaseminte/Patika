package d03_Donguler;

import java.util.Scanner;

public class C16_EbobEkok {
    public static void main(String[] args) {
        /*
        Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
        EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
        ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
        18’in bölenleri : 1, 2, 3, 6, 9, 18
        24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
        Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
        EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
        ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
        6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
        8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
        Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
        EKOK = (n1*n2) / EBOB
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayisini giriniz : ");
        int n2 = scan.nextInt();
        int ebob = 0;
        int ekok ;

        if (n2>n1){ // eger ilk girilen sayi 2. sayidan kücükse

            // ebob
            for (int i = n1; i >= 1  ; i--) {
                if (n1%i==0 && n2%i==0){
                    ebob = i;
                    break;
                }
            }
            System.out.println("Ebob : " + ebob );

            // ekok

            System.out.println("Ekok : " + (n1*n2)/ebob);
        }
        else { // ilk girilen sayi 2. girilen sayidan buyukse
            // ebob
            for (int i = n2; i >= 1  ; i--) {
                if (n1%i==0 && n2%i==0){
                    ebob = i;
                    break;
                }
            }
            System.out.println("Ebob : " + ebob );

            // ekok

            System.out.println("Ekok : " + (n1*n2)/ebob);
        }
    }
}
