package d03_Donguler;

import java.util.Scanner;

public class C16_EbobEkokWhileIle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1, n2;
        int ebob = 0;
        int ekok = 0;

        boolean b = false;

        do {
            System.out.print("n1 sayisini giriniz : ");
            n1 = scan.nextInt();
            System.out.print("n2 sayisini giriniz : ");
            n2 = scan.nextInt();
            if (n1<=0 && n2<=0){
                System.out.println("Pozitif bir sayi giriniz : ");
            }else
                b=true;
        }while (!b);

        if (n1>n2){
            int tempN2 = n2;
            n1 = n2;
            n2 = tempN2;
        }
        int i = n1;
        while (i>=1){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                break;
            }
            i--;
        }

        ekok = (n1*n2)/ebob;

        System.out.println(n1 + " ve " + n2 + " sayisinin EBOB'u : " + ebob + " EKOK'u : " + ekok );


    }
}
