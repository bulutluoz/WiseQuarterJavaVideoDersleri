package K36_maps.D07_computeMethodlari;

import K36_maps.D06_nestedMapKullanimi.NestedOgrenciMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_SinifMevcutlari extends NestedOgrenciMap {

    public static void main(String[] args) {

        // Nested ogrenci map'inde her sinifta kacar kisi oldugunu yazdirin
        // orn 9=2, 10=1, 11=3


        System.out.println(ogrenciNestedMap);

        /*

            {
                102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
                103={sinif=11, sube=H, soyisim=Cem, bolum=TM, isim=Ali},
                104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
                105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
                106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
                107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra}
              }
         */


        // 1.adim tum ogrencileri gozden gecirmek icin keySet kaydedelim

        Set<Integer> ogrenciKeySet = ogrenciNestedMap.keySet();

        Map<Integer,Integer> sinifOgrenciSayilariMap = new HashMap<>();

        // 2.adim : bir for-each loop ile tum key'leri gozden gecirip
        //          o key'lere ait sinif bilgilerini alip kullanalim
        for ( Integer eachKey : ogrenciKeySet ){

            int ogrenciSinif = (Integer)ogrenciNestedMap.get(eachKey).get("sinif");


            sinifOgrenciSayilariMap.computeIfPresent(ogrenciSinif,(k,v)-> v+1);
            sinifOgrenciSayilariMap.putIfAbsent(ogrenciSinif,1);

        }

        System.out.println(sinifOgrenciSayilariMap); // {10=2, 11=4}

    }
}
