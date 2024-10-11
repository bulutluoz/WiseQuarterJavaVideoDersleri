package K15_doWhileLoop;

public class C01_whileLoopVsDoWhileLoop {

    public static void main(String[] args) {

        /*
            While loop da condition kontrolu
            loop body'den daha fazla calisir

            do-while loop'da
            condition kontrol sayisi ile
            loop body calisma sayisi aynidir.
         */


        // 1'den 5'e kadar(5 haric) olan sayilari yazdirin


        // while loop
        int sayi = 1;

        while ( sayi < 5){

            System.out.print(sayi + " ");
            sayi++;

        }

        System.out.println("");

        // do while loop ile

        sayi = 1;




        do {

            System.out.print(sayi + " ");
            sayi++;

        }while (sayi < 5 );





    }
}
