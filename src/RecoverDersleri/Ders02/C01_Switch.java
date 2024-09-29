package RecoverDersleri.Ders02;

import java.util.Scanner;

public class C01_Switch {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi = scanner.nextLine().toLowerCase();

        // Kullanicidan gun ismini isteyin
        // Haftaici gunlerinde her gun icin bir bonus verin
        // eger cuma derse sadece cuma gunku bonusu alabilir
        // ama carsamba derse carsamba,persembe ve cuma gunku bonuslari alabilir

        switch ( gunIsmi ){

            case "pazartesi" :
                System.out.println("bonus 5 : Ulker albeni");
            case "sali" :
                System.out.println("bonus 4 : Eti Cin");
            case "carsamba" :
                System.out.println("bonus 3 : Cici bebe");
            case "persembe" :
                System.out.println("bonus 2 : Cikolatali gofret");
            case "cuma" :
                System.out.println("bonus 1 : Cokoprens");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu icin bonus yok");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis...");
        }


    }
}
