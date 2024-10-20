package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_FibonacciSayilariniYazdir {

    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini bir liste olarak yazdirin.
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen fibonacci sayilarini yazdirmak icin ust sayi sinirini girin...");
        int maxSayi = scanner.nextInt(); // 1000

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (maxSayi<0){
            System.out.println("ust sinir negatif olamaz");
        } else if (maxSayi == 0) {
            fibonacciSerisi.add(0);
        } else if ( maxSayi == 1) {

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

        }else{

            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int i = 3;
            int birOncekiEleman = fibonacciSerisi.get(i-1);
            int ikiOncekiEleman = fibonacciSerisi.get(i-2);

            while ( birOncekiEleman + ikiOncekiEleman <= maxSayi  ){

                fibonacciSerisi.add(birOncekiEleman + ikiOncekiEleman);
                i++;
                birOncekiEleman = fibonacciSerisi.get(i-1);
                ikiOncekiEleman = fibonacciSerisi.get(i-2);


            }

        }


        System.out.println(fibonacciSerisi);
    }





}
