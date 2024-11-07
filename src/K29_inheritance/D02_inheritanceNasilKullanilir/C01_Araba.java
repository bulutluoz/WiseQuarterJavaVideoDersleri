package K29_inheritance.D02_inheritanceNasilKullanilir;

public class C01_Araba {

    /*
        OOP ile bir proje olustururken,
        bir class semasi olustururuz

        bir class olusturdugumuzda ilk dusunmemiz gereken sey

        bu class'dan bir obje uretilecek mi ?
        yoksa bazi baska class (child class)'lar  icin CATI GOREVI mi gorecek
     */

    /*
        Bazi class'lar obje olusturmak icin degil
        child class'larin hepsinde olan ORTAK OZELLIKLERI toplayip
        bir CATI CLASS olmak icin olusturulur

        Bu class'dan hic obje olusturulmayacagi icin
        ve cok farkli child class'lari olacagi icin
        variable'lara deger atamasak da olur
     */

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public String motor = "Motor secenegi belirtilmedi";
    public String sanzuman = "Sanzuman secilmedi";
    public String kasa = "Kasa secilmedi";


}
