package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.Set;

public class C04_IsimIleOgrenciArama extends OgrenciMap{

    public static void main(String[] args) {

        // verilen isme sahip ogrencilerin
        // Numara, sinif, sube, isim ve soyisimlerini yazdiran
        // bir method olusturun

        String verilenisim = "Ali";


//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim

        System.out.println("Ismi " + verilenisim + " olan ogrenci listesi");

        for (Integer eachKey : ogrenciKeySeti){
            // eachKey = 101

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]


//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin

            if (eachValueArr[0].equalsIgnoreCase(verilenisim)){

                // Numara, sinif, sube, isim ve soyisimlerini yazdiran
                System.out.println(

                        eachKey + " " +
                        eachValueArr[2] + " " +
                        eachValueArr[3] + " " +
                        eachValueArr[0] + " " +
                        eachValueArr[1]
                );
            }


        }






    }
}
