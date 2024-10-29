package K22_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu","Dilan","Bahadir","Maya"));

        // verilen bir isim listesini parametre olarak alip
        // kullanicidan bir isim alip listeye ekleyen
        // ve listenin yeni halini yazdiran bir method olusturun

        birIsimEkle(isimler); // method da listeye bir isim ekledim : [Cansu, Dilan, Bahadir, Maya, ali]

        System.out.println("main method'da liste : " + isimler);
        // main method'da liste : [Cansu, Dilan, Bahadir, Maya, ali]
        // method'da listenin kendisine atama yapildi mi ? HAYIR
        // degisiklik kabulumuzdur



        // verilen isimler listesine yeni bos bir liste atayip
        // sonra kullanicidan 1 isim alip listeye ekleyen
        // ve listenin son halini yazdiran bir method olusturun

        yeniListeOlustur(isimler);
        //method'da yeni liste olusturup bir isim ekledim : [ali]

        System.out.println("main method'da liste : " + isimler);
        // main method'da liste : [Cansu, Dilan, Bahadir, Maya, ali]
        // method'da listenin kendisine atama yapildi mi ? EVET
        // PassByValue geregi bu degisiklik kabul edilemez
        // main method'da liste : [Cansu, Dilan, Bahadir, Maya, ali]



    }



    public static void birIsimEkle(List<String> isimler){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scanner.nextLine();

        isimler.add(isim);

        System.out.println("listeye bir isim ekledim : "+ isimler);


    }

    public static void yeniListeOlustur(List<String> isimler){

        isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim = scanner.nextLine();

        isimler.add(isim);

        System.out.println("yeni liste olusturup bir isim ekledim : "+ isimler);


    }
}
