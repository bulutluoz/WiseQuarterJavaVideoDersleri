package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C08_AutoRunner {

    public static void main(String[] args) {

        C07_Auto oto1 = new C07_Auto();

        System.out.println(oto1);
        // C07_Auto :  marka='marka atanmamis', model='model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0


        C07_Auto oto2 = new C07_Auto("Mercedes","E200");

        System.out.println(oto2);

        // C07_Auto :  marka='Mercedes', model='E200', renk='Renk atanmamis', yil=1900, fiyat=0


        C07_Auto oto3 = new C07_Auto("BMW","520",2010);

        System.out.println(oto3);
        // C07_Auto :  marka='BMW', model='520', renk='Renk atanmamis', yil=2010, fiyat=0


        C07_Auto oto4 = new C07_Auto("Nissan","Micra","Beyaz",2015,7000);

        System.out.println(oto4);
        // C07_Auto :  marka='Nissan', model='Micra', renk='Beyaz', yil=2015, fiyat=7000

        C07_Auto oto5 = new C07_Auto("Tofas","Sahin","Kirmizi",1990,10000);
        System.out.println(oto5);
        // C07_Auto :  marka='Tofas', model='Sahin', renk='Kirmizi', yil=1990, fiyat=10000










    }
}
