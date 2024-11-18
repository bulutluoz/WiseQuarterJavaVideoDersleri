package K33_exceptions.D02_MultipleUncheckedExceptions;

public class C02_MultipleTryCatch {

    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // verilen negatif olmayan bir sayiyi index olarak kabul edip
        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayiyi yazdirin
        // eger kullanici index'den buyuk sayi girerse
        // hata mesaji ve son index'i yazdirin

        int index = 6;

        if (index < 0 ){
            System.out.println("Index negatif olmamalidir");
        } else {
            // 1.yontem : ayri ayri try catch


                System.out.println(arr[index]); // ArrayIndexOutOfBoundsException


                System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException



        }// else sonu









    }
}
