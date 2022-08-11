package d04_methotlar;

import java.util.Scanner;

public class Q01_PalindromSayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        System.out.println("Girilen sayı palindrom mu ?  : " + palindromSayi(sayi));


    }

    private static boolean palindromSayi(int sayi) {

        boolean palindromMu = false;
        int temp = sayi;
        int terstenSayi = 0, sonRakam;

        while (temp != 0) {
            sonRakam = temp % 10;
            terstenSayi = (terstenSayi * 10) + sonRakam;
            temp /= 10;
        }

        if (sayi == terstenSayi) {
            return true;

        } else

            return false;
    }

}
