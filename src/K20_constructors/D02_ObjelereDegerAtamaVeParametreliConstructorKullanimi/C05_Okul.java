package K20_constructors.D02_ObjelereDegerAtamaVeParametreliConstructorKullanimi;

public class C05_Okul {





    String ogrIsim = "isim atanmamis";
    String ogrAdres = "adres atanmamis";
    String ogrTel = "tel atanmamis";
    String ogrSube= "sube atanmamis";


    public double notOrtalamasi(double not1, double not2){

        return (not1+not2)/2 ;

    }

    C05_Okul(){
        // bu constructor default constructor degildir
        // ama bu haliyle default constructor ile ayni isleve sahiptir
        // parametresizdir ve body'sinde kod yok

        // biz gorunur constructor olusturdugumuzda
        // Java var olan default constructor'i sildiginden
        // default constructor kullanmis olan objeler
        // sorun yasamasin diye biz bu constructor'i olusturduk
    }

    C05_Okul(String isim, String adres, String tel){
        ogrIsim = isim;
        ogrAdres = adres;
        ogrTel = tel;
    }

    C05_Okul(String isim, String adres, String tel,String sube){

        ogrIsim = isim;

        ogrAdres = adres;

        ogrTel = tel;

        ogrSube = sube;

    }












    @Override
    public String toString() {
        return "C05_Okul  : " +
                "ogrIsim='" + ogrIsim + '\'' +
                ", ogrAdres='" + ogrAdres + '\'' +
                ", ogrTel='" + ogrTel + '\'' +
                ", ogrSube='" + ogrSube + '\'';
    }
}
