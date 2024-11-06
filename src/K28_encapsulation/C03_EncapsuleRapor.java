package K28_encapsulation;

public class C03_EncapsuleRapor {


    private int satisTutari = 0 ;

    // baska class'lardan deger atamasi yapilabilsin  - write yetkisi  OK
    // ama atanmis degerleri kimse goremesin          - read yetkisi   yasak
    // bu ozellikleri saglamak icin setter olusturacagiz (setter)
    // ama getter olusturmayacagiz (getter)


    public void setSatisTutari(int satisTutari) {

        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;
    }

    private int toplamSatisTutari=0;

    // baska class'lardan deger atamasi YAPILAMASIN   - write yetkisi(setter)   yasak
    // ama atanmis degeri GOREBILSIN                  - read yetkisi(getter)    OK


    public int getToplamSatisTutari() {

        return toplamSatisTutari;
    }
}
