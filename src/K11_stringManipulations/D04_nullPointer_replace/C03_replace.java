package K11_stringManipulations.D04_nullPointer_replace;

import java.util.Scanner;

public class C03_replace {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        // metni "a" yerine "A" olacak sekilde yazdirin
        System.out.println(str.replace("a", "A")); // JAvA ogrenmek cok guzel

        // metni 'e' yerine 'E' olacak sekilde yazdirin
        System.out.println(str.replace('e', 'E')); // Java ogrEnmEk cok guzEl

        // "ogrenmek" kelimesini "bilmek" olarak degistirin
        System.out.println(str.replace("ogrenmek", "bilmek")); // Java bilmek cok guzel
        System.out.println(str.replace("k g", "abcd")); // Java ogrenmek coabcduzel

        // tum bosluklari silip, metni bosluk olmadan yazdirin
        System.out.println(str.replace(" ", "")); // Javaogrenmekcokguzel



        //"Java ogrenmek cok guzel";

        // kullanicidan cumledeki degistirmek istedigi kismi
        // ve yerine koymak istedigi metni alin
        // cumleyi yeni haliyle yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumledeki degistirmek istediginiz kismi yaziniz...");
        String eskiMetin = scanner.nextLine();

        System.out.println("Yerine yazmak istediginiz metni soyleyin...");
        String yeniMetin = scanner.nextLine();


        System.out.println(str.replace(eskiMetin, yeniMetin));


    }
}
