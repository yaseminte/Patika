package d01_temelKavramlarVeDegiskenler;

import java.util.Scanner;

public class E05_DaireninAlaniVeCevresi {
    public static void main(String[] args) {

        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        //Alan Formülü : π * r * r;
        //Çevre Formülü : 2 * π * r;
        //Ödev
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r;
        double pi=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz : " );
        r=scan.nextInt();

        double alan= (pi*r*r);
        double cevre= (2*pi*r);
        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);

        //Merkez açısı verilen daire parçasının alanı
        System.out.print("Merkez açısını giriniz : ");
        double a=scan.nextDouble();
        double merkezAlan= ((Math.PI*(r*r) * a)/360);
        System.out.print("Merkez Açısının Alanı : " + merkezAlan);


    }
}
