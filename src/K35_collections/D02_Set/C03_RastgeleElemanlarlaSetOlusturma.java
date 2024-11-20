package K35_collections.D02_Set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_RastgeleElemanlarlaSetOlusturma {

    public static void main(String[] args) {

        // icinde 20'den kucuk rastgele 7 adet pozitif tamsayinin oldugu
        // bir Set olusturun

        Random random = new Random();
        Set<Integer> rastgeleSayilarSeti = new TreeSet<>();

        for (int i = 1; i <=7 ; i++) {

            rastgeleSayilarSeti.add(  random.nextInt(20)  );
        }

        System.out.println(rastgeleSayilarSeti);
        // [2, 3, 4, 9, 10, 14, 15]
        // [3, 10, 11, 13, 17, 18]
        // [0, 4, 6, 8, 17]
        // [7, 10, 14, 16]


        // ayni sayilar geldiginde set onlari yeni bir sayi gibi eklemez
        // biz 7 sayi ekliyoruz ama random sayinin 7 farkli deger uretecegini garanti edemeyiz


        Set<Integer> whileSet = new TreeSet<>();

        while (whileSet.size()<7){

            whileSet.add(random.nextInt(20)    );
        }


        System.out.println("While ile olusturulan set : " + whileSet);


    }
}
