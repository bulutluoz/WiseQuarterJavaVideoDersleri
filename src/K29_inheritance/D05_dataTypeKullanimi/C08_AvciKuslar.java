package K29_inheritance.D05_dataTypeKullanimi;

public class C08_AvciKuslar extends C07_Kuslar{

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        /*
            EGER ozellikler method olarak olusturuldu ise
            yine aramaya Data Turu olan Class'dan baslariz

            AMMMAAA bulduktan sonra,
            Constructor'in oldugu Class'a kadar
            DAHA GUNCEL BILGI var mi diye kontrol ederiz


            data class'indan aramaya basladiginda
            ozelligi bulamazsa CTE verir
            guncele de bakmaz

            ozellikler variable olarak olusturulmussa
            Data turu tek belirleyicidir
            Ayni data turune sahip objeler
            AYNI Ozelliklleri gosterir


            ozellikler method olarak olusturulmussa
            Sadece DATA TURU degil, CONSTRUCTOR da onemlidir
            AYNI CONSTRUCTOR'a sahip objeler
            Ya AYNI OZELLIGE sahiptir , ya da CTE verir
         */



        // Avci kuslar class'indan bir obje olusturun

        C08_AvciKuslar avciKartal = new C08_AvciKuslar();
        avciKartal.omur(); // H yasar ve olurler
        avciKartal.solunum(); // K akcigerle nefes alir
        avciKartal.cogalma(); // K yumurtayla cogalirlar
        avciKartal.kanat(); // K kanatlidirlar
        avciKartal.hareket(); // A ucarlar
        avciKartal.beslenme(); // A et yerler
        avciKartal.gaga(); // A sivri gagali
        avciKartal.pence();  // A pencelidir

        System.out.println("=====================");

        C07_Kuslar kusKartal = new C08_AvciKuslar();
        kusKartal.omur(); // H yasar ve olurler
        kusKartal.solunum(); // K akcigerle nefes alir
        kusKartal.cogalma(); // K yumurtayla cogalirlar
        kusKartal.kanat(); // K kanatlidirlar
        kusKartal.hareket(); // A ucarlar
        kusKartal.beslenme(); // A et yerler
        kusKartal.gaga(); // A sivri gagali
        // kusKartal.pence();  // K ve H Class'larinda yok CTE

        System.out.println("=====================");

        C06_Hayvanlar hayvanKartal = new C08_AvciKuslar();
        hayvanKartal.omur(); // H yasar ve olurler
        hayvanKartal.solunum(); // K akcigerle nefes alir
        hayvanKartal.cogalma(); // K yumurtayla cogalirlar
        //hayvanKartal.kanat(); // H Class'inda yok CTE
        hayvanKartal.hareket(); // A ucarlar
        hayvanKartal.beslenme(); // A et yerler
        //hayvanKartal.gaga(); // H Class'inda yok CTE
        //hayvanKartal.pence();  // H Class'inda yok CTE

        System.out.println("=====================");
        // Kuslar Class'indan bir obje olusturalim

        C07_Kuslar kus1 = new C07_Kuslar();

        kus1.omur(); // H yasar ve olurler
        kus1.solunum(); // K akcigerle nefes alir
        kus1.cogalma(); // K yumurtayla cogalirlar
        kus1.kanat(); // K kanatlidirlar
        kus1.hareket(); // H hareket ederler
        kus1.beslenme(); // H beslenirler
        kus1.gaga(); // K gagalari vardir
        //kus1.pence();  // K ve H Class'larinda yok CTE

        System.out.println("=====================");


        C06_Hayvanlar hayvanKus = new C07_Kuslar();

        hayvanKus.omur(); // H yasar ve olurler
        hayvanKus.solunum(); // K akcigerle nefes alir
        hayvanKus.cogalma(); // K yumurtayla cogalirlar
        //hayvanKus.kanat(); // H Class'inda yok CTE
        hayvanKus.hareket(); // H hareket ederler
        hayvanKus.beslenme(); // H beslenirler
        //hayvanKus.gaga(); // H Class'inda yok CTE
        //hayvanKus.pence();  // H Class'inda yok CTE

        System.out.println("=====================");


        // Hayvanlar class'indan bir obje olusturun

        C06_Hayvanlar hayvan1 = new C06_Hayvanlar();
        hayvan1.omur(); // H yasar ve olurler
        hayvan1.solunum(); // H nefes alirlar
        hayvan1.cogalma(); // H cogalirlar
        //hayvan1.kanat(); // H Class'inda yok CTE
        hayvan1.hareket(); // H hareket ederler
        hayvan1.beslenme(); // H beslenirler
        //hayvan1.gaga(); // H Class'inda yok CTE
        //hayvan1.pence();  // H Class'inda yok CTE





    }


}










