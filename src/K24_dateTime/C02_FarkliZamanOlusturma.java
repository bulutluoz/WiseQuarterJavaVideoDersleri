package K24_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_FarkliZamanOlusturma {

    public static void main(String[] args) {


        // LocalTime.now(ZoneId) ile istedigimiz ulke/sehirdeki zamani kullanabiliriz

        /*
            İşte bazı örnek ZoneId'ler:

            Amerika Kıtası:

            America/New_York
            America/Chicago
            America/Los_Angeles
            America/Sao_Paulo
            America/Argentina/Buenos_Aires
            Avrupa:

            Europe/London
            Europe/Berlin
            Europe/Paris
            Europe/Istanbul
            Europe/Moscow
            Asya:

            Asia/Tokyo
            Asia/Shanghai
            Asia/Dubai
            Asia/Kolkata
            Asia/Seoul
            Afrika:

            Africa/Cairo
            Africa/Johannesburg
            Africa/Lagos
            Africa/Nairobi
            Okyanusya:

            Australia/Sydney
            Australia/Melbourne
            Pacific/Auckland
            Pacific/Fiji

         */

        LocalTime timeLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London : " + timeLondon);

        LocalTime timeNetherlands = LocalTime.now();
        System.out.println("Amsterdam : " + timeNetherlands);

        LocalTime timeIstanbul = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Istanbul : " + timeIstanbul);


        // LocalTime.of() ile istediginiz degerlere sahip bir zaman variable'i olusturabilirsiniz

        LocalTime istenenZaman = LocalTime.of(10,5,23);

        System.out.println(istenenZaman); // 10:05:23

        LocalTime saniyedenSaat = LocalTime.ofSecondOfDay(44000);
        System.out.println(saniyedenSaat); // 12:13:20
    }
}
