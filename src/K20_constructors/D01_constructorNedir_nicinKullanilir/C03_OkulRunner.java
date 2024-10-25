package K20_constructors.D01_constructorNedir_nicinKullanilir;

public class C03_OkulRunner {

    public static void main(String[] args) {


        // C02_Okul class'indan bir obje olusturup, objeyi kullanalim

        C02_Okul ogrenci1 = new C02_Okul();

        System.out.println(ogrenci1.ogrIsim); // isim atanmamis
        ogrenci1.ogrIsim = "Ali";
        ogrenci1.ogrAdres = "Cankaya";
        ogrenci1.ogrTel = "05322343434";


        System.out.println(ogrenci1.ogrIsim); // Ali
        System.out.println(ogrenci1.ogrAdres); // Cankaya
        System.out.println(ogrenci1.ogrTel); // 05322343434


        // C02_Okul class'indan bir obje deklare edip deger atamasi yapmayalim
        // ve objeyi kullanmaya calisalim

        C02_Okul ogrenci2;

        //System.out.println(ogrenci2.ogrIsim);
        // bir obje icin constructor calismazsa
        // o obje olusturulup ilk deger atamasi (initialize) YAPILAMAZ
        // ogrenci2'ye deger atanmadigi icin
        // kullanmaniza JAVA IZIN VERMEZ, CTE olusur


        C02_Okul ogrenci3 = null;

        //System.out.println(ogrenci3.ogrIsim); // NullPointerException



        // C02_Okul class'indan deklare etmeden bir obje olusturup kullanalim

        System.out.println(new C02_Okul().ogrIsim); // isim atanmamis

        new C02_Okul().ogrIsim = "Mehmet";


        /*

                obje deklare edilip , constructor calisirsa
                obje sorunsuz kullanilir (ogrenci1)

                obje deklare edilip, constructor calismazsa,
                obje olusturulmus olmaz,
                dolayisiyla objenin hic bir ozelligi KULLANILAMAZ

                obje deklare edilmeden, constructor calisirsa
                objenin bir ismi olmaz,
                SADECE olusturuldugu satirda kullanilabilir,
                sonraki satira gecildiginde obje cop olur

         */

    }
}
