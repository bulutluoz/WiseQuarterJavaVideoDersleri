package K17_arrays.D03_multiDimensionalArrays;

import java.util.Arrays;

public class C06_AyniIndexdekiSayilariTopla {

    public static void main(String[] args) {


        // Verilen 2 katli ve 2 inner array'e sahip bir int array’de
        // ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.

        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	    output:                       [5, 7, 11]



        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        int ortakIndexSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length ;


        int[] ortakIndexdekisayilarinToplamiArr = new int[ortakIndexSayisi]; // [0, 0, 0]


        for (int i = 0; i <ortakIndexdekisayilarinToplamiArr.length ; i++) {

            ortakIndexdekisayilarinToplamiArr[i]  = arr[0][i]+arr[1][i];

        }

        System.out.println(Arrays.toString( ortakIndexdekisayilarinToplamiArr)); // [5, 7, 11]






    }
}
