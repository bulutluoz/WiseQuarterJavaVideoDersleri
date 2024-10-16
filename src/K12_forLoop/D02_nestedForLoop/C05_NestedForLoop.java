package K12_forLoop.D02_nestedForLoop;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // Outer loop satirlari kontrol eder

            for (int j = 1; j <= i ; j++) { // Inner loop her satirdaki sutunlari kontrol eder


                System.out.print( j-1 + " ");


            }

            System.out.println("");

        }


    }
}
