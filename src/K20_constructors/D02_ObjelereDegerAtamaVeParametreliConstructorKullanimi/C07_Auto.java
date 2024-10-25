package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C07_Auto {

    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat ;

    /*
        Parametre isimlerinin daha anlasilir olmasi icin
        instance variable isimleri ile ayni olmasi tercih edilir
     */

    // parametre olarak marka ve model degerleri alan bir constructor olusturun
    C07_Auto(){

    }

    C07_Auto(String mrk , String mdl){
        marka = mrk;
        model = mdl;
    }

    // parametre olarak marka, model ve yil degerleri alan bir constructor olusturun

    C07_Auto(String marka , String model, int yil){

        this.marka = marka;
        this.model = model;
        this.yil = yil;

    }



    // tum instance variable'lari parametre olarak kabul eden bir Constructor'i intelliJ ile olusturun.


    public C07_Auto(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "C07_Auto :  " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
