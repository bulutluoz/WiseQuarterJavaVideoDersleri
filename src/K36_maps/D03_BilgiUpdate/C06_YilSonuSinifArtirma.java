package K36_maps.D03_BilgiUpdate;

import K36_maps.D02_BilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Set;

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
