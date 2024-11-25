package K36_maps.D07_computeMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C03_KullanimAdetleriniBulma {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"t"};
        // output a=5, b=2, d=3, r=1, t=1


        Map<String, Integer> harfKullanimSayilariMap = new TreeMap<>();


        for (String eachHarf  :harfler){
            harfKullanimSayilariMap.computeIfPresent(eachHarf , (k,v) -> v+1 );
            harfKullanimSayilariMap.putIfAbsent(eachHarf,1);
        }


        System.out.println(harfKullanimSayilariMap);

        // {a=5, b=2, d=3, r=1, t=1}


    }
}
