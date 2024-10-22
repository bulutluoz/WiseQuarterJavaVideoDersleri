package K19_forEachLoop;

public class C02_KarelerinToplami {

    public static void main(String[] args) {

        // Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int arr[] = {1,3,5,7,2,1,3};

        karelerinToplaminiYazdir(arr);


    }


    public static void karelerinToplaminiYazdir( int[] arr  ){

        int karelerinToplami = 0;

        for ( int each  : arr){

            karelerinToplami += each * each ;

        }

        System.out.println("Array'deki elementlerin kareleri toplami : " + karelerinToplami);

    }





}
