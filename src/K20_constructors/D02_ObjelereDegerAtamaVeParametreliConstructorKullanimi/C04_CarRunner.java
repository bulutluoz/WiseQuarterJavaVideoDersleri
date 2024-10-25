package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C04_CarRunner {

    public static void main(String[] args) {

        /*
            Bir class'da default constructor disinda bir constructor kullaniliyorsa
            obje ozelliklerini gorebilmek icin
            MUTLAKA kod takip edilmelidir
         */

        // C03_Car class'indan bir obje olusturup tum ozelliklerini yazdirin

        C03_Car car1 = new C03_Car();

        System.out.println(car1.toString());
        // C03_Car  : marka='marka atanmamis', model='model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0



        System.out.println( car1 );
        // C03_Car  : marka='marka atanmamis', model='model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0


        // olusturdugunuz objeye kendi istediginiz degerleri atayin ve tum ozellikleri tekrar yazdirin

         car1.marka = "Audi";
         car1.model = "A4";
         car1.renk = "Siyah";
         car1.yil = 2014;
         car1.fiyat = 10000;

        System.out.println(car1);
        // C03_Car  : marka='Audi', model='A4', renk='Siyah', yil=2014, fiyat=10000


        // yeni obje olusturun



        // olusturdugunuz yeni objeye kendi istediginiz degerleri atayin ve tum ozellikleri tekrar yazdirin






    }
}
