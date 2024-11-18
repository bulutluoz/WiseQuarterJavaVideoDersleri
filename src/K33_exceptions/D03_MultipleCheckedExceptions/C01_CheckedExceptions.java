package K33_exceptions.D03_MultipleCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {


    public static void main(String[] args) {
        /*
            Exceptions temel olarak 2'ye ayrilir

            Run Time'da ortaya cikan exception'lar  RunTimeExceptions, UnCheckedExceptions
                StringIndexOutOfBoundsException
                ArrayIndexOutOfBoundsException
                ArithmeticException

            Compile Time sirasinda farkedilenler    CheckedExceptions


            Biz bugune kadar alti kirmizi cizgili olan herseye CTE Compile Time Error
            Ammmaaa alti kirmizi olan her kod hata degildir

            Ozellikle dosya okuma ve yazma islemlerinde
            Java exception olasiligini compile time'da kontrol edip
            bize uyari verir

            Unhandled exception: java.io.FileNotFoundException
         */

        // String str = 24; String variable'a int deger atamak istiyorsun

        int sayi1 = 34;

        double dbl = sayi1;

        short shr = (short) sayi1; // short variable'a int deger atayamazsin

        for (int i = 0; i <20 ; i++) {
            String str2 = "";
        }

        // System.out.println(i);  scope uygun degil
        // System.out.println(str2);  scope uygun degil


        int sayi3;

        // System.out.println(sayi3); // sayi3'e deger atanmamis olabilir , Variable 'sayi3' might not have been initialized


        String str3 = null;

        // System.out.println(str3.toLowerCase());
        // NullPointerException, null olarak isaretlenen bir variable, yazdirma disinda kullanilamaz

        int a = 23;
        int b = 0;

        // System.out.println(a/b); // 23 / 0  ArithmeticException


        String str5 = "Ali can";

        // System.out.println(str5.charAt(20)); // StringIndexOutOfBoundsException


        try {

            FileInputStream fileInputStream = new FileInputStream("src/K33_exceptions/D03_MultipleCheckedExceptions/DersNotlari.txt");

        }catch (FileNotFoundException e){

            System.out.println("Dosya yolu hatali");
            e.printStackTrace();

        }
        // Unhandled exception: java.io.FileNotFoundException

    }
}
