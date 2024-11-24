package K36_maps.D02_bilgilereUlasmaVeListeleme;

import java.util.*;

public class OgrenciMap {

    public static Map<Integer,String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    } //

    // ogrenci map'inde verilen ogrenciNo'ya sahip ogrencinin
    // sinif, sube, isim ve soyismini yazdirin
    public static void numaradanOgrenciBilgisiYazdir (int ogrenciNo){
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

    // verilen soyisim'e sahip ogrencilerin
    // sinif sube isim ve soyisimlerini
    // alt alta yazdirin
    public static void soyisimdenListeYazdir(String verilenSoyisim){
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


    // sinif ve sube verildiginde
    // o siniftaki ogrencilerin
    // numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun
    public static void sinifSubeListesiYazdirma(Integer istenenSinif,String istenenSube){

//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        //  [101, 102, 103, 104, 105, 106, 107]

//            2- bir for-each loop ile her bir key'i ele alalim

        System.out.println(istenenSinif +"/"+istenenSube + " subesindeki ogrenci listesi");

        for (Integer eachKey : ogrenciKeySeti){
            // eachKey ==> 101

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini yazdirin

            // numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun
            if (eachValueArr[2].equalsIgnoreCase(istenenSinif+"")
                    && eachValueArr[3].equalsIgnoreCase(istenenSube) ){

                System.out.println(
                        eachKey + " " +
                                eachValueArr[0]+ " " +
                                eachValueArr[1]

                );
            }
        }

    }



    // verilen isme sahip ogrencilerin
    // Numara, sinif, sube, isim ve soyisimlerini yazdiran
    // bir method olusturun
    public static void isimdenOgrenciListele( String verilenisim){

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


    // Numarasi verilen ogrencinin soyismini update edin

    public static void numaraIleSoyisimUpdate(int verilenNo , String yeniSoyisim){
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
    }


    // Kullanicidan numara, isim, soyisim, sinif, sube ve bolum bilgilerini alip
    // ogrenciyi map'e kaydeden bir method olusturun

    public static void kullanicidanAlinanBilgilerleOgrenciEkle(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ogrenci no ?");
        int ogrenciNo = scanner.nextInt();

        String ogrenciValue = "";

        scanner.nextLine();

        System.out.println("isim ?");
        ogrenciValue += scanner.nextLine();

        ogrenciValue += "-";

        System.out.println("soyiisim ?");
        ogrenciValue += scanner.nextLine();

        ogrenciValue += "-";

        System.out.println("sinif ?");
        ogrenciValue += scanner.nextLine();

        ogrenciValue += "-";

        System.out.println("sube ?");
        ogrenciValue += scanner.nextLine().toUpperCase();

        ogrenciValue += "-";

        System.out.println("bolum ?");
        ogrenciValue += scanner.nextLine();


        ogrenciMap.put(ogrenciNo,ogrenciValue);

    }


    // Verilen sinif ve subedeki ogrencilerin
    // subelerini verilen yeniSube olarak update edin

    public static void subeUpdate(Integer sinif, String eskiSube, String yeniSube){
//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim

        for (Integer eachKey : ogrenciKeySeti){ // 101


            //            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue =  ogrenciMap.get(eachKey);

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArr = eachValue.split("-");

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini update edin
            // [Kemal, Cem, 10, K, TM]
            // 10/K sinifindaki ogrencilerin subelerini Z yapin
            if (eachValueArr[2].equalsIgnoreCase(sinif+"") && eachValueArr[3].equalsIgnoreCase(eskiSube)){

                eachValueArr[3] = yeniSube;

//            6- array'de yapilan degisikligi map'e tasimak icin
//               array'i - ile birlestirip yeniValue olusturalim

                String yeniValue = String.join("-",eachValueArr);

//            7- eachKey ve yeni value ile map'i update edelim

                ogrenciMap.put(eachKey,yeniValue);

            }



        }

        // 6.ve 7.adimlari if icinde yazdik ki
        // tum ogrencileri yeniden map'e eklemeye calismasin
        // sadece sinif ve subesi istenen degere esit olan ogrencileri guncellesin ve map'e ekleyip update etsin


    }


    // ogrenci map'inde tum ogrencileri gozden gecirip
    // verilen eskiBolum bilgisine sahip olanlari
    // yeniBolum olarak update edin

    public static void bolumUpdate(String eskiBolum, String yeniBolum){
//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim

        for (Integer eachKey : ogrenciKeySeti){ // 101


//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue =  ogrenciMap.get(eachKey);

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArr = eachValue.split("-");

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini update edin
            // [Kemal, Cem, 10, K, TM]

            if (eachValueArr[4].equalsIgnoreCase(eskiBolum)){

                eachValueArr[4] = yeniBolum;

//            6- array'de yapilan degisikligi map'e tasimak icin
//               array'i - ile birlestirip yeniValue olusturalim

                String yeniValue = String.join("-",eachValueArr);

//            7- eachKey ve yeni value ile map'i update edelim

                ogrenciMap.put(eachKey,yeniValue);

            }

        }

    }


    // Yil sonu sinif artirma yapin
    // her ogrenciyi bir ust sinifa gecirin
    // sinif 12 ise "mezun" yapin, zaten mezun olanlara dokunmayin

    public static void yilsonuSinifArtir(){
//            1 - tum key'leri kaydederiz
//                ogrenciMap.keySet() method'u Set olarak tum key'leri getirir
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

//            2- bir for-each loop ile her bir key'i ele alalim
        for (Integer eachKey : ogrenciKeySeti){ // 101

//            3- bizim oglanin getirdigi key'e ait value'yu kaydedelim
            String eachValue =  ogrenciMap.get(eachKey); // "Ali-Cem-11-K-MF"

//            4- value'yu split ile bolup
//               bir array olarak kaydedelim ki bilgilere direk ulasabilelim
            String[] eachValueArr = eachValue.split("-"); // [Ali, Cem, 11, K, MF]

//            5- kaydettigimiz valueArr'inde istenen bilgiyi kontrol edip
//               istenen sarti saglayan ogrencilerin, istenen bilgilerini update edin

            // her ogrenciyi bir ust sinifa gecirin
            // sinif 12 ise "mezun" yapin, zaten mezun olanlara dokunmayin

            String eskiSinif = eachValueArr[2];

            switch (eskiSinif) {

                case "9" :
                    eachValueArr[2] = "10";
                    break;
                case "10" :
                    eachValueArr[2] = "11";
                    break;
                case "11" :
                    eachValueArr[2] = "12";
                    break;
                case "12" :
                    eachValueArr[2] = "Mezun";

            }

//            6- array'de yapilan degisikligi map'e tasimak icin
//               array'i - ile birlestirip yeniValue olusturalim

                String yeniValue = String.join("-",eachValueArr);

//            7- eachKey ve yeni value ile map'i update edelim

                ogrenciMap.put(eachKey,yeniValue);

            }



    }




}
