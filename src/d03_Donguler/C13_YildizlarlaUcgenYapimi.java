package d03_Donguler;

public class C13_YildizlarlaUcgenYapimi {
    public static void main(String[] args) {
        //Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.
        //Ödev
        //Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

        int n = 4;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i,j,k;//Değişekenlerimizi tanımladık.

        for (i=1; i<10; i++) {//Döngümüzün ne kadar döneceğini belirtir.

            for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("* ");//Sembolümüzü belirledik ve çıktısını sağladık.
                // System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }
    }
}
