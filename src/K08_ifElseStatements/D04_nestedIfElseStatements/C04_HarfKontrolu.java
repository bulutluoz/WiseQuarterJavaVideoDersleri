package K08_ifElseStatements.D04_nestedIfElseStatements;

import java.util.Scanner;

public class C04_HarfKontrolu {
    public static void main(String[] args) {

        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici harfler disinda bir karakter girerse
                - "Tanimlanmamis karakter" yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter giriniz..");
        char karakter= scanner.next().charAt(0);

        if ('a'<=karakter && karakter<='z'){ // kucuk harf bolumu

            if (karakter == 'a') System.out.println("guzel harf");
            else if (karakter=='b' || karakter=='c' || karakter=='d') System.out.println("idare eder");
            else System.out.println("girilen kucuk harfi begenmedim");


        } else if (Character.isUpperCase(karakter)) { // buyuk harf bolumu

            if (karakter == 'K') System.out.println("guzel harf");
            else if (karakter=='L' || karakter=='V' || karakter=='Z') System.out.println("idare eder");
            else System.out.println("girilen buyuk harfi begenmedim");

        } else {

            System.out.println("Tanimlanmamis karakter");
        }


    }
}
