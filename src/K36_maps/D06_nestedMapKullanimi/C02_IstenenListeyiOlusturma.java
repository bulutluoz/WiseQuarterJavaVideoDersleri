package K36_maps.D06_nestedMapKullanimi;

import java.util.Set;

public class C02_IstenenListeyiOlusturma extends NestedOgrenciMap {

    public static void main(String[] args) {

        mapeOgrenciEkle(109,"Kemal","Han",10,"K","MF");
        mapeOgrenciEkle(111,"Leyla","Yilmaz",9,"M","TM");

        System.out.println(ogrenciNestedMap);



        // 103 numarali ogrencinin bolumunu MF yapin
        ogrenciNestedMap.get(103).put("bolum","MF");

        // 105 numarali ogrencinin soyismi Yilmaz olsun
        ogrenciNestedMap.get(105).put("soyisim","Yilmaz");


        System.out.println(ogrenciNestedMap);

        /*
            {
                102={sinif=11, sube=M, soyisim=Cem, bolum=Soz, isim=Veli},
                103={sinif=11, sube=H, soyisim=Cem, bolum=MF, isim=Ali},
                104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
                105={sinif=11, sube=M, soyisim=Yilmaz, bolum=TM, isim=Sevgi},
                106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
                107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra},
                109={sinif=10, sube=K, soyisim=Han, bolum=MF, isim=Kemal},
                111={sinif=9, sube=M, soyisim=Yilmaz, bolum=TM, isim=Leyla}
             }
         */


        // ogrenci map'inde 11.siniftaki ogrencilerin
        // numara , sinif, sube, isim ve soyisimlerini liste olarak yazdirin


        // 1.adim tum key'leri bir Set kaydedin

        Set<Integer> ogrenciNoSeti = ogrenciNestedMap.keySet();
        // [102, 103, 104, 105, 106, 107, 109, 111]


        // 2.adim ogrenciNoSeti'ndeki numaralari bir for-each loop ile gozden gecirip
        //        istenen sartlari saglayan ogrenciler icin istenen islemleri yapin

        for (Integer eachNo :ogrenciNoSeti){

            if ( (Integer)ogrenciNestedMap.get(eachNo).get("sinif")  == 11    ){

                System.out.println(

                        eachNo + " " +
                        ogrenciNestedMap.get(eachNo).get("sinif") + " " +
                        ogrenciNestedMap.get(eachNo).get("sube") + " " +
                        ogrenciNestedMap.get(eachNo).get("isim") + " " +
                        ogrenciNestedMap.get(eachNo).get("soyisim")
                );

            }


        }


    }
}
