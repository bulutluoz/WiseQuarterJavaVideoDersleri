package K20_constructors.D01_constructorNedir_nicinKullanilir;

public class C05_FabrikaRunner_DefaultConstructor {


    public static void main(String[] args) {

        // C04_Fabrika class'indan bir obje olusturup kullanalim


        C04_Fabrika isci1 = new C04_Fabrika();


        isci1.perIsim = "Ali";
        isci1.perAdres = "Balgat";
        isci1.perTel = "5433454545";

        System.out.println(isci1.perIsim); // Ali
        System.out.println(isci1.perAdres); // Balgat
        System.out.println(isci1.perTel); // 5433454545



    }


}
