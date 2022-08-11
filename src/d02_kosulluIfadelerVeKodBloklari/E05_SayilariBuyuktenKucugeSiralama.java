package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E05_SayilariBuyuktenKucugeSiralama {

    public static void main(String[] args) {

        // Ödev
        //Girilen 3 sayıyı "kucukten buyuge" sıralayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayi : ");
        int x = scan.nextInt();

        System.out.print("2.Sayi : ");
        int y = scan.nextInt();

        System.out.print("3. Sayi : ");
        int z = scan.nextInt();

       if ((x<y) && (x<z)){
           if (y<z){
               System.out.println("x<y<z");
           }else
               System.out.println("x<z<y");
       }else if ((y<x)&& (y<z)){
           if (x<z){
               System.out.println("y<x<z");
           }else
               System.out.println("y<z<x");
       }else
           if (x<y){
               System.out.println("z<x<y");
           }else
               System.out.println("z<y<x");
    }
}
