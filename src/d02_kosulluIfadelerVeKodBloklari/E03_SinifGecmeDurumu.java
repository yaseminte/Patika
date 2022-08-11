package d02_kosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class E03_SinifGecmeDurumu {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        int mat, fizik, turkce, kimya, muzik;

        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik Notunuz : " );
        mat=scan.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik=scan.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce=scan.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya=scan.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik=scan.nextInt();

        if (mat<0 || mat>100){
            mat=0;
        }
        if (fizik<0 || fizik>100){
            fizik=0;
        }
        if (turkce<0 || turkce>100){
            turkce=0;
        }
        if (kimya<0 || kimya>100){
            kimya=0;
        }
        if (muzik<0 || muzik>100){
            muzik=0;
        }
        double avarage= (mat+fizik+turkce+kimya+muzik)/5;

        if (avarage<55){
            System.out.println("Sınıfta Kaldınız");
        }else
            System.out.println("Tebrikler sinifi gectiniz");

        System.out.println("Ortalamaniz : " + avarage);
    }
}
