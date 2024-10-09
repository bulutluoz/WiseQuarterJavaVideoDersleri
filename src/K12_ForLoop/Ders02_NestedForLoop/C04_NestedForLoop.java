package K12_ForLoop.Ders02_NestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {
        /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                *
                * *
                * * *
                * * * *
                * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) { // satirlari

            for (int j = 1; j <= i ; j++) { // her satirdaki sutunlari

                System.out.print( "* ");
            }

            System.out.println("");

        }

    }
}
