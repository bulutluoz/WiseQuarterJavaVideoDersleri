package K33_exceptions.D01_ExceptionNedir_TryCatchBloklari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatchKullanimi {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin

        /*
            Ongordugumuz problem if else ile cozulebiliyorsa cozeriz

            Eger if-else ile cozulemezse
            try-catch blogu kullaniriz

            try blogu hata olusma riski olan kodlari calistirir
            try blogunun tek basina yazilmasi anlamsiz olur,
            mutlaka catch ve/veya finally bloklari ile calismalidir

            catch keyword'unun onundeki parantezde bulunan exception
            karsilasmayi bekledigimiz exception olmalidir

            (InputMismatchException e)
            bu kod su anlama gelir
            Eger try blogunda kodlari calistirirken
            InputMismatchException olusursa
            hata raporunu e objesine kaydet
            ve catch blogunu calistir
            catch() {  }

            try blogunda exception olusmazsa
            catch blogunun calismasina gerek olmaz
            (yangin yoksa, yangin sondurme tupunu kullanmaya gerek yok)


         */


        boolean calismayaDevamEdeyimMi = true;

        while (calismayaDevamEdeyimMi){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen iki tamsayi giriniz...");

            int sayi1 = 0;
            int sayi2 = 0;

            try {

                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();

                if (sayi2 != 0){
                    System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
                    calismayaDevamEdeyimMi = false;
                }else System.out.println("2.sayi 0 olamaz");

            } catch (InputMismatchException e) {

                System.out.println("Tamsayi degeri girmelisiniz");

            }

        }







        System.out.println("Kod normal calisirsa bu satir yazdirilir");



    }
}
