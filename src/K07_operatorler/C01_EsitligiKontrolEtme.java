package K07_operatorler;

public class C01_EsitligiKontrolEtme {

    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 3;

        System.out.println(   a == b ); // 5 == 8 ==> false

        System.out.println( b == a+c ); // 8 == 8 ==> true

        System.out.println( b > c ); // 8 > 3 ==> true

        System.out.println( c > a ); // 3 > 5 ==> false

        System.out.println( a = b); // 8

        System.out.println( c = a-b ); // 0

        System.out.println( a != c); // 8 != 0 ==> true

        System.out.println( a != b ); // 8 != 8 ==> false

        System.out.println( a >= b ); // 8 >= 8 ==> true



        // char data turu matematiksel islemlerde
        // ASCII table'daki degerleri ile isleme girer
        // biz kucuk yerine once, buyuk yerine sonra diye dusunebiliriz

        System.out.println(   'a'  <= 'c'); // 97 < 99 ==> true

        System.out.println( 'a' == 'a'); // 97 == 97 ==> true

        System.out.println( 'b' != 'b'); // 98 != 98 ==> false

        System.out.println( 'd' != 'e'); // 100 != 101 ==> true




        // String'de ise == bekledigimiz sonuclari vermeyebilir

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;
        String s7 = new String("Ali");

        System.out.println( s1 == s2 ); // Ali == Ali ==> true
        System.out.println( s1 == s3 ); // Ali == Ali ==> true
        System.out.println( s1 == s6 ); // Ali == Ali ==> false
        System.out.println( s1 == s7 ); // Ali == Ali ==> false


        // SIMDILIK =='i String'leri karsilastirmak icin kullanmayacagiz
        // eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
        // equals() kullanmaliyiz

        System.out.println( s1.equals(s2) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s3) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s6) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s7) ); // Ali equals Ali ==> true

        System.out.println(s1.equals("ali")); // Ali equals ali ==> false
        System.out.println(s1.equals("ALI")); // Ali equals ALI ==> false
        System.out.println(s1.equals("Ali ")); // Ali equals Ali  ==> false yazilan "Ali " nin sonunda space karakteri var


    }
}
