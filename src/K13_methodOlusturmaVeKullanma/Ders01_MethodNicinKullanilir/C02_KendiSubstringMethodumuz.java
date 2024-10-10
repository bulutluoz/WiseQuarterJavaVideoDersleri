package K13_methodOlusturmaVeKullanma.Ders01_MethodNicinKullanilir;

public class C02_KendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str = "Java Candir";

        int basIndex = 2;
        int bitIndex = 6;

        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        if (basIndex<0 || bitIndex<0 || basIndex>=str.length() || bitIndex>=str.length()){
            System.out.println("Girilen baslangic ve bitis degerleri gecersiz");
        } else if (basIndex > bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else {

            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(str.charAt(i));
            }
        }


        System.out.println(str.substring(basIndex, bitIndex));


    }
}
