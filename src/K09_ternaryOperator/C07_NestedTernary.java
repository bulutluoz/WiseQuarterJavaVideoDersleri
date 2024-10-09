package K09_ternaryOperator;

import java.util.Scanner;

public class C07_NestedTernary {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // verilen sayi pozitif ise "pozitif",
        //              negatif ise "negatif"
        //  pozitif veya negatif degilse "notr" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        System.out.println( sayi > 0 ?  "pozitif" : sayi<0 ? "negatif" : "notr"   );


        // sayi tek ise "3'un kati" veya "3'un kati degil" yazdirin
        // sayi cift ise "5'in kati" veya "5'in kati degil" yazdirin


        System.out.println(

                sayi%2 == 0

                ?

                sayi % 5 == 0 ? "5'in kati" : "5'in kati degil" // sayi cift oldugunda calisacak kodlar

                :

                sayi % 3 == 0 ? "3'un kati" : "3'un kati degil"    //"tek oldugunda calisacak kodlar"

        );


    }
}
