package K07_operatorler;

public class C02_AndOperatoru {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Eger sonuca odakli bir islem yapiyorsak
        // ilk false bulundugunda genel sonuc false olacagindan
        // geriye kalan islemleri yapmaya gerek KALMAZ
        // boylece islem HIZLI yapilmis olur

        boolean genelSonuc1 = a>=b     &&   a<b     &&      a>b-8 ;

        System.out.println(genelSonuc1); //


        boolean genelSonuc2 = a>=b     &   a<b     &      a>b-8 ;

        System.out.println(genelSonuc2); //



        // bazen 2. ve 3.islemlerde atamalar olabilir
        // eger o islemler yapilmazsa atamalar da yapilmamis olur
        // bu durumda sonuc yine false olsa da
        // tum islemlerin yapilmasini isteriz
        // bunun icin & kullanmayi tercih ederiz


        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;

        System.out.println(genelSonuc); // false
        System.out.println(sonuc1); // false
        System.out.println(sonuc2); // true
        System.out.println(sonuc3); // false




        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6=true;

        boolean genelSonuc3 =  (sonuc4= a>=b)     &&  (sonuc5 = a<b)     &&      (sonuc6=a>b-8) ;

        System.out.println(genelSonuc3); // false
        System.out.println(sonuc4); // false
        System.out.println(sonuc5); // true  HIC BAKMADI BILE
        System.out.println(sonuc6); // true  HIC BAKMADI BILE


    }
}
