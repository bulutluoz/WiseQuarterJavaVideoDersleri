package K09_ternaryOperator;

public class C06_Ternary_AtamaYazdirma {

    public static void main(String[] args) {

        // Ternary operatoru YA sout icinde kullanilmali
        //                   YA DA mutlaka ATAMA yapilmalidir


        // verilen gorevde hem yazdirma hem atama varsa
        // ternary yazarken dikkat edilmelidir


        int sayi = 10;

        // verilen sayi variable'inin degerini kontrol edip
        // sayi ciftse "cift sayilari sevmem" yazdirin
        // sayi tek ise sayinin degerini 10 artirin


        /*
        if ( sayi % 2 == 0 ){

            System.out.println("cift sayilari sevmem");

        } else {

            sayi += 10;
        }

         */

        System.out.println( sayi % 2 == 0 ? "cift sayilari sevmem" : (sayi +=10 ) );

        System.out.println("Sayinin son hali : " + sayi);




    }
}
