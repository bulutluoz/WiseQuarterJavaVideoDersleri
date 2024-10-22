package K20_constructors.D01_constructorNedir_nicinKullanilir;

public class C04_Fabrika {

    C04_Fabrika(){

    }

    /*
        5-6-7. satirlardaki constructor
        bu haliyle default constructor ile ayni isleve sahiptir

        AMMMA gorunur oldugu icin
        bu constructor'a default constructor DENILMEZ

        bu constructor parametresiz bir constructor'dir

        VEEE biz gorunur parametresiz bu constructor'i olusturdugumuz icin
        Java default constructor'i SILER
     */



    String perIsim = "isim atanmamis";
    String perAdres = "adres atanmamis";
    String perTel = "tel atanmamis";


    public double maasHesabi(double mesai, double fazlaMesai){

        return (mesai * 17 +fazlaMesai*23);
    }


     /*
            Java OOP(Object Oriented Programming) kullanir

            Yani biz java ile
            once Class'lar olusturup
            o class'lardan olusturacagimiz objeler ile
            istedigimiz islemleri yapariz

            Java olusturulan her class'dan
            OBJE OLUSTURULABILMESI icin
            Her class'a bir CONSTRUCTOR koyar

         */

     /*
        Java'nin default olarak koydugu
        bu constructor GORUNMEZ

        default constructor parametresizdir
        ve body'sinde kod OLMAZ.

        EGER kod yazilirken gorunur bir constructor olusturulursa
        Java default constructor'i siler
      */
}
