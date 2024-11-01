package K24_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_LocalDateTime_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();


        /*
            Tarih ve zamani istediginiz formatta yazdirabilirsiniz
            once istediginiz formati hazirlamalisiniz
            Java'da istenen formati hazirlamak icin DateTimeFormatter class'indan
            format olusturulmasi gerekir
         */

        /*
            format icin oncelikle istenen yazim biciminin
            String olarak bir modelini (pattern) olusturmalisiniz,
            sonrasinda istediginiz tarihi hazirladiginiz pattern'e uygun formatta yazdirabilirsiniz.

            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */

        System.out.println(ldt); // 2024-11-01 T 09:04:32.957330
        // 01.11.2024 Cuma
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");
        System.out.println(ldt.format(format1)); //  01.11.2024 Friday


        // 1/November/2024 297.gun
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("d/MMMM/yyyy DDD");
        System.out.println(ldt.format(format2) + ".gun"); // 1/November/2024 306.gun


        // 1 Nov 24
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("d MMM yy");
        System.out.println(ldt.format(format3)); // 1 Nov 24


        // 10:19            24 saatlik dilime gore
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ldt.format(format4)); // 09:19



        // 10:19 am         12 saatlik dilime gore

        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format5)); // 09:20 AM


        // 08:23:24         saat, dakika, saniye hepsi 2 basamakli ve 24 saate gore olsun
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(ldt.format(format6)); // 09:21:00

        // 8:3:24         saat, dakika, saniye hepsi tek basamakli olabilsin
        DateTimeFormatter format7 = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(ldt.format(format7)); // 9:21:46


        // Wed Oct 23 3:20 PM
        DateTimeFormatter format8 = DateTimeFormatter.ofPattern("EEE MMM dd hh:mm a");
        System.out.println(ldt.format(format8)); // Fri Nov 01 09:23 AM



    }
}
