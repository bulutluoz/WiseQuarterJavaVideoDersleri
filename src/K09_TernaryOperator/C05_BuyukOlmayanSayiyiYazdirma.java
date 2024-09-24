package K09_TernaryOperator;

import java.util.Scanner;

public class C05_BuyukOlmayanSayiyiYazdirma {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        System.out.println(  sayi1 < sayi2 ?  sayi1 : sayi2   );

    }
}
