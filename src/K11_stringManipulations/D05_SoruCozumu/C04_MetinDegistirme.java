package K11_stringManipulations.D05_SoruCozumu;

import java.util.Scanner;

public class C04_MetinDegistirme {

    public static void main(String[] args) {

        //  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        int uzunluk = metin.length();


        if ( uzunluk % 2 == 0){ // metnin uzunlugu cift
            //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,

            System.out.println(

                    metin.substring( 0,uzunluk/2 ) +
                    ":)" +
                    metin.substring(uzunluk/2)

            );

        }else{ // metnin uzunlugu tek
            //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

            System.out.println(

                    metin.substring(0,uzunluk/2) +
                    ":(" +
                    metin.substring(uzunluk/2+1)


            );


        }





    }
}
