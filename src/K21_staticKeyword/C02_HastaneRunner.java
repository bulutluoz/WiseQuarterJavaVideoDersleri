package K21_staticKeyword;

import K20_constructors.D03_constructorCall.C02;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane hems1 = new C01_Hastane();

        System.out.println(hems1);
        //Instance ozellikler : perIsim : isim atanmamis --- perAdres : adres atanmamis --- perTel : tel atanmamis
        //Static ozellikler   : hastaneIsmi : Yildiz hastanesi --- hastaneAdresi : Cankaya --- bashekim : Dr Esra
        System.out.println(hems1.hastaneIsmi); // Yildiz Hastanesi
        hems1.perIsim = "Ayse";
        hems1.perAdres = "Cankaya";
        hems1.perTel = "5324343431";
        System.out.println(hems1);
        //Instance ozellikler : perIsim : Ayse --- perAdres : Cankaya --- perTel : 5324343431
        //Static ozellikler   : hastaneIsmi : Yildiz hastanesi --- hastaneAdresi : Cankaya --- bashekim : Dr Esra

        C01_Hastane hems2 = new C01_Hastane();
        hems2.perIsim = "Fatma";
        hems2.perAdres = "Yenimahalle";

        hems2.hastaneAdresi = "Yenimahalle";
        hems2.bashekim = "Dr Faruk";

        // hems2
        System.out.println(hems2);
        // Instance ozellikler : perIsim : Fatma --- perAdres : Yenimahalle --- perTel : tel atanmamis
        // Static ozellikler   : hastaneIsmi : Yildiz hastanesi --- hastaneAdresi : Yenimahalle --- bashekim : Dr Faruk
        System.out.println(hems1.hastaneAdresi); // Yenimahalle
        System.out.println(hems1.bashekim); // Faruk


        C01_Hastane hems3 = new C01_Hastane();

        hems3.perIsim = "Leyla";
        hems3.hastaneAdresi = "Balgat";

        System.out.println(hems3);
        //hems3
        //Instance ozellikler : perIsim : Leyla --- perAdres : adres atanmamis --- perTel : tel atanmamis
        //Static ozellikler   : hastaneIsmi : Yildiz hastanesi --- hastaneAdresi : Balgat --- bashekim : Dr Faruk

        System.out.println(hems1.perIsim); // Ayse
        System.out.println(hems2.perIsim); // Fatma

        System.out.println(hems2.hastaneAdresi); // Balgat
        System.out.println(hems1.hastaneAdresi); // Balgat

    }

}
