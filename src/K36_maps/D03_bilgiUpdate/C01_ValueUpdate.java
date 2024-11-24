package K36_maps.D03_bilgiUpdate;


import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Arrays;

public class C01_ValueUpdate extends OgrenciMap{

    public static void main(String[] args) {

        // 102 numarali ogrencinin ismini ve soyismini yazdirin

        String ogrenciValue = ogrenciMap.get(102);

        System.out.println(ogrenciValue); // Veli-Cem-10-K-TM

        String[] ogrenciValueArr = ogrenciValue.split("-");

        System.out.println(Arrays.toString(ogrenciValueArr)); // [Veli, Cem, 10, K, TM]

        System.out.println(
                "102 nolu ogrenci : " + ogrenciValueArr[0] + " " + ogrenciValueArr[1]
        );
        // 102 nolu ogrenci : Veli Cem


        // 102 numarali ogrencinin adini Kemal olarak degistirin

        ogrenciValueArr[0] = "Kemal";

        System.out.println(Arrays.toString(ogrenciValueArr)); // [Kemal, Cem, 10, K, TM]

        // Map'de update yapabilmek icin array'in yeni halini - ile birlestirip
        // yeniValue elde edelim

        String yeniValue = String.join("-",ogrenciValueArr);

        System.out.println(yeniValue); // Kemal-Cem-10-K-TM

        ogrenciMap.replace(102,yeniValue);


        System.out.println(ogrenciMap);






        // 104 numarali ogrencinin soyismini Yilmaz yapin

        int verilenNo = 104;
        String yeniSoyisim = "Yilmaz";

        // 1- ogrencinin eski value'sunu kaydedelim
        String verilenNoValue = ogrenciMap.get(verilenNo); //


        // 2- bilgilere rahat ulasabilmek icin value'yu split edelim
        String[] verilenNoValueArr = verilenNoValue.split("-");


        // 3- array uzerinde istenen kontrolleri ve update'i yapin

        verilenNoValueArr[1] = yeniSoyisim;

        // 4- update array'de yapildi, bu degisikligi map'e yapabilmek icin
        //    array'i yeniden - ile birlestirip yeniValue elde edelim
        String verilenNoYeniValue = String.join("-",verilenNoValueArr);

        // 5- key belli, yeniValue de olusturuldu, ikisini kullanarak map'i update edin
        ogrenciMap.replace(verilenNo,verilenNoYeniValue);

        System.out.println(ogrenciMap);



    }
}
