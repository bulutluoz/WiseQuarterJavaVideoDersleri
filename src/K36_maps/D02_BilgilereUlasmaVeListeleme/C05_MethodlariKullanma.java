package K36_maps.D02_BilgilereUlasmaVeListeleme;

public class C05_MethodlariKullanma {

    public static void main(String[] args) {

        OgrenciMap.numaradanOgrenciBilgisiYazdir(104);
        //104 Numarali ogrenci bilgileri :
        //10 H Ayse Can

        OgrenciMap.numaradanOgrenciBilgisiYazdir(106);
        //106 Numarali ogrenci bilgileri :
        //10 K Sevgi Can


        OgrenciMap.soyisimdenListeYazdir("Cem");
        //Soyismi Cem olan ogrenciler :
        //10 K Veli Cem
        //11 K Ali Cem
        //11 M Sevgi Cem

        OgrenciMap.soyisimdenListeYazdir("CAN");
        //Soyismi CAN olan ogrenciler :
        //11 H Ali Can
        //10 H Ayse Can
        //10 K Sevgi Can


        OgrenciMap.sinifSubeListesiYazdirma(11,"M");
        //11/M subesindeki ogrenci listesi
        //105 Sevgi Cem
        //107 Esra Han

        OgrenciMap.sinifSubeListesiYazdirma(10,"K");
        //10/K subesindeki ogrenci listesi
        //102 Veli Cem
        //106 Sevgi Can


        OgrenciMap.isimdenOgrenciListele("ali");
        //Ismi ali olan ogrenci listesi
        //101 11 H Ali Can
        //103 11 K Ali Cem


    }
}
