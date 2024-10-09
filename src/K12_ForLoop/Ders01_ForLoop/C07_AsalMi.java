package K12_ForLoop.Ders01_ForLoop;

import java.util.Scanner;

public class C07_AsalMi {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        for (int i = 2; i < sayi ; i++) {


            if (sayi % i == 0){
                System.out.println("Asal degil");
                break;
            }

            if (i == sayi-1){

                System.out.println("Sayi asal");
            }

        }


    }
}
