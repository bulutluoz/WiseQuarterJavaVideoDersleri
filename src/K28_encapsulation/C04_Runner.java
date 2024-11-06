package K28_encapsulation;

public class C04_Runner {

    public static void main(String[] args) {


        C03_EncapsuleRapor obj = new C03_EncapsuleRapor();

        // satis tutari variable'inin degerini yazdirin

        // obj.satisTutari = 30;
        // System.out.println(obj.satisTutari);

        // System.out.println( obj.setSatisTutari(100));
        // Cannot resolve method 'println(void)'

        obj.setSatisTutari(100);
        obj.setSatisTutari(400);
        obj.setSatisTutari(250);

        // toplam satis tutarini yazdirin

        System.out.println(obj.getToplamSatisTutari()); // 750

        // toplam satis tutarini degistirin

        // obj.getToplamSatisTutari() = 800;
        // esitligin solundaki method bize bir deger dondurdu
        // Halbuki Java atama isleminde
        // esitligin sol tarafinda SADECE variable olmasina izin verir


    }
}
