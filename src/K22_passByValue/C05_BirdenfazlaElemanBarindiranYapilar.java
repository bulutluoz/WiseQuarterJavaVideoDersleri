package K22_passByValue;

import java.util.Arrays;
import java.util.Random;

public class C05_BirdenfazlaElemanBarindiranYapilar {

    public static void main(String[] args) {
        /*
            Java'da array ve arrayList gibi birden fazla element barindiran yapilarda
            java method'da yapilan degisklikligin
            element'lere mi yoksa array/arrayList'in kendisine mi yapildigina bakar

            Elementler degisti ise Java bu degisikligi kabullenir, hata vermez
            AMMA array veya arrayList'in kendisine atama yapilirsa
            bu degisikligi kabul etmez,
            main method'da olusturulan halini kullanir
         */

        int[] arr = {3,5,6};

        arr[1] = 8 ; // elementlerden birine atama var

        System.out.println(Arrays.toString(arr)); // [3, 8, 6]

        int[] yeniArr = {2,5,7};

        arr = yeniArr; // arr'nin kendisine atama var

        System.out.println(Arrays.toString(arr)); // [2, 5, 7]


        // array'in elementlerini birer artirip son halini yazdiran bir method olusturun

        elementleriBirArtir(arr); // method'da Elemanlari artirdim : [3, 6, 8]

        System.out.println("main method'da arr : " + Arrays.toString(arr)); // [3, 6, 8]
        // method'da arr'nin kendisine atama oldu mu? HAYIR
        // o zaman elemnt degisimleri kabulumuzdur

        elementleriBirArtir(arr); // method'da Elemanlari artirdim : [4, 7, 9]

        System.out.println("main method'da arr : " + Arrays.toString(arr)); // [4, 7, 9]



        // array'e 5 uzunlugunda ve icinde 100'den kucuk rastgele pozitif sayilar bulunan
        // yeni bir array atayip array'i yazdiran method olusturun

        yeniArrAta(arr); //  yeni arr atadim : [69, 66, 46, 28, 46]

        System.out.println("main method'da arr : " + Arrays.toString(arr)); // [4, 7, 9]
        // method'da arr'nin kendisine atama oldu mu? EVET
        // Java PassByValue geregi yeni array'i kabul etmez

        yeniArrAta(arr); //  yeni arr atadim : [95, 91, 51, 93, 58]

        System.out.println("main method'da arr : " + Arrays.toString(arr)); // [4, 7, 9]


        yeniArrAta(arr); //  yeni arr atadim : [80, 50, 68, 81, 84]

        System.out.println("main method'da arr : " + Arrays.toString(arr)); // [4, 7, 9]


    }

    public static void elementleriBirArtir(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 1 ;
        }
        System.out.println("Elemanlari artirdim : " + Arrays.toString(arr));
    }

    public static void yeniArrAta(int[] arr){

        int[] yeniArr = new int[5];

        Random random = new Random();

        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i] = random.nextInt(100);
        }

        arr = yeniArr;

        System.out.println("yeni arr atadim : " + Arrays.toString(arr));

    }


}
