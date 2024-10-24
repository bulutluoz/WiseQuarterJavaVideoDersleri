package K11_stringManipulations.D03_startswith_endsWith_indexOf;

import java.util.Scanner;

public class C08_lastIndexOf {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metni girin...");
        String metin = scanner.nextLine();

        int ilkKullanimIndexi = cumle.indexOf(metin);
        int sonKullanimIndexi = cumle.lastIndexOf(metin);

        if (ilkKullanimIndexi == -1){
            System.out.println("cumle aranan metni icermiyor");
        } else if (  ilkKullanimIndexi == sonKullanimIndexi ) {
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        } else {
            System.out.println("cumle aranan metni 1'den fazla iceriyor");
        }

    }
}
