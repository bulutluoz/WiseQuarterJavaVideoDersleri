package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.Collection;

public class C02_SoyisimdenOgrenciBilgisiYazdirma extends OgrenciMap{

    public static void main(String[] args) {

        // verilen soyisim'e sahip ogrencilerin
        // sinif sube isim ve soyisimlerini
        // alt alta yazdirin

        String verilenSoyisim = "Can";

//            1 - tum value'leri kaydederiz
//                ogrenciMap.values() method'u collection olarak tum value'leri getirir

//            2- bir for-each loop ile her bir value'u ele alalim

//            3- bizim oglanin getirdigi value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim

//            4- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin



//            1 - tum value'leri kaydederiz
//                ogrenciMap.values() method'u collection olarak tum value'leri getirir
        Collection<String> ogrenciValueleriCollection = ogrenciMap.values();
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]
        System.out.println("Soyismi " + verilenSoyisim + " olan ogrenciler : ");
//            2- bir for-each loop ile her bir value'u ele alalim
        for (String each : ogrenciValueleriCollection){

            // Ali-Can-11-H-MF
//            3- bizim oglanin getirdigi value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

//            4- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin

            // sinif sube isim ve soyisimlerini
                if (valueArr[1].equalsIgnoreCase(verilenSoyisim)){
                    System.out.println(

                            valueArr[2]+ " "+
                                    valueArr[3]+ " "+
                                    valueArr[0]+ " "+
                                    valueArr[1]
                    );
                }

        }







    }
}
