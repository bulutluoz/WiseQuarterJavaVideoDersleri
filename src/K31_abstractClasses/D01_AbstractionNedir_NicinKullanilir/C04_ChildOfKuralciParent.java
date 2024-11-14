package K31_abstractClasses.D01_AbstractionNedir_NicinKullanilir;

public class C04_ChildOfKuralciParent extends C03_KuralciParent{
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }


    /*
            Class 'C04_ChildOfKuralciParent'
            must either be declared abstract
            or implement abstract method 'method2()' in 'C03_KuralciParent'

            C04'u parent edinen class'lar,
            ya kendilerini abstract olarak deklare etmeli
            ya da C04'de bulunan method2'yi IMPLEMENT etmelidir
     */



}
