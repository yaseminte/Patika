package d03_Donguler;

import java.util.Scanner;

public class C21_FibonacciNO {
    public static void main(String[] args) {
        /*
        Java döngüler ile fibonacci serisi bulan program yazıyoruz.
        Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan
        bir dizi elde edilir.

        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
        Her rakam, bir önceki rakamla toplanır.
        Elde edilen sonuç rakamın sağ tarafına yazılır.
        Fibonacci dizisinin ilk on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        0 + 1 = 1
        1 + 1 = 2
        1 + 2 = 3
        2 + 3 = 5
        3 + 5 = 8
        5 + 8 = 13
        13 + 8 = 21
        21 + 8 = 34
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayisini giriniz : ");
        int n = scan.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;

        String fibonacci = "0 1 ";
        System.out.println(fibonacci.length());


        for (int i = 0; i <= n; i++) {
            sayi3 = sayi1 + sayi2;
            fibonacci += sayi3 + " ";
            sayi1 = sayi2;
            sayi2 = sayi3;
            if (fibonacci.length() == n*2) {
                break;
            }
        }
        System.out.println(n + " elemanli fibonacci serisi : " + fibonacci);
    }
}
