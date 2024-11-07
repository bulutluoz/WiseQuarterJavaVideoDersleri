package K29_inheritance.D02_inheritanceNasilKullanilir;

public class C02_Toyota extends C01_Araba {

    /*
        Dunyada toyota olarak adlandirilip,
        modeli olmayan bir arac yok
        O zaman bu Toyota Class'i kendisinden obje olusturmak icin degil
        alt class'lari bir cati altinda toplamak icin olusturulmustur
     */
    /*
        Toyota bir araba'dir (Toyota IS-A Araba)
        O zaman bir araba olarak her seyi sifirdan dusunmek yerine
        Araba standartlarini (Araba class'inda olan ozellikleri) miras alabilir
    */
    /*
        1- bu class baslangic itibariyle parent'i olan
           C08_Araba class'indaki tum ozelliklere sahiptir diyebiliriz
           ornegin bu class'da marka, kasa veya motor variable'lari olmasa da
           parent class'daki var olan variable'lari kullanabiliriz
     */
    protected C02_Toyota(){
//        System.out.println(marka);
//        marka = "Toyota";
//        System.out.println(kasa);
//        System.out.println(sanzuman);
    }
    /*
        2- Toyota class'i isterse parent class'i olan Araba class'indaki
           bazi variable'lari kendisine uyarlayabilir
           ornegin tum Toyota arabalarin markasinin "Toyota" olacagi asikardir.
                   motor icin de Toyota'nin standart bir motor serisi olabilir
     */
    protected String marka = "Toyota";
    protected String motor = "Cevreye duyarli motor";
    /*
        3- Toyota class'i isterse parent class'da olmayan
           yeni ozellikler ekleyebilir
     */
    protected String lastik = "Pirelli";
    protected String guvenlik = "DGS1001";
    protected String fren = "ABS";

    /*
        bu durumda toyota class'indan olusturulacak obje olsa
        Araba class'indan 3 adet ( model, sanzuman, kasa)
        guncelledigi 2 adet (marka, motor)
        ve yeni ekledigi 3 adet (lastik, guvenlik, fren)
        toplam 8 ozellige sahip olur
     */



}
