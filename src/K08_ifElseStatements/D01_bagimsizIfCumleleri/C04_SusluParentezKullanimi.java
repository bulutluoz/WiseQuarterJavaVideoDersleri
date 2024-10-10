package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_SusluParentezKullanimi {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if ( sayi % 3 == 0 )
            System.out.println("Uc ile bolunebilen sayi"); // {} kullanilmazsa if body burada biter
            System.out.println("3 ile bolunen sayilari severim");


        if ( sayi % 5 == 0) System.out.println("Bes ile bolunebilen sayi"); // {} kullanilmazsa if body burada biter
            System.out.println("5 ile bolunen sayilari severim");



           /*
            if cumlelerinde eger if body'de sadece 1 satir kod olacaksa
            {} kullanilmayabilir

            ANCAK suslu parantez KULLANILMADIGINDA
            if body'nin ilk ;'e kadar olan kisim kabul edilecegi UNUTULMAMALIDIR
         */


    }
}
