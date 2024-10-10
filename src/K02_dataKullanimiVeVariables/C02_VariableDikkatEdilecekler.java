package K02_dataKullanimiVeVariables;

public class C02_VariableDikkatEdilecekler {

    public static void main(String[] args) {

        // bir variable icin SADECE 1 kere deklarasyon yapilabilir
        // sonrasinda bir daha deklarasyon yapilamaz
        // ama variable istendigi kadar kullanilabilir

        int sayi = 20;


        // int sayi = 30;
        sayi = 30;


        System.out.println( sayi ); // 30

        sayi = sayi + 5;

        System.out.println( sayi ); // 35


        // 2- Esitligin sol tarafinda SADECE variable olur
        //    sag tarafta ise deger

        int yas = 20;

        yas = 2 * yas + 3 ;

        // 2 * yas = 40; // variable expected

        // 20 = yas ; // variable expected


    }
}
