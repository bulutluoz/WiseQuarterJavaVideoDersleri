package K02_dataKullanimiVeVariables;

public class C01_VariableKullanimi {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println("hesabim"); // hesabim

        System.out.println("sayi"); // sayi

        System.out.println("benim adim Cemil, ne istersem yaparim..."); // benim adim Cemil, ne istersem yaparim...


        // Java'da bir metin yazdirmak ile
        // bir variable'in degerini yazdirmak farkli seylerdir
        // bir metin yazdirmak istedigimizde "" kullaniriz
        // ve java "" icinde ne goruyorsa konsolda aynisini yazdirir
        // variable'in degerini yazdirmak istedigimizde SADECE variable ismini yazariz

        System.out.println(sayi); // 20

        System.out.println( "sayi variable'inin degeri : " + sayi);
        // sayi variable'inin degeri : 20


        int yas = 40;

        System.out.println("yas variable'inin 30.satirdaki degeri : "  + yas);
        // yas variable'inin 30.satirdaki degeri : 40

        yas = yas + 5 ;

        System.out.println("yas variable'inin 35.satirdaki degeri : "  + yas);
        // yas variable'inin 35.satirdaki degeri : 45


        yas = 2 * yas + 1 ;


        System.out.println("yas variable'inin 42.satirdaki degeri : "  + yas);
        // yas variable'inin 42.satirdaki degeri : 91









    }// main method sonu

}
