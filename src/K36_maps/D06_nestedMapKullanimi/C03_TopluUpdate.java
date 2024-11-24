package K36_maps.D06_nestedMapKullanimi;

import java.util.Set;

public class C03_TopluUpdate extends NestedOgrenciMap {

    public static void main(String[] args) {
        // tum ogrencilerin soyisimlerini buyuk harf yapin


        // 1.adim tum key'leri bir Set kaydedin

        Set<Integer> ogrenciNoSeti = ogrenciNestedMap.keySet();
        // [102, 103, 104, 105, 106, 107, 109, 111]


        // 2.adim ogrenciNoSeti'ndeki numaralari bir for-each loop ile gozden gecirip
        //        istenen sartlari saglayan ogrenciler icin istenen islemleri yapin

        for (Integer eachNo : ogrenciNoSeti){

            String eskiSoyisim = (String) ogrenciNestedMap.get(eachNo).get("soyisim");

            ogrenciNestedMap.get(eachNo).put("soyisim",eskiSoyisim.toUpperCase());

        }

        System.out.println(ogrenciNestedMap);


    }


}
