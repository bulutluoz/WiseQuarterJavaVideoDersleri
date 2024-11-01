package K25_varargs;

public class C03_VarargsDikkatEdilecekler {

    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // sonuncusu haric geriye kalanlari toplayip
        // bulunan toplam deger ile son sayinin carpimini yazdiran
        // bir method olusturun
        /*
            Vararg parameter must be the last in the list
            vararg bir parametre varsa, SON PARAMETRE olmak ZORUNDADIR
            vararg element almada sinir tanimaz, tum elementleri almak ister
         */

        /*
            varargs'a hic eleman atamasak da
            varargs bos bir array olur ve CTE olusmaz
         */

        islem(3,4,5); // 35
        islem(3,4,5,6,7,8,9,0); // 0
        // islem(); // parametre olarak kabul eder
                    // ancak bos bir array, tumSayilar.length-2 icin hata olusturur





    }

    public static void islem(int... tumSayilar){

        // son sayiyi parametre olarak ayiramadik ama
        //  tumSayilar array'inden son elementi ayirabiliriz

        int toplam  = 0;

        for (int i = 0; i <= tumSayilar.length-2 ; i++) {

            toplam += tumSayilar[i];

        }

        System.out.println("Islem sonucu : " + toplam * tumSayilar[tumSayilar.length-1] );

    }



}
