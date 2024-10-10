package K12_forLoop.Ders02_NestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {

    public static void main(String[] args) {
        /*

        kullanicidan satir ve sutun sayisini alip asagidaki sekli cizdirin
        orn satir = 3 , sutun= 6 oldugunda

                * * * * * *
                * * * * * *
                * * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz...");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satirlari

            for (int j = 1; j <=sutun ; j++) { // her satirdaki sutunlari

                System.out.print( "* "  );

            }
            System.out.println("");
        }


    }
}
