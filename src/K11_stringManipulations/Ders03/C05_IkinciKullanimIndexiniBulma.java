package K11_stringManipulations.Ders03;

import java.util.Scanner;

public class C05_IkinciKullanimIndexiniBulma {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // girilen metin'de 2. a'nin index'ini yazdirin
        // eger 2. a yoksa metin 2 a icermeli yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz...");
        String str = scanner.nextLine();

        int aHarfininIlkKullanimIndexi = str.indexOf('a');

        int aHarfininIkinciKullanimIndexi = str.indexOf('a',aHarfininIlkKullanimIndexi+1);

        if (aHarfininIkinciKullanimIndexi == -1){
            System.out.println("metin 2 a icermeli");
        }else{
            System.out.println("Verilen metindeki 2. a'nin index'i : " + aHarfininIkinciKullanimIndexi);
        }




    }
}
