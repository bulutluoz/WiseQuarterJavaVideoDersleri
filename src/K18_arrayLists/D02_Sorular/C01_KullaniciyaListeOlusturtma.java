package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        List<String> isimler =   stringListeOlustur();

        System.out.println("Olusturulan liste : " + isimler);




    }


    // Kullanicidan istedigi kadar isim alip,
    // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
    // bir method olusturun.

    public static List<String> stringListeOlustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String girilenIsim = "";

        do {
            System.out.println("Lutfen listeye eklemek icin isim giriniz" +
                    "\nbitirmek icin Q'ya basiniz");

            girilenIsim = scanner.nextLine();

            if (! girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);

            }

        }while ( ! girilenIsim.equalsIgnoreCase("Q") );

        return isimler;

    }



}
