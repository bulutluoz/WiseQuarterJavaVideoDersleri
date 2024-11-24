package K36_maps.D04_entrySetKullanimi;

import K36_maps.D02_bilgilereUlasmaVeListeleme.OgrenciMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C01_EntrySet extends OgrenciMap {

    public static void main(String[] args) {

        // ogrenci map'indeki key'leri yazdirin

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        System.out.println(ogrenciKeySeti); // [101, 102, 103, 104, 105, 106, 107]

        for ( Integer eachKey : ogrenciKeySeti){

            System.out.print(eachKey + " ");

        }
        System.out.println("");

        // ogrenci map'indeki value'leri yazdirin

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        System.out.println(ogrenciValueCollection);

        //   [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        for ( String eachValue  :ogrenciValueCollection){
            System.out.print(eachValue + " ");
        }

        // Ali-Can-11-H-MF Veli-Cem-10-K-TM Ali-Cem-11-K-TM Ayse-Can-10-H-MF Sevgi-Cem-11-M-TM Sevgi-Can-10-K-MF Esra-Han-11-M-SOZ

        System.out.println("");
        // key'leri kullanarak da value'leri yazdirabiliriz

        for (Integer eachKey: ogrenciKeySeti) {

            System.out.print(ogrenciMap.get(eachKey) + " ");

        }

        System.out.println("");
        /*
            Biz bir map'deki key'leri ve value'leri ayri ayri elde edebiliyoruz
            ve ayri ayri gor-each loop ile gozden gecirebiliyoruz

            her bir ogrenciye ait key ve value'yu tek bir deger olarak ele alip
            tek bir for-each loop ile gozden gecirebilir miyiz ?
         */


        /*
         Java'daki Entry class'i key ve value'yu birlikte
         tek bir eleman olarak ele almamiza imkan tanir
         */


        System.out.println("Ogrenci map : "+ ogrenciMap);

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

        System.out.println(ogrenciMap.size()); // 7
        // Map yapisi geregi 7 Key ve 7 value'yu ayri ayri tutar
        // key ve value'leri birlikte tutabilmek icin java Entry Interface'ini olusturmustur

        Set<Map.Entry<Integer,String>>  ogrenciEntrySeti = ogrenciMap.entrySet();

        System.out.println("Ogrenci Entry Seti : " + ogrenciEntrySeti);

        // goruntusu tamamen map gibi olsa da
        // bir Set oldugu icin for-each loop ile kullanilabilir
        // boylece tum ogrencilerin key ve value'lerini birlikte ele alabilir ve
        // daha az adim ile islemleri yapabiliriz.


        // Entry Set'i kullanarak tum ogrencilerin numara, isim ve soyisimlerini yazdirin

        // 1.adim EntrySet olustur

        // 2.adim bir for-each loop ile tum Entry'leri gozden gecirelim

        for ( Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){

            //3.adim  ogrenci value'sunu kaydedelim
            String eachvalue = eachEntry.getValue();

            //4.adim value'deki bilgilere erisebilmek icin split edelim
            String[] eachValueArr = eachvalue.split("-");

            //5.adim istenen kontrolleri yapip, istenen bilgileri yazdirin
            System.out.println(

                    eachEntry.getKey() + " " +
                    eachValueArr[0]+ " " +
                    eachValueArr[1]
            );

        }

    }
}
