package K36_maps.D02_BilgilereUlasmaVeListeleme;

public class C01_NumaraIleOgrenciArama extends OgrenciMap{

    public static void main(String[] args) {

        // ogrenci map'inde verilen ogrenciNo'ya sahip ogrencinin
        // sinif, sube, isim ve soyismini yazdirin

        int ogrenciNo = 105;

        // System.out.println(ogrenciMap); // {}

        // System.out.println(ogrenciMap); static blok kullandigimiz icin
        // OgrenciMap class'i calismaya baslar baslamaz ogrencileri ekler
        /*
            {
               101=Ali-Can-11-H-MF,
               102=Veli-Cem-10-K-TM,
               103=Ali-Cem-11-K-TM,
               104=Ayse-Can-10-H-MF,
               105=Sevgi-Cem-11-M-TM,
               106=Sevgi-Can-10-K-MF,
               107=Esra-Han-11-M-SOZ
               }
         */

        // 1- ogrenci value'yu kaydedelim

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2- bilgilere rahat ulasabilmek icin, value'yu array'e donusturelim

        String[] valueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        // 3- array'den istenen bilgileri alabiliriz
        // sinif, sube, isim ve soyismini yazdirin

        System.out.println(ogrenciNo + " Numarali ogrenci bilgileri : ");

        System.out.println(

                valueArr[2] + " " +
                valueArr[3] + " " +
                valueArr[0] + " " +
                valueArr[1]
        );





    }
}
