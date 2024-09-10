package K07_Operatorler;

public class C03_MantiksalOperatorler {

    public static void main(String[] args) {

        // Eger bir degerin verilen aralikta olup olmadigina bakmak istersek
        // && operatoru tercih edilir

        char verilenHarf = 't';

        // verilen harfin kucuk harf oldugunu kontrol edin

        System.out.println( verilenHarf >= 'a'  && verilenHarf <='z'   ); // true

        // verilen harfin a ile k arasinda oldugunu kontrol edin

        System.out.println( verilenHarf >= 'a' && verilenHarf <='k' ); // false


        int verilenSayi = 25;

        // verilen sayinin 2 basamakli oldugunu kontrol edin

        System.out.println( verilenSayi >= 10 && verilenSayi <=99); // true


        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) oldugunu kontrol edin

        System.out.println(verilenSayi >= 100 && verilenSayi <= 200); // false


        // Eger bir degerin verilen araligin disinda oldugunu kontrol etmek istersek
        // || operatoru kullanilmalidir

        verilenHarf = 'y';


        // verilen harfin kucuk harf olmadigini kontrol edin

        System.out.println( verilenHarf <'a' || verilenHarf >'z'); // false



        // verilen harfin a ile t arasinda (a ve t dahil) olmadigini kontrol edin

        System.out.println(verilenHarf<'a' || verilenHarf>'t'); // true




        verilenSayi = 25;

        // verilen sayinin 3 basamakli pozitif sayi olmadigini kontrol edin

        System.out.println( verilenSayi <100 || verilenSayi>999); // true

        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) olmadigini kontrol edin

        System.out.println( verilenSayi < 100 || verilenSayi > 200); // true




    }
}
