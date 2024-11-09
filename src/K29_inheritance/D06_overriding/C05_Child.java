package K29_inheritance.D06_overriding;

public class C05_Child extends C04_Parent {

    /*
            Child class'ta parent class'tan bir methodu
            override etmek istersek
            öncelikli olarak parent class ile
            aynı signature'a sahip bir method oluşturulabilir
            signature farklı olursa
            ismin aynı olması override sağlamaz
     */
    public void beslenme(){

    }

    public void solunum(){

    }

    public void method1(int sayi){ // method1 int

    }

    /*
        override method oluşturmak için
        @Override notasyonu kullanılabilir
        fakat bu notasyonu kullanmak zorunlu değildir.

        Override notasyonu intellij tarafından otomatik oluşturulur.
        bu notasyon parent class'taki override edilen methodu takip eder
        Eğer silinir veya signature değiştirilirse override işlemi geçersiz olur.
        Bu geçersizlik nedeniyle de @Override notasyonu sayesinde CTE verir

        Notasyon kullanılmayan override işleminde
        parent class'taki method takip edilmez
        silinmesi ya da değişmesi durumunda
        Overrriding özelliği biter fakat kod çalışmaya devam eder.

        Değişme ya da silinme sonucu CTE verdiren body kısmı değil
        signature kısmıdır.
     */

    @Override
    public void method2(int sayi) {


    }

    public void method3(String str){


    }

     /*
          static olarak işaretlenen methodlar override edilemezler

          child class'ta aynı signature sahip bir method oluşur
          ama bu ikisi override ilşkisi kurmazlar
          her nekadar signature'ları aynı olsa da static olarak işaretlendikleri için
          birbirinden bağımsız iki farklı method olarak çalışırlar

          parent class'ta static olarak işaretlenmiş bir methodu
          child clas içinde aynı signature kullanılarak
          static keyword kullanılmadan OLUŞTURAMAZSINIZ
          Oluşturmaya çalışırsanız CTE verir
     */


      public static void method4(){


      }


    /*
          parent class'ta final olarak işaretlenen bir method
          Child class'ta override edilemez
     */


    //public int method5(){
        // 'method5()' cannot override
        // 'method5()' in '.C04_Parent';
        // overridden method is final
       // return 10;
   // }



    /*
         parent class'ta private olarak işaretlenmiş bir method
         child classta aynı signature ile oluşturulabilir
         bu oluşturma override sağlamaz

         private class uyeleri class disindan gorulemeyecegi icin
         child class'daki method override etmis olmaz
         ikisi birbirinden farkli 2 method olarak yola devam ederler
     */

    public void method6(){

    }


    /*
         overriding icin onemli olan signature'dir.

         access modifier siganture'a dahil olmasa da
         overriding de access modifier önemlidir.
         child class'taki access modifier
         parent class'taki modifier'dan daha kısıtlayıcı olamaz

         yani paretnt class'taki defult method
         ancak default, protected veya public olarak
         override edilebilir
         Sınırlılık Sıralaması
         private < default < protected < public
     */


    void method7(){
        // default access modifier OK
        // protected  OK
        // public  OK

    }

    public void method8(){
        // attempting to assign weaker access privileges ('package-private');
        // was 'protected'
        // parent class'daki method protected
        // protected, public OK
        // private-default acccess modifier OLMAZ
    }



    /*
          eğer override edilen methodun return-type'ı
          non-primitve ise
          overriding methodun da return type'ı
          ya aynısı olacak yada aralarında IS-A relationship ilişikisi
          olan bir return type seçilmelidir (Covariant)
          örnek String is a Object gibi

          Primitive data türlerinde paret-child ilişkisi olmadığı için
          Override eden ile edilenin return Type'ı aynı olmalıdır
     */

    public void method9(){
        // parent class'daki overridden method'un return type'i void
        // child class'daki method da void olmak ZORUNDADIR
    }
    public int method10(){
        // parent class'daki overridden method'un return type'i primitive int
        // child class'daki method da AYNI PRIMITIVE data turunde olmak ZORUNDADIR
        return 20;
    }
    public String method11(){
        // parent class'daki overridden method'un return type'i non-primitive String
        // Child class'daki overriding method'un return type'i
        // String veya String'in Child class'lari olabilir
        return null;
    }

    public Integer method12(){
        // Integer Object'nin child class'idir
        // INteger is-a Object
        return 0;
    }
    public Short method13(){

        return 0;
    }
    // public Short method14(){
        // Parent class'daki return type Integer
        // Short Integer'in child class'i olmadigindan
        // bu method olusturulamaz
        // return 0;
    //}



    /*
         overriding yapıldığında
         body'si birbirinden farklı olan ki metod'dan
         sadecebirisi çalışır

         her ikisininde çalışmasını istiyorsam
         super.methodIsmi(); kullanılır
         bunu yazarak parettaki methodun da çalışmasını sağlayabiliriz
     */


    @Override
    public void method15() {

        super.method15();
    }



}
