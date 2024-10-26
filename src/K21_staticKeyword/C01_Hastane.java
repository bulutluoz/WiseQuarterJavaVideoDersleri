package K21_staticKeyword;

public class C01_Hastane {





    static String hastaneIsmi = "Yildiz hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekim = "Dr Esra";

    String perIsim = "isim atanmamis";
    String perAdres = "adres atanmamis";
    String perTel = "tel atanmamis";


















    @Override
    public String toString() {
        return "Instance ozellikler : " +
                "perIsim : " + perIsim +
                " --- perAdres : " + perAdres +
                " --- perTel : " + perTel +
                "\nStatic ozellikler   : " +
                "hastaneIsmi : " + hastaneIsmi +
                " --- hastaneAdresi : " + hastaneAdresi +
                " --- bashekim : " + bashekim ;
    }
}
