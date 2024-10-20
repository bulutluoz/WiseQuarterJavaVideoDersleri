package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenSayilarListesi {

    public static void main(String[] args) {

        System.out.println(pozitifTamBolenlerListesi(50)); // [1, 2, 5, 10, 25, 50]

        System.out.println(pozitifTamBolenlerListesi(80)); // [1, 2, 4, 5, 8, 10, 16, 20, 40, 80]



        /*
                tamBolenlerListesi method'unu kullanarak
                2 basamakli asal sayilari yazdirin
         */


        for (int i = 10; i <100 ; i++) {

            int tamBolenSayisi = pozitifTamBolenlerListesi(i).size();


            if (tamBolenSayisi  == 2){
                System.out.print(i + " ");
            }

        }



    }


    // Soru 6- Verilen pozitif bir tamsayiyi,
    //         tam bolebilen tum pozitif tamsayilari bir liste olarak
    //         bize donduren bir method olusturun.

    public static List<Integer> pozitifTamBolenlerListesi (int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();


        for (int i = 1; i <=sayi ; i++) {

            if ( sayi % i == 0){
                tamBolenlerListesi.add(i);
            }

        }

        return tamBolenlerListesi;

    }



}
