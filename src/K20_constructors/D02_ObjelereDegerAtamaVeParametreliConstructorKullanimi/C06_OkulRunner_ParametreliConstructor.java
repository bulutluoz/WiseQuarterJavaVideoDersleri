package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C06_OkulRunner_ParametreliConstructor {


    public static void main(String[] args) {

        // C05_Okul class'indan bir obje olusturup tum ozelliklerini yazdirin

        C05_Okul ogr1 = new C05_Okul();

        System.out.println(ogr1);
        // C05_Okul  : ogrIsim='isim atanmamis', ogrAdres='adres atanmamis', ogrTel='tel atanmamis', ogrSube='sube atanmamis'


        // olusturdugunuz objeye kendi istediginiz degerleri atayin ve tum ozellikleri tekrar yazdirin

        ogr1.ogrIsim = "Ali Can";
        ogr1.ogrAdres = "Cankaya";
        ogr1.ogrTel = "5322343434";
        ogr1.ogrSube = "5-C";

        System.out.println(ogr1);
        // C05_Okul  : ogrIsim='Ali Can', ogrAdres='Cankaya', ogrTel='5322343434', ogrSube='5-C'


        // argument olarak gonderilen isim, adres ve telefon ile obje olusturan bir constructor olusturun
        // olusturdugunuz yeni constructor ile bir obje olusturun ve tum ozellikleri yazdirin

        C05_Okul ogr2 = new C05_Okul("Veli Cem","Balgat","5434565656");

        System.out.println(ogr2);
        // C05_Okul  : ogrIsim='Veli Cem', ogrAdres='Balgat', ogrTel='5434565656', ogrSube='sube atanmamis'


        C05_Okul ogr3 = new C05_Okul("Ayse Han","Yildiz","5444343434");

        System.out.println(ogr3);

        // C05_Okul  : ogrIsim='Ayse Han', ogrAdres='Yildiz', ogrTel='5444343434', ogrSube='sube atanmamis'



        // tum bilgileri parametre olarak gonderebilecegimiz bir constructor olusturun
        // olusturdugunuz yeni constructor ile bir obje olusturun ve tum ozellikleri yazdirin

        C05_Okul ogr4 = new C05_Okul("Melih Yan","Kizilay","5323454545","9-D");

        System.out.println(ogr4);
        // C05_Okul  : ogrIsim='Melih Yan', ogrAdres='Kizilay', ogrTel='5323454545', ogrSube='9-D'


    }
}
