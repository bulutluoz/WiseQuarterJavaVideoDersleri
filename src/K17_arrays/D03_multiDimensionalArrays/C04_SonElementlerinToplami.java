package K17_arrays.D03_multiDimensionalArrays;

public class C04_SonElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini
        // yazdiran bir method olusturun.

        int[][] arr = { {2,3,7,1,2,4},{3,5,1,2,1},{4,1,2,3},{1,2,3,6,8,1,2,1},{2,0} };



        sonElementleriTopla(arr);

    }

    public static void sonElementleriTopla(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

           toplam += arr[i][arr[i].length-1] ;

        }


        System.out.println("Son elementlerin toplami : " + toplam);



    }
}








