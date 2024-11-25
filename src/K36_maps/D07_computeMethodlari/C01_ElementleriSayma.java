package K36_maps.D07_computeMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C01_ElementleriSayma {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"d"};
        // output a : 5, b : 2, d : 4, r: 1


        Map<String , Integer > kullanimSayilariMap = new TreeMap<>();


        for (String eachHarf : harfler){

            if (kullanimSayilariMap.containsKey(eachHarf)){

                int eskiKullanimSayisi = kullanimSayilariMap.get(eachHarf);
                kullanimSayilariMap.put(eachHarf, eskiKullanimSayisi+1);
                // daha once map'de var, eski kullanim sayisini alip
                // eski kullanim sayisinin 1 fazlasi olarak update ediyoruz

            }else {

                kullanimSayilariMap.put(eachHarf,1);
                // daha once map'de yok, degeri 1 olarak map'e ekliyoruz

            }


        }

        System.out.println(kullanimSayilariMap);


    }
}
