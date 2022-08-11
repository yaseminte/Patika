package d02_kosulluIfadelerVeKodBloklari;

public class KarsilastirmaOperatoru {
    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;

        // == (Esitlik Operatoru)

        System.out.println(A == B); //false
        System.out.println(A == C); //true
        System.out.println(A == D); //false
        System.out.println(B == C); //false
        System.out.println(B == D); //false
        System.out.println(C == D); //false

        // != (Esit Degil Operatoru)

        System.out.println(A != B); //true
        System.out.println(A != C); //false
        System.out.println(A != D); //true
        System.out.println(B != C); //true
        System.out.println(B != D); //true
        System.out.println(C != D); //true

        // > (Buyuktur Operataoru)

        System.out.println(A > B); //false
        System.out.println(A > C); //true
        System.out.println(A > D); //false
        System.out.println(B > C); //true
        System.out.println(B > D); //false
        System.out.println(C > D); //false

        // >= (Buyuk Esit Operataoru)

        System.out.println(A >= B); //false
        System.out.println(A >= C); //false
        System.out.println(A >= D); //false
        System.out.println(B >= C); //true
        System.out.println(B >= D); //false
        System.out.println(C >= D); //false

        // < (Kucuktur Operataoru)

        System.out.println(A < B); //true
        System.out.println(A < C); //false
        System.out.println(A < D); //true
        System.out.println(B < C); //false
        System.out.println(B < D); //true
        System.out.println(C < D); //true

        // <= (Kucuk Esit Operataoru)

        System.out.println(A <= B); //true
        System.out.println(A <= C); //true
        System.out.println(A <= D); //true
        System.out.println(B <= C); //false
        System.out.println(B <= D); //true
        System.out.println(C <= D); //true


    }
}
