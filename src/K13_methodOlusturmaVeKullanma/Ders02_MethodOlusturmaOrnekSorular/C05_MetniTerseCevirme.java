package K13_methodOlusturmaVeKullanma.Ders02_MethodOlusturmaOrnekSorular;

public class C05_MetniTerseCevirme {

    public static void main(String[] args) {

        // verilen metnin tersten yazilisini donduren bir method olusturun

        metninTersiniDondur("Ali Can"); // ne konsolda gorunur, ne de sonra kullanabilirim

        System.out.println(metninTersiniDondur("Bu iyiymis")); // simyiyi uB
        // konsolda gorunur, ama sonra kullanilamaz


        String str = metninTersiniDondur("Java Candir");
        // konsolda gorunmez ama sonrasinda kullanilabilir

        System.out.println(str.toUpperCase()); // RIDNAC AVAJ

        System.out.println(str.substring(0, 6)); // RIDNAC


    }


    public static String metninTersiniDondur( String metin ){

        String tersMetin = "";


        for (int i = metin.length()-1  ; i >=0  ; i--) {

             tersMetin += metin.charAt(i);
        }


        return tersMetin;
    }


}
