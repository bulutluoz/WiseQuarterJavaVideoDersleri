package K36_maps.D06_nestedMapKullanimi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_OgrenciMapKullanma{

    public static void main(String[] args) {


        /*
            {
             101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
             102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
             103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
             }

         */

        Map< Integer, Map<String,Object>  > ogrenciNestedMap  = new TreeMap();

        Map<String,Object> ogrenci101Map = new HashMap<>();
        ogrenci101Map.put("sinif",10);
        ogrenci101Map.put("sube","H");
        ogrenci101Map.put("soyisim","Can");
        ogrenci101Map.put("isim","Ali");
        ogrenci101Map.put("bolum","MF");

        ogrenciNestedMap.put(101,ogrenci101Map);

        Map<String,Object> ogrenci102Map = new HashMap<>();
        ogrenci102Map.put("sinif",11);
        ogrenci102Map.put("sube","M");
        ogrenci102Map.put("soyisim","Cem");
        ogrenci102Map.put("isim","Veli");
        ogrenci102Map.put("bolum","Soz");
        ogrenciNestedMap.put(102,ogrenci102Map);

        Map<String,Object> ogrenci103Map = new HashMap<>();
        ogrenci103Map.put("sinif",11);
        ogrenci103Map.put("sube","H");
        ogrenci103Map.put("soyisim","Cem");
        ogrenci103Map.put("isim","Ali");
        ogrenci103Map.put("bolum","TM");

        ogrenciNestedMap.put(103,ogrenci103Map);

        System.out.println(ogrenciNestedMap);

        /*
                {
                    101={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                    102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
                    103={
                            sinif=11,
                            sube=H,
                            soyisim=Cem,
                            bolum=TM,
                            isim=Ali
                         }
                 }
         */



        // 103 numarali ogrencinin soyismini yazdirin

        System.out.println(ogrenciNestedMap.get(103)); // {sinif=11, sube=H, soyisim=Cem, bolum=TM, isim=Ali}

        System.out.println(ogrenciNestedMap.get(103).get("soyisim")); // Cem


        // 101 numarali ogrencinin bolumunu yazdirin

        System.out.println(ogrenciNestedMap.get(101).get("bolum")); // MF


        // 102 numarali ogrencinin subesini K yapin

        ogrenciNestedMap.get(102).put("sube","K");


        // 101 numarali ogrencinin bolumunu TM yapin

        ogrenciNestedMap.get(101).put("bolum","TM");


        System.out.println(ogrenciNestedMap);



    }
}
