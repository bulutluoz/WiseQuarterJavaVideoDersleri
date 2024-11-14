package K31_abstractClasses.D01_AbstractionNedir_NicinKullanilir;

public class C02_KralChildClass extends C01_KuralciOlmayanParent{

    /*
        Eger normal class yapisi ve inheritance kullanirsak
        Child class KRAL olur
        - parent class'daki tum variable ve method'lari kullanabilir
        - isterse parent class'daki method'lari override edebilir
        - isterse parent class'da olmayan yeni variable veya
          method'lar ekleyebilir
     */
    /*
          Java abstraction sayesinde
          PARENT class'lara
          kendilerini parent edinecek child class'larin
          MUTLAKA OVERRIDE ETMESI GEREKEN METHOD'lari belirleme imkani tanimistir
     */

    public static void main(String[] args) {

        C02_KralChildClass child = new C02_KralChildClass();
        child.method();
    }
    public void method2(){
        System.out.println("Child Class method2 calisti");
    }
    public void method5(){
        System.out.println("Child Class method5 calisti");
    }


    public void method(){

        System.out.println(isim); // Ali
        sayi = 34;
        method1(); // Method1 calisti
        method2(); // Child Class method2 calisti
        this.method2(); // Child Class method2 calisti
        super.method2(); // Method2 calisti

    }


}
