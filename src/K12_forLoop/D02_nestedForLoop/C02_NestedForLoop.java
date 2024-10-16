package K12_forLoop.D02_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             2 3 4 5 6
             3 4 5 6 7
             4 5 6 7 8
             5 6 7 8 9

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz...");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satirlar

            for (int j = 1; j <=sutun ; j++) { // her satirdaki sutun

                System.out.print(i+j + " ");

            }
            System.out.println("");

        }



    }
}
