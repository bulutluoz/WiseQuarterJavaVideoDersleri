package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_FibonacciSayilariniYazdir {

    public static void main(String[] args) {

        // kullanicidan pozitif bir n tamsayisini alip,
        // ilk n tane Fibonacci sayisini bir liste olarak yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233


        System.out.println(fibonacciSerisiOlustur(4)); // [0, 1, 1, 2]

        System.out.println(fibonacciSerisiOlustur(10)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

        System.out.println(fibonacciSerisiOlustur(20));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kac adet fibonacci sayisi istediginizi giriniz...");

        int n = scanner.nextInt();

        List<Integer> fibopnacciSerisi = new ArrayList<>();


        //  n <= 0   hata versin
        //  n == 1   {0}
        //  n == 2   {0, 1}
        //  n > 2    {0, 1, ........


        if ( n <= 0 ) System.out.println("Pozitif bir deger girmelisiniz...");
        else if (n == 1) {
            fibopnacciSerisi.add(0);
        } else if (n == 2) {
            fibopnacciSerisi.add(0);
            fibopnacciSerisi.add(1);
        }else{

            fibopnacciSerisi.add(0);
            fibopnacciSerisi.add(1);

            for (int i = 2; i <n ; i++) {

                fibopnacciSerisi.add(  fibopnacciSerisi.get(i-2) + fibopnacciSerisi.get(i-1)  );

            }


        }

        System.out.println(fibopnacciSerisi);

    }


    // Verilen pozitif bir n tamsayisini alarak,
    // bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.


        public static List<Integer> fibonacciSerisiOlustur(int seridekiElementSayisi){

            List<Integer> fibopnacciSerisi = new ArrayList<>();


            if ( seridekiElementSayisi <= 0 ) System.out.println("Pozitif bir deger girmelisiniz...");
            else if (seridekiElementSayisi == 1) {
                fibopnacciSerisi.add(0);
            } else if (seridekiElementSayisi == 2) {
                fibopnacciSerisi.add(0);
                fibopnacciSerisi.add(1);
            }else{

                fibopnacciSerisi.add(0);
                fibopnacciSerisi.add(1);

                for (int i = 2; i <seridekiElementSayisi ; i++) {

                    fibopnacciSerisi.add(  fibopnacciSerisi.get(i-2) + fibopnacciSerisi.get(i-1)  );

                }


            }

            return fibopnacciSerisi;
        }

}
