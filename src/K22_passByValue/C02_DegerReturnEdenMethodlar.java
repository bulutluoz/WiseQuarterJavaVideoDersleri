package K22_passByValue;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {

    public static void main(String[] args) {

        // Verilen isim ve soyisim kac kelime olursa olsun duzenleyip
        // Ilk harfleri buyuk, geriye kalan harfler kucuk olacak sekilde
        // "Isim Soyisim" halinde bize donduren bir method olusturun

        // kullanicidan isim ve soyisim alip
        // method'da duzenleyip yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        // isim ve soyismi yazdirin
        System.out.println(ismiDuzenle(isim, soyisim)); // Ali Mert Yilmaz Su

        // System.out.println(yeniIsim); // method'da olusturuldugu icin scope'u method'dur, main method'da kullanilamaz
    }



    public static String ismiDuzenle(String isim, String soyisim){

        isim = isim + " " + soyisim;
        String[] isimlerArr = isim.split(" ");
        String yeniIsim = "";

        for (int i = 0; i < isimlerArr.length ; i++) {

            yeniIsim += (isimlerArr[i].substring(0,1).toUpperCase()+
                         isimlerArr[i].substring(1).toLowerCase() );
            if (i< isimlerArr.length-1){
                yeniIsim += " ";
            }
        }
        return yeniIsim;
    }
}
