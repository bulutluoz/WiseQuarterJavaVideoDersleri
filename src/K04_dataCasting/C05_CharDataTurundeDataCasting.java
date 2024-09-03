package K04_dataCasting;

public class C05_CharDataTurundeDataCasting {

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

//        chr = bl;
//        chr = (char) bl; // true
        chr = (char)byt;
        chr = (char)shrt;
        chr = (char)sayiInt;
        chr = (char)lng;
        chr = (char)flt;
        chr = (char)dbl;
//        chr = str;
//        chr = (char)str;

        byt = (byte)chr;
        shrt = (short)chr;
        sayiInt = chr;
        lng = chr;
        flt = chr;
        dbl = chr;
        flt = 'a';
        dbl = 'b';
        sayiInt = 'c';
//        str = chr;
//        bl = chr;


    }
}
