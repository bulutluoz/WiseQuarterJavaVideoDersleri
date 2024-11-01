package K24_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        // bilgisayarinizdaki zamani yazdirin

        // LocalTime saat = new LocalTime();
        /*
            Time ve date ile ilgili objeler olustururken
            Java sifirdan bir obje olusturmamiza izin vermez
            zamani ve tarihi bilgisayarimizdan alacagi icin bazi on ayarlari yapmasi gerekir

            Java kendisi bize tarihi veya zamani return edecek
            method'lar hazirlamistir

            biz de class'imizda zaman veya tarih objesi olusturdugumuzda
            degeri o method'lardan alip kullaniriz
         */

        LocalTime saat = LocalTime.now();

        System.out.println(saat); // 08:17:00.001934

        // .get..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi bize getirir

        System.out.println(saat.getHour()); // 8


        // Bir loop olusturup
        // Loop'un calismaya basladigi zaman ile bittigi zaman arasindaki farki bulun

        LocalTime baslangic = LocalTime.now();

        String str = "";

        for (int i = 0; i <100000 ; i++) {

            str+= i;
        }

        LocalTime bitis = LocalTime.now();


        System.out.println("saat : "+saat);
        System.out.println("baslangic : "+baslangic);
        System.out.println("bitis : " + bitis);

        /*
            LocalTime class'i obje olusturdugumuz satir calistiginda
            calistigi sistemdeki zaman bilgisini alir

            olusturulan localTime objesi bir kronometre degil
            olusturuldugu andaki degeri saklayan basit bir variable'dir

            Eger koddaki 2 satirin calismasi arasinda gecen zamani bulmak isterseniz
            o iki satirda 2 adet localTime objesi olusturup
            bu zamanlar arasindaki farki bulmaliyiz

         */

        // 1- get method'lari ile zaman arasindaki farki bulabiliriz

        System.out.println(bitis.getSecond() - baslangic.getSecond());
        // tam sureyi belirlemek icin
        // saat, dakika, saniye ve nanosaniye degisimlerini dikkate alan, bir kod yazmalisiniz


        // 2- Duration.between() ile baslangic ve bitis degerlerini bulabiliriz


        System.out.println("Duration : "+ Duration.between(baslangic, bitis)); //

        // 3- toSecondOfDay() veya toNanoOfDay() ile aradaki farki bulabiliriz

        System.out.println(baslangic.toSecondOfDay()); // 30834
        System.out.println(baslangic.toNanoOfDay()); //   30834744350000

        System.out.println(bitis.toNanoOfDay() - baslangic.toNanoOfDay());





        // .with..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istedigimiz deger olarak ayarlar

        System.out.println(saat.withHour(10)); // 10:37:10.215615
        System.out.println(saat.withSecond(0).withNano(0)); // 08:38


        // .plus..() veya .minus..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istedgimiz deger kadar ileri veya geriye alir

        System.out.println(saat.plusHours(5).plusMinutes(12).plusSeconds(10));

        System.out.println(saat.minusHours(3).minusMinutes(5));

        System.out.println(saat.isBefore(baslangic)); // true

        System.out.println(bitis.isAfter(baslangic)); // true

        System.out.println(saat.isAfter(bitis)); // false

    }
}
