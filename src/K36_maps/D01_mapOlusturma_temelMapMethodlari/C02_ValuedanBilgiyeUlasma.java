package K36_maps.D01_mapOlusturma_temelMapMethodlari;

import java.util.Arrays;

public class C02_ValuedanBilgiyeUlasma {

    public static void main(String[] args) {

        // bir ogrencinin bilgileri tek bir String halinde
        // asagida verilen formatla tutulmaktadir
        // ogrenci bilgisi verildiginde soyismi yazdirin

        String ogrenciBilgisi = "Ali-Can-10-H-MF";

        // ogrenci bilgisi verildiginde sinifi yazdirin

        String[] valueArr = ogrenciBilgisi.split("-");

        System.out.println(Arrays.toString(valueArr)); // [Ali, Can, 10, H, MF]

        System.out.println("Sinif : " + valueArr[2]); // Sinif : 10

        // ogrenci bilgisi verildiginde Bolumu yazdirin
        System.out.println("Bolum : " + valueArr[4]); // Bolum : MF

        // ogrencinin isim ve soyismini yazdirin

        System.out.println("isim soyisim : " + valueArr[0]+" "+valueArr[1]);
        // isim soyisim : Ali Can






    }
}
