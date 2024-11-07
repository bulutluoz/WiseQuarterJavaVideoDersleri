package K29_inheritance.D03_ConstructorCall;

public class C03_Corsa extends C02_Opel {

    C03_Corsa(){

        System.out.println("Corsa parametresiz constructor calisti");
    }

    String model = "Corsa";
    String kasa = "Corsa kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Almanya";
    String aku = "volta aku";

    public static void main(String[] args) {

        C03_Corsa corsa1 = new C03_Corsa();

        System.out.println(corsa1.aku); // volta aku
        System.out.println(corsa1.model); // Corsa

        /*

            1- child class'dan olusturulan bir obje
               sadece kendi class'indaki ozelliklere degil
               parent class(lar)'daki ozelliklere de sahip olurlar

            2- Bir obje olusturuldugunda
               objenin bir class'daki instance variable'lara sahip olmasi icin
               o class'in constructor'i CALISMALIDIR

            3- O zaman child class'da obje olusturulurken
               parent class constructor'larinin da CALISMASI GEREKMEKTEDIR

            4- Java bu islemi gerceklestirmek icin basit bir kural olusturmustur
               extends keyword kullanan class'larda
               var olan ya da olusturulan HER CONSTRUCTOR'in ilk satirinda
               Constructor Call OLMAK ZORUNDADIR

            5- EGER kodu yazanlar ilk satira ConstructorCall yazmazlarsa
               Java varsayilan olarak super(); constructor call koyar
               yani ONCE Parent Class'daki parametresiz constructor CALISMALI der

         */

        System.out.println(corsa1.marka); // Opel
        System.out.println(corsa1.guvenlik); // DGS1001

    }


}
