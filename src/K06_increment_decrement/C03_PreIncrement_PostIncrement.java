package K06_increment_decrement;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {


        int a = 20;

        // a'nin degerini olusturdugunuz bir b variable'ina atayin
        // sonra a'yi bir artirin

        int b = a;
        a++;

        System.out.println("16.satirda a: " + a + " , b : " + b ); // a: 21 , b : 20




        int c = 20;

        // once c'yi 1 artirin
        // sonra c'nin degerini olusturdugunuz bir d variable'ina atayin

        c++;

        int d = c;



        System.out.println("37.satirda c: " + c + " , d : " + d ); // c: 21 , d : 21


        // Ayni islemleri ++ ile yapalim

        a = 20;

        // a'nin degerini b variable'ina atayin
        // sonra a'yi bir artirin

        b = a++;


        System.out.println("45.satirda a: " + a + " , b : " + b ); // a: 21 , b : 20


        c = 20;

        // once c'yi 1 artirin
        // sonra c'nin degerini d variable'ina atayin


        d = ++c;


        System.out.println("57.satirda c: " + c + " , d : " + d ); // c: 21 , d : 21




    }
}
