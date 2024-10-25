package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C03_Car {





    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat ;


    @Override
    public String toString() {
        return "C03_Car  : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
