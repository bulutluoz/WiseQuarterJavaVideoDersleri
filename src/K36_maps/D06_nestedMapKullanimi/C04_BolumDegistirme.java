package K36_maps.D06_nestedMapKullanimi;

import java.util.Set;

public class C04_BolumDegistirme extends NestedOgrenciMap{

    public static void main(String[] args) {

        String eskiBolum = "MF";
        String yeniBolum = "Say";

        // ogrenci nested map'de bolumu eskiBolum olan ogrencilerin bolumlerini
        // yeniBolum olarak update edin


        // 1.adim tum key'leri bir Set kaydedin

        Set<Integer> ogrenciNoSeti = ogrenciNestedMap.keySet();
        // [102, 103, 104, 105, 106, 107, 109, 111]


        // 2.adim ogrenciNoSeti'ndeki numaralari bir for-each loop ile gozden gecirip
        //        istenen sartlari saglayan ogrenciler icin istenen islemleri yapin

        for (Integer eachNo : ogrenciNoSeti){

            String eskiBolumOgr = (String) ogrenciNestedMap.get(eachNo).get("bolum");

            if (eskiBolumOgr.equalsIgnoreCase(eskiBolum)){
                ogrenciNestedMap.get(eachNo).put("bolum",yeniBolum);
            }

        }

        System.out.println(ogrenciNestedMap);
    }
}
