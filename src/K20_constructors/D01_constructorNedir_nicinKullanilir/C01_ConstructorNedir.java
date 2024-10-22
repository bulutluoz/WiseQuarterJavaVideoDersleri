package K20_constructors.D01_constructorNedir_nicinKullanilir;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_ConstructorNedir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        List<Integer> sayilar = new ArrayList<>();

        String str = new String("Ali");




        /*
            Java'da surekli kullanacagimiz ozellikleri class'lara yerlestiririz
            Herhangi bir class'daki ozelliklere(variable ve method'lar) ulasabilmek icin
            o ozelliklerin bulundugu class'dan bir obje olusturabiliriz

            Ornegin bugune kadar olusturdugumuz scanner objesi sayesinde
            Javanin Scanner Class'ina koydugu hazir method'lari kullandik

            Bugunku konumuzda Java'nin objeyi nasil olusturdugunun
            ve olusturuldugu class'daki ozellikleri nasil objeye yukledigini gorecegiz
         */

        Scanner        scanner1        =          new      Scanner(System.in);
    // Class ismi     obje ismi  atama isareti  keyword      constructor
        List<Integer>  sayilar1        =          new       ArrayList<>();

         /*
            Java'da bir obje olusturup ilk deger atamasi yapmak icin
            MUTLAKA bir Constructor CALISMALIDIR
         */


    }
}
