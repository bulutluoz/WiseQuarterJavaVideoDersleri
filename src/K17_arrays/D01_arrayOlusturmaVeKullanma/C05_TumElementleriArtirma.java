package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C05_TumElementleriArtirma {

    public static void main(String[] args) {
        // Verilen bir int array’in
        // tum elemanlarini 2 artirin

        int[] arr = {3,7,0,2,4,6};

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 2;

        }

        System.out.println(Arrays.toString(arr)); // [5, 9, 2, 4, 6, 8]


    }

    // Verilen bir int array’in
    // tum elemanlarini verilen sayi kadar artirip bize donduren bir method olusturun.
    // Eski array’i yeni haliyle kaydedin.


    public static int[] arrayinElemanlariniArtir( int[] arr , int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += artisMiktari;

        }

        return arr;
    }



}
