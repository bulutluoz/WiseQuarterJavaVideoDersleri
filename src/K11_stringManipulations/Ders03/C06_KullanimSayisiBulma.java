package K11_stringManipulations.Ders03;

import java.util.Scanner;

public class C06_KullanimSayisiBulma {

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


        int metninIlkIndexi = cumle.indexOf(metin); // ilk kullanimi bulursa degeri, bulamazsa -1

        int metninIkinciKulllanimIndexi = cumle.indexOf(metin, metninIlkIndexi+1);
        // ikinci kullanim varsa degeri, yoksa -1

        if (metninIlkIndexi == -1){
            System.out.println("cumle aranan metni icermiyor");
        } else if (metninIkinciKulllanimIndexi == -1) { // ilk kullanim -1 degil ama 2.kullanim -1
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        }else{ // ilk kullanim -1 degil, 2.kullanim da -1 degil
            System.out.println("cumle aranan metni 1'den fazla iceriyor");
        }


    }
}
