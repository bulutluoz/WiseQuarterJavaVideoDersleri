package K17_arrays.D02_arraysClassMethodlari;

import java.util.Arrays;

public class C05_ArrayeYeniElemanEkleme {


    public static void main(String[] args) {

        int[] sayilar = {3,5,6};

        // sayilar array'ine 4.eleman olarak 8'i ekleyin


        sayilar = arrayeElemanEkle(sayilar,8);

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 6, 8]


        sayilar = arrayeElemanEkle(sayilar,10);

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 6, 8, 10]

    }



    // Verilen int bir array'e istenen bir elemani ekleyip
    // son halini donduren bir method olusturun

    public static int[] arrayeElemanEkle( int[] arr , int eklenecekEleman){

        //  arr = {3,5,6}

        int[] yeniArr = new int[ arr.length+1]; // [0, 0, 0 ,0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        } // [3, 5, 6, 0]

        yeniArr[yeniArr.length-1] = eklenecekEleman; // [3, 5, 6, 8]

        arr = yeniArr;

        return arr;

    }




}
