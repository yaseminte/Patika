package d03_Donguler;

import java.util.Scanner;

public class C06_DortVeBesinKuvvetiiniBulma {
    public static void main(String[] args) {
        // Ödev
        // Java döngüler ile girilen sayıya kadar olan
        // 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Girin :");
        int n = scan.nextInt();

        for (int i = 1; i <=n ; i*=4) {
            System.out.println(i);
        }

        System.out.println("*****");


        for (int i = 1; i <=n ; i*=5) {
            System.out.println(i);
        }


    }
}
