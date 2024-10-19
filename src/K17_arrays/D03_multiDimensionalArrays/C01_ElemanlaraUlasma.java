package K17_arrays.D03_multiDimensionalArrays;

import java.util.Arrays;

public class C01_ElemanlaraUlasma {

    public static void main(String[] args) {


        /*
            Array'lerde herhangi bir yazdirma islemi yapacagimiz zaman
            ne yazdirdigimizi iyi bilmeliyiz
                - eger bir String veya primitive bir deger yazdiracaksak direkt sout
                - eger yazdirmak istedigimiz sey tek katli bir array ise Arrays.toString(arr[3])
                - eger yazdirmak istedigimiz sey multiDimensionalArray ise Arrays.deepToString(arr)
         */

        int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };





        System.out.println( arr[0][2]  ); // 7

        System.out.println(  arr[3][3]  ); // 6

        System.out.println( arr[1][0] ); // 3


        // 2 katli bir array'de inner array'i yazdirmak istersek

        System.out.println(  arr[0]  ); // [I@2752f6e2

        System.out.println(Arrays.toString( arr[0] )); // [2, 3, 7]

        System.out.println( Arrays.toString( arr[2])); // [4]

        //    arr[3][1] 'ini yazdir
        // once bunun bir int mi yoksa bir array mi oldugunu anlamamiz gerekir
        System.out.println( arr[3][1]); // 2


        // arr[1] 'i yazdir

        System.out.println( Arrays.toString(arr[1])); // [3, 5]



        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }


        System.out.println( arr );  //   [[I@e580929

        System.out.println( Arrays.toString(arr)); // [[I@2752f6e2, [I@1cd072a9, [I@7c75222b, [I@4c203ea1]

        System.out.println(Arrays.deepToString(arr)); // [[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]


    }


}
