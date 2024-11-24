package K36_maps.D03_bilgiUpdate;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C06_YilSonuSinifArtirma extends OgrenciMap {

    public static void main(String[] args) {

        // Yil sonu sinif artirma yapin
        // her ogrenciyi bir ust sinifa gecirin
        // sinif 12 ise "mezun" yapin, zaten mezun olanlara dokunmayin

        System.out.println(ogrenciMap);

        yilsonuSinifArtir();

        System.out.println(ogrenciMap);

        yilsonuSinifArtir();

        System.out.println(ogrenciMap);


    }
}
