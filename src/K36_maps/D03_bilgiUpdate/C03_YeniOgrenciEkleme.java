package K36_maps.D03_bilgiUpdate;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C03_YeniOgrenciEkleme {

    public static void main(String[] args) {

        // Kullanicidan numara, isim, soyisim, sinif, sube ve bolum bilgilerini alip
        // ogrenciyi map'e kaydeden bir method olusturun


        OgrenciMap.kullanicidanAlinanBilgilerleOgrenciEkle();

        System.out.println(OgrenciMap.ogrenciMap);

    }
}
