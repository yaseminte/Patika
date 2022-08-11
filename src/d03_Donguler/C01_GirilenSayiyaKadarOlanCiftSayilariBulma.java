package d03_Donguler;

import java.util.Scanner;

public class C01_GirilenSayiyaKadarOlanCiftSayilariBulma {
    public static void main(String[] args) {
        //Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

       for (int i = 1; i <=sayi ; i++) {
            if (i%2==0){
                System.out.print(i + "-");
            }
        }



       /* int i =1;
        while (i<=sayi){
            if (i%2==0){
                System.out.println(i);
            }i++;
        }

        */


    }
}
