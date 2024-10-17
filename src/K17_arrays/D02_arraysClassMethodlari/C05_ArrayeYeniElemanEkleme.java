package K17_arrays.D02_arraysClassMethodlari;

import java.util.Arrays;

public class C05_ArrayeYeniElemanEkleme {


    public static void main(String[] args) {

        int[] sayilar = {3,5,6,2,1};
        // sayilar array'ine 8 ekleyin

        sayilar = arrayeElemanEkle(sayilar,8);

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 6, 2, 1, 8]


        sayilar = arrayeElemanEkle(sayilar,9);

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 6, 2, 1, 8, 9]



    }



    // Verilen int bir array'e istenen bir elemani ekleyip
    // son halini donduren bir method olusturun

    public static int[] arrayeElemanEkle(int[] arr , int eklenecekSayi){

        // ornek arr = {3,5,6,2,1}

        int[] yeniArr = new int[arr.length+1]; // [0, 0, 0, 0, 0, 0]


        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];

        } // [3, 5, 6, 2, 1, 0]

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        // [3, 5, 6, 2, 1, 8]

        arr = yeniArr;

        return arr;

    }






}
