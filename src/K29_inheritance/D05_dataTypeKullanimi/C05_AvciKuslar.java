package K29_inheritance.D05_dataTypeKullanimi;

import java.util.ArrayList;

public class C05_AvciKuslar extends C04_Kuslar{

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        String str = "Java candir";
        ArrayList<String> isimler = new ArrayList<>();

        /*
            String Java'nin olusturdugu bir Class'dir
            ve AYNI ZAMANDA o class'dan olusturulan objeler icin
            DATA TURUDUR

            ayni sey Java'daki tum class'lar icin gecerlidir

            C05_AvciKuslar bizim icin "olusturdugumuz bir class" dir
            ama ayni zamanda avci objesi icin data turudur

            C04_Kuslar bizim icin "olusturdugumuz bir class" dir
            ama ayni zamanda avciKus objesi icin data turudur

            C03_Hayvanlar bizim icin "olusturdugumuz bir class" dir
            ama ayni zamanda avciKusHayvani objesi icin data turudur
         */

        /*
            Bir objenin hangi class'dan olusturuldugunu
            Constructor belirler

            AMMA istersek data turu olarak
            parent class secilebilir

            EGER ozellikler variable olarak olusturulmussa
            DATA TURU belirleyicidir
         */

        // AvciKuslar Class'indan bir obje olusturun

        C05_AvciKuslar avciKartal = new C05_AvciKuslar();
        // avciKartal objesi kullandigi constructor olan C05_AvciKuslar Class'inin bir objesidir
        // avciKartal objesinin data turu esitligin sol tarafinda yazilan Class'dir ==> C05_AvciKuslar
        // Java'da bir obje data turu olarak Parent Class'lari da kullanabilir

        System.out.println(avciKartal.omur); // H yasar ve olurler
        System.out.println(avciKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(avciKartal.kanat); // K kanatlidirlar
        System.out.println(avciKartal.hareket); // A ucarlar
        System.out.println(avciKartal.beslenme); // A et yerler
        System.out.println(avciKartal.gaga); // A sivri gagali
        System.out.println(avciKartal.pence); // A pencelidir

        System.out.println("====================");

        C04_Kuslar kusKartal = new C05_AvciKuslar();
        System.out.println(kusKartal.omur); // H yasar ve olurler
        System.out.println(kusKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(kusKartal.kanat); // K kanatlidirlar
        System.out.println(kusKartal.hareket); // H hareket ederler
        System.out.println(kusKartal.beslenme); // H beslenirler
        System.out.println(kusKartal.gaga); // K gagalari vardir
        // System.out.println(kusKartal.pence); // K ve H class'larinda yok CTE

        System.out.println("====================");


        C03_Hayvanlar hayvanKartal = new C05_AvciKuslar();
        System.out.println(hayvanKartal.omur); // H yasar ve olurler
        System.out.println(hayvanKartal.solunum); // H nefes alirlar
        System.out.println(hayvanKartal.cogalma); // H cogalirlar
        // System.out.println(hayvanKartal.kanat); // H class'inda yok CTE
        System.out.println(hayvanKartal.hareket); // H hareket ederler
        System.out.println(hayvanKartal.beslenme); // H beslenirler
        //System.out.println(hayvanKartal.gaga); // H class'inda yok CTE
        //System.out.println(hayvanKartal.pence); // H class'inda yok CTE


        // Kuslar class'indan bir obje olusturun
        C04_Kuslar kus1 = new C04_Kuslar();
        System.out.println(kus1.omur); // H yasar ve olurler
        System.out.println(kus1.solunum); // K akcigerle nefes alirlar
        System.out.println(kus1.cogalma); // K yumurtayla cogalirlar
        System.out.println(kus1.kanat); // K kanatlidirlar
        System.out.println(kus1.hareket); // H hareket ederler
        System.out.println(kus1.beslenme); // H beslenirler
        System.out.println(kus1.gaga); // K gagalari vardir
        // System.out.println(kus1.pence); // K ve H class'larinda yok CTE

        C03_Hayvanlar hayvanKus = new C04_Kuslar();
        System.out.println(hayvanKus.omur); // H yasar ve olurler
        System.out.println(hayvanKus.solunum); // H nefes alirlar
        System.out.println(hayvanKus.cogalma); // H cogalirlar
        //System.out.println(hayvanKus.kanat); // H class'inda yok CTE
        System.out.println(hayvanKus.hareket); // H hareket ederler
        System.out.println(hayvanKus.beslenme); // H beslenirler
        //System.out.println(hayvanKus.gaga); // H class'inda yok CTE
        //System.out.println(hayvanKus.pence); // H class'inda yok CTE


        // Hayvanlar class'indan bir obje olusturun

        C03_Hayvanlar hayvan1 = new C03_Hayvanlar();

        // C04_Kuslar hayvan2 = new C03_Hayvanlar();
        // Data turu olarak Constructor'in oldugu class'in kendisi veya parent'lari secilebilir

        System.out.println(hayvan1.omur); // H yasar ve olurler
        System.out.println(hayvan1.solunum); // H nefes alirlar
        System.out.println(hayvan1.cogalma); // H cogalirlar
        //System.out.println(hayvan1.kanat); // H class'inda yok CTE
        System.out.println(hayvan1.hareket); // H hareket ederler
        System.out.println(hayvan1.beslenme); // H beslenirler
        //System.out.println(hayvan1.gaga); // H class'inda yok CTE
        //System.out.println(hayvan1.pence); // H class'inda yok CTE



















    }
}
