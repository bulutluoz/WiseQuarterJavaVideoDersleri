package K04_dataCasting;

public class C02_ExplicitDataCasting {

    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        // bir variable'a kendisinden daha genis data turundeki bir deger ATANABILIR MI?

        // Bu islemi Java otomatik olarak yapmaz
        // eger genis kapsamli DEGERI, dar kapsamli VARIABLE'a atamak istiyorsaniz
        // Java sorumlulugu almanizi ister


        byt = (byte) shrt; // 23
        byt = (byte) sayiInt; // 30
        byt = (byte)lng; // 40
        byt = (byte)flt; // 3.5F
        byt = (byte)dbl; // 4.5

//        shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;

        sayiInt = byt;
        sayiInt = shrt;
        sayiInt = (int)lng;
        sayiInt = (int)flt;
        sayiInt = (int)dbl; // 4.5 int data turu ondalikli kabul etmez
                            // amma biz illa da cevir dersek Java 4.5 degerini int'a sigacak sekilde keser/bicer ve islemi yapar

//        lng = byt;
//        lng = shrt;
//        lng = sayiInt;
//        lng = flt;
//        lng = dbl;

//        flt = byt;
//        flt = shrt;
//        flt = sayiInt;
//        flt = lng;
//        flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        // Sayi degeri alan byte, short, int, long, float ve double variable'lar icin
        // variable'in data turunden daha genis kapsamli olan data turundeki degerleri atama yapmak isterseniz
        // Java sorumluluk almanizi ister,
        // sorumluluk almak icin esitligin saginda () icerisinde cevirmek istedigimiz data turunu yazariz
        // buna Explicit Narrowing (Zorlayarak daraltma) denir

//                 bl = (boolean)chr;
//                 bl = (boolean)byt;
//                 bl = (boolean)sayiInt;
//                 bl = (boolean)flt;
//                 bl = (boolean)str;

//                 str = (String)bl;
//                 str = (String)bl;
//                 str = (String)chr;
//                 str = (String)shrt;
//                 str = (String)lng;

        // boolean veya String data turundeki bir variable'a
        // baska data turundeki degerleri ATAYAMAYIZ

    }
}
