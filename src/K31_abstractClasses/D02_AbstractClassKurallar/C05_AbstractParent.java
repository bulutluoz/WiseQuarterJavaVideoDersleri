package K31_abstractClasses.D02_AbstractClassKurallar;

public abstract class C05_AbstractParent extends C04_AbstractGP {

    // Class 'C05_AbstractParent' must
    // either be declared abstract
    // or implement abstract method 'method3()' in 'C04_AbstractGP'

    // C05 Ya abstract Class olarak deklare edilmeli
    // Ya da C04'deki abstract method'lari implement etmeli

    /*
        Kural 5 : Abstract class'larin abstract child class'lari
                  parent class'daki abstract method'lari
                  implement etmek ZORUNDA DEGILDIR

        Kural 6 : Abstract Parent'larin
                  abstract child'i olan class'lar
                  - Parent class'daki abstract methodlari
                    isterse implement edebilir
                  - Parent class'dakilerin disinda
                    yeni abstract method'lar olusturabilir
     */
    public void method2(){

    }

    /*
            zaten abstract bir class olan abstract grandParent class'inin
            child class'i olarak yine abstract bir class secmemizin
            2 sebebi olabilir
            1- GrandParent class'inda abstract olan method'u
               implement edip concrete'lestirebilir
            2- GrandParent class'indaki abstract method'lara
               ilave olarak yeni abstract method'lar olusturabilir
     */

    public abstract void method7();

    public abstract String method8();
}









