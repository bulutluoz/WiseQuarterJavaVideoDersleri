package K33_exceptions.D01_ExceptionNedir_TryCatchBloklari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin



        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz...");

        int sayi1 = 0;
        int sayi2 = 0;


        try {

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("bolecek sayi 0 olamaz");
            } else {
                System.out.println(sayi1 / sayi2);
            }

        } catch (InputMismatchException e) {
            /*
                e yakalanan InputMissmatchException hatasini
                kaydettigimiz variable'dir

                isminin e olmasi sart degildir ama genelde e kullanilir

                Eger isterseniz hata bildirmek icin
                e ile bazi hazir method'lari kullanabilirsiniz
             */

            // System.out.println(e.getCause()); // null
            // System.out.println(e); // java.util.InputMismatchException
            // System.out.println(e.getMessage()); // null
            // e.printStackTrace();
            System.out.println("Girdiginiz deger tamsayi olmali");

        }

        System.out.println("Kod normal calisip bitti");
    }
}
