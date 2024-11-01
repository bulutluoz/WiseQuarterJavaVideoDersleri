package K25_varargs;

public class C01_Varargs {

    public static void main(String[] args) {

        topla(3,5); // 8
        topla(3,4,5); // 12
        topla(2,6,8); // 16
        topla(1,2,3,4); // 10
        topla(1,2,3,4,5); // 15
        topla(1,2,3,4,5,6); // 21
        topla(1,2,3,4,5,6,7); // 28
        topla(1,2,3,4,5,6,7,8); //36
        topla(1,2,3,4,5,6,7,8,9); // 45

        int[] sayilar = {1,2,3,4,5,6};
        topla(sayilar); // 21

        topla(45,67,32,-87,23,45,67); // 192


        /*
            varargs variety of arguments
            Java farkli sayida parametre yazmak yerine
            Array altyapisini kullanan Vararg olusturmustur

            vararg bir array oldugu icin
            parametreler ile ilgili hangi islem isteniyorsa
            array gibi kullanabilirsiniz
         */


    }

    public static void topla(int... sayilar){
        // sayilar array'indeki tum elementleri toplayalim

        int toplam = 0;

        for (int  each :sayilar){

            toplam += each;

        }

        System.out.println( sayilar.length + " adet sayinin tolami : " + toplam );

    }

    //public static void topla(int[] a){

        // bu method'u call edebilmek icin once argumentleri bir array olarak kaydetmelisiniz
    //}

    public static void topla(int a , int b){
        System.out.println("iki tamsayinin toplami : " + (a+b));
    }

    public static void topla(int a, int b, int c){
        System.out.println("uc tamsayinin toplami : " + (a+b+c));
    }

}
