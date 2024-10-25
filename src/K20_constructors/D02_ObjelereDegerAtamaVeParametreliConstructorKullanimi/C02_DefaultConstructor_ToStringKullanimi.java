package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C02_DefaultConstructor_ToStringKullanimi {


    public static void main(String[] args) {

         /*
            Bir class'da default constructor kullaniliyorsa
            olusturulan TUM objeler
            class'da atanmis olan ilk degerlerine sahip olur
        */

        // C01_Araba class'indan bir obje olusturup tum ozelliklerini yazdirin

        C01_Araba araba1 = new C01_Araba();
        System.out.println(araba1.marka); // Toyota
        System.out.println(araba1.model); // Corolla
        System.out.println(araba1.renk); // Kirmizi
        System.out.println(araba1.yil); // 2012
        System.out.println(araba1.fiyat); // 3000


        // olusturdugunuz objeye kendi istediginiz degerleri atayin ve tum ozellikleri tekrar yazdirin

        araba1.marka = "Opel";
        araba1.model = "Corsa";
        araba1.renk = "Mavi";
        araba1.yil = 2005;
        araba1.fiyat = 2000;

        System.out.println(araba1.marka); // Opel
        System.out.println(araba1.model); // Corsa
        System.out.println(araba1.renk); // Mavi
        System.out.println(araba1.yil); // 2005
        System.out.println(araba1.fiyat); // 2000




    }
}
