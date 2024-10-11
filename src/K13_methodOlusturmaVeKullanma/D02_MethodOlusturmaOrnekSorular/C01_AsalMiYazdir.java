package K13_methodOlusturmaVeKullanma.D02_MethodOlusturmaOrnekSorular;

public class C01_AsalMiYazdir {

    public static void main(String[] args) {


        // Verilen bir tamsayinin,
        // asal sayi olup olmadigini kontrol edip, sonucu yazdiran bir method olusturun

        asalMiYazdir(30); // Verilen 30 sayisi asal degil

        asalMiYazdir(43); // Verilen 43 sayisi asal


    }


    public static void asalMiYazdir( int sayi ){


        for (int i = 2; i < sayi ; i++) {


            if (sayi % i == 0){
                System.out.println("Verilen "+ sayi + " sayisi asal degil");
                break;
            }

            if (i == sayi-1){

                System.out.println("Verilen "+ sayi + " sayisi asal");
            }

        }


    }




}
