package K31_abstractClasses.D01_AbstractionNedir_NicinKullanilir;

public abstract class C03_KuralciParent {

    /*
        Java'da parent class olmasi planlanan bir class olusturuldugunda
        Parent class kendisini parent edinecek child class'larin
        mutlaka override etmesini istedigi method'lari BELIRLEYEBILIR
    */
    /*
        1- Oncelikle kural koyabilmek icin
           Kural koyan bir class oldugunuzu DEKLARE etmelisiniz
           Bu deklarasyonu yapmak icin
           class'i ABSTRACT olarak tanimlariz
    */
    /*
         2- Child class'larin MUTLAKA override etmesini istediginiz method'lari
            abstract method olarak olustururuz

            Ornegin bu class'da olan method1 ve method2'yi
            Child class'lar MUTLAKA OVERRIDE ETSIN diyorsak
            method1 ve method2'yi abstract method olarak olusturacagiz
    */

    public abstract void method1();
    /*
            Abstract methods cannot have a body
            abstract method'lar normal kullandigimiz(concrete) method'lar gibi degildir

            bu method'u standart belirleyen bir cumle gibi dusunebiliriz
            ve bu method'u soyle tercume edebiliriz :
            C03 class'ini parent edinen her class MUTLAKA method2(){} override etmelidir.
     */

    public abstract int method2();
     /*
            C03 class'ini parent edinen her class MUTLAKA
            int bir deger donduren method2(){} bulundurmalidir
      */

    /*
         3- Child class'larin istedigi gibi kullanmasina izin verdiginiz method'lari
            concrete method olarak olustururuz

            Concrete method'lar icin deklarasyona concrete yazilmaz
            abstract yazmiyorsa method concrete'dir
            bugune kadar olusturdugumuz tum method'lar concrete method'lardi.

            Ornegin : Child clas'larin inheritance cercevesinde kullanabilecekleri
                      yani isterlerse direkt parent class'dan kullancaklari,
                      isterlerse de override edip kendilerine uyarlayabilecekleri
                      method3 ve method4 olusturalim
     */
    // public void method3(); // Missing method body, or declare abstract
    // bir method Ya abstract olarak deklare edilir ve body'si OLMAZ
    //            Ya da concrete olur ve MUTLAKA BODY'si olur

    public void method3(){

    }

    public int method4(){

        return 0;
    }

     /*
            concrete method'lar
            child class'larda istenirse override edilir
            istenirse de override edilmeden direk parent class'dan kullanilir.

     */
}


