package K33_exceptions.D02_MultipleUncheckedExceptions;

public class C03_TekTryMultipleCatch {

    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // verilen negatif olmayan bir sayiyi index olarak kabul edip
        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayiyi yazdirin
        // eger kullanici index'den buyuk sayi girerse
        // hata mesaji ve son index'i yazdirin

        int index = 26;

        if (index < 0 ){
            System.out.println("Index negatif olmamalidir");
        } else {

             //2.yontem : tek try multiple catch
             /*
                iki yontem de hatayi yakalar
                asil amac kodun exception vermeden calismaya devam etmesi ise ikisi de olur
                ama 1.yontem HATA AYIKLAMA icin daha elverisli
              */




                System.out.println(arr[index]);
                System.out.println(str.charAt(index));




        }// else sonu









    }
}
