package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class C04_IsmiDuzenle {

    public static void main(String[] args) {

        //   Verilen isim ve soyismi alip
        //   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //   isim bosluk soyisim seklinde donduren bir method olusturun
        //   input : isim : Ali  soyisim :YILMAZ.     method return : Ali Yilmaz


        String str = "ali";

        str.toUpperCase();  // ne konsolda gorunur, ne de sonra kullanabiliriz

        System.out.println(str.toUpperCase()); // konsolda gorurum ama sonra kullanamam   ALI

        System.out.println(str); // ali

        str = str.toUpperCase(); // konsolda gormem, ama kaydettigimiz icin bundan sonra hep ALI olarak kullanabilirim

        System.out.println( "Kalici yeni hali : " + str); // Kalici yeni hali : ALI

        ismiDuzenleDondur("ali","cabbar"); // ne konsolda gorunur, ne de sonra kullanabiliriz

        System.out.println(ismiDuzenleDondur("ali", "cabbar")); // Ali Cabbar
        // konsolda gorurum ama sonra kullanamam


        String isim = ismiDuzenleDondur("veli","kibar");
        // konsolda gormem, ama kaydettigimiz icin bundan sonra hep ALI olarak kullanabilirim


        System.out.println(isim); // Veli Kibar

        System.out.println(isim.length()); // 10

        System.out.println(isim.contains("Veli")); // true

    }


    public static String ismiDuzenleDondur( String isim , String soyisim ){

        String duzenlenmisIsim =    isim.substring(0,1).toUpperCase()+
                                    isim.substring(1).toLowerCase()+
                                    " "+
                                    soyisim.substring(0,1).toUpperCase()+
                                    soyisim.substring(1).toLowerCase() ;

        return duzenlenmisIsim;
    }


}
