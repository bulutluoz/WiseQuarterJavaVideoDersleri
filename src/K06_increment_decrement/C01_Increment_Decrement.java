package K06_increment_decrement;

public class C01_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 20 ;

        // sayinin degerini 2 katina cikarin

        // sayi = sayi * 2 ;
        sayi *= 2 ;

        System.out.println("14.satirda sayi : " + sayi ); // 40

        // sayinin degerini 5 azaltin

        // sayi = sayi - 5 ;

        sayi -= 5 ;

        System.out.println("22.satirda sayi : " + sayi ); // 35


        // sayiyi 5'e bolup, sonucu sayi variable'na atayin

         sayi = sayi / 5  ;

        System.out.println("29.satirda sayi : " + sayi ); // 7


        // sayi variable'inin degerini 1 artirin

        sayi = sayi + 1 ;

        System.out.println("36.satirda sayi : " + sayi ); // 8


        // sayi variable'inin degerini 1 artirin

        sayi += 1 ;

        System.out.println("43.satirda sayi : " + sayi ); // 9


        // sayi variable'inin degerini 1 artirin

        sayi++ ;

        System.out.println("50.satirda sayi : " + sayi ); // 10
    }
}
