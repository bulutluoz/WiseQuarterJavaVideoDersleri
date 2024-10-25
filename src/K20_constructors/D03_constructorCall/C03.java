package K20_constructors.D03_constructorCall;

public class C03 {
    /*
        KOD OKUMA sorularinda dikkat edilmesi gereken en onemli konu
        bu sorularin sizin bilginizi ve dikkatinizi olcmek icin olusturulmus olmasidir.

        Bu sorularda her sey OLMASI GEREKTIGI olmayabilir.

        Kodu biz olusturdugumuzda yapacagimiz adimlardan farkli adimlar atilabilir,
        atamalar olmasi gerektigi gibi yapilmayabilir
        veya bilerek hata yapilabilir

        Bu sorularda yapmamiz gereken sey
        kendimizi Java'nin yerine koymak,
        satir satir kodlari takip etmek
        ve kod'da ne yazilmissa o islemi yapmaktir.

        CTE vermedigi surece kod icin yanlis yazilmis diyemeyiz.
        Kod takip ederken compile time veya Run Time'da ortaya cikacak hatalari da BULMALIYIZ
     */

    int sayi = 23;
    String isim = "Ali";
    char chr = '@';

    C03(){
        chr = '%';
        isim = "Esra";
    } // 1
    C03(int sayi , String ism){
        this();
        this.sayi = 34;
        isim = ism.toUpperCase();
    }  // 2
    C03(int sayi, String name, char a){
        isim = name;
        this.sayi= sayi;
    } // 3

    public static void main(String[] args) {

        C03 obj3 = new C03(22,"Mehmet",'r');
        System.out.println(obj3.sayi); // 22
        System.out.println(obj3.isim); // Mehmet
        System.out.println(obj3.chr); // @



        C03 obj2 = new C03(20,"Kemal");
        System.out.println(obj2.sayi); // 34
        System.out.println(obj2.isim); // KEMAL
        System.out.println(obj2.chr); // %



        C03 obj1 = new C03();
        System.out.println(obj1.sayi); // 23
        System.out.println(obj1.isim); // Esra
        System.out.println(obj1.chr); // %


    }



}
