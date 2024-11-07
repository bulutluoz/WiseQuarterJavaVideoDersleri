package K29_inheritance.D02_inheritanceNasilKullanilir;

public class C03_Corolla extends C02_Toyota{

    /*
        Corolla da Toyota'nin bir modelidir
        yani Corolla IS-A Toyota diyebiliriz
        bu durumda Corolla Toyota'nin child'i olmali ve
        Tum Toyota araclarin sahip oldugu ORTAK OZELLIKLERE sahip olmalidir
     */
    /*
       1- baslangic itibariyle parent'i olan Toyota
          ve grand parent'i olan araba class'larindaki
          tum ozelliklere sahiptir
    */
    C03_Corolla(){
//        System.out.println(model); // Model belirtilmedi
//        System.out.println(motor); // Cevreye duyarli motor
//        System.out.println(guvenlik); // DGS1001
    }
    /*
       2- Corolla class'i parent ve grand parent class'larindaki
          istedigi variable'lari kendisine UYARLAYABILIR
    */
    String model = "Corolla";
    String kasa = "Corolla kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";
    /*
       3- Corolla class'i butun corolla araclarda olan
          ama parent class'i Toyota veya grand parent'i olan Araba class'larinda olmayan
          YENI variable'lar ekleyebilir
     */
    String uretimYeri = "Turkiye";
    String aku = "Inci aku";
    String renk = "renk secilmedi";
    String yakitTuru = "yakit turu secilmedi";

    public static void main(String[] args) {

    C03_Corolla corolla1 = new C03_Corolla();

        System.out.println(corolla1.sanzuman); // Sanzuman secilmedi
        corolla1.sanzuman = "Otomatik";

        System.out.println(corolla1.marka); // Toyota
        System.out.println(corolla1.guvenlik); // DGS1001
        System.out.println(corolla1.fren); // ABS

        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.kasa); // Corolla kasasi
        System.out.println(corolla1.motor); // vvdi
        System.out.println(corolla1.lastik); // 15" Pirelli
        corolla1.lastik = "15 Michelin";
        System.out.println(corolla1.uretimYeri); // Turkiye
        System.out.println(corolla1.aku); // Inci aku
        corolla1.renk = "Mavi";
        System.out.println(corolla1.renk); // Mavi
        corolla1.yakitTuru = "Hybrit";
        System.out.println(corolla1.yakitTuru); // Hybrit


    }

}
