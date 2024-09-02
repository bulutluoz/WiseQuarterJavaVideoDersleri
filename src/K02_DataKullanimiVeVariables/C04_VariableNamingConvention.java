package K02_DataKullanimiVeVariables;

public class C04_VariableNamingConvention {

    public static void main(String[] args) {

        int YAS = 40;
        int Yas = 67;
        int yas = 30;
        int yAS = 23;
        int yaS = 89;

        // variable isimleri kucuk harfle baslar
        // AMMA buyuk harf ile baslarsaniz
        // Java kodu hata olarak algilamaz, altini cizmez

        System.out.println(yAS); // 23
        System.out.println(yas); // 30
        // System.out.println(YaS); // boyle bir variable yok, hata verir

        // int int = 45; isim olarak java'da tanimli keyword'ler kullanilamaz
        int int1 = 45;

        int ogrencininYasi = 12;
        double sinifinNotOrtalamasi = 23.5;

        double yasOrtalamasi = 13.8;
        yasOrtalamasi = yasOrtalamasi * 4 / 5 ;
        System.out.println(yasOrtalamasi);
    }
}
