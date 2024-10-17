package K17_arrays.D02_arraysClassMethodlari;

import K17_arrays.D01_arrayOlusturmaVeKullanma.C09_EnUzunVeEnKisaKelime;

import java.util.Arrays;

public class C03_split {
    public static void main(String[] args) {

        String str = "Java gun gectikce daha da guzellesiyor";

        // cumledeki en kisa ve en uzun kelimeyi yazdirin

        String[] kelimeler = str.split(" ");


        System.out.println(Arrays.toString(kelimeler));
        // [Java, gun, gectikce, daha, da, guzellesiyor]


        C09_EnUzunVeEnKisaKelime.enKisaEnUzunKelimeYazdir(kelimeler);

        // En uzun kelime : guzellesiyor
        // En kisa kelime : da

    }
}
