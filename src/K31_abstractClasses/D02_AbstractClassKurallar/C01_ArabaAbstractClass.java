package K31_abstractClasses.D02_AbstractClassKurallar;

public abstract class C01_ArabaAbstractClass {

    // bu class arabalarin barindirmasi gereken zorunlu parcalari
    // ve istege bagli olarak bulundurmasini istedigimiz ozellikleri belirlesin

    // klima
    // ==> zorunlu olmamali, concrete method
    public void klima(){
        System.out.println("Arabalar isterlerse klimali olabilirler");
    }

    // motor
    // zorunlu OLMALI, abstract method olusturmali
    public abstract void motor();
    // her arabanin motoru farkli olabilir
    // AMMA mutlaka motoru olmalidir

    // sase
    // ==> zorunlu
    public abstract void sase();

    // sunroof
    // ==> zorunlu degil, cocrete method
    public void sunroof(){
        System.out.println("Arabalar isterlerse sunroof barindirabilir");
    }



    // child class'lar olusturulduktan sonra
    // araba class'ina 2 method daha eklemek gerekti

    // gosterge ==> zorunlu abstract method
    public abstract void gosterge();

    // deri kaplama koltuk ==> zorunlu degil, concrete method

    public void deriKoltuk(){
        System.out.println("Arabalar isterlerse deri koltuk kullanabilir");
    }




}
