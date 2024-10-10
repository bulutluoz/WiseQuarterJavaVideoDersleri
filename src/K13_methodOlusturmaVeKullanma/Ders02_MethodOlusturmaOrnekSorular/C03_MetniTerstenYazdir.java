package K13_methodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C03_MetniTerstenYazdir {

    public static void main(String[] args) {

        // verilen metni tersten yazdiran bir method olusturun

        metniTerstenYazdir("Java bu isi cozmus"); // sumzoc isi ub avaJ

    }


    public static void metniTerstenYazdir( String metin){

        for (int i = metin.length()-1  ; i >=0  ; i--) {

            System.out.print(metin.charAt(i));
        }

    }
}
