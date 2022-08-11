package d03_Donguler;

import java.util.Scanner;

public class C05_IkininKuvvetiniBulanProgram {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : " );
        int n = scan.nextInt();

        for (int i = 1; i <=n ; i+=i) {
            System.out.println(i);
        }

    }
}
