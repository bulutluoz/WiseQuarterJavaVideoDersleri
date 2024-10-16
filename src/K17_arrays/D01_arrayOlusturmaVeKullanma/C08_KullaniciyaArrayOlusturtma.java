package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve Integer elementlerini alip
        // array’i olusturun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturulacak int array'in boyutunu giriniz...");
        int verilenLength = scanner.nextInt();

        int[] arr = new int[verilenLength];

        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Array'e eklemek icin bir tamsayi giriniz...");

            arr[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(arr));

    }

    // Kullanicidan array’in boyutunu ve Integer elementlerini alip
    // array’i olusturan ve bize donduren bir method olusturun.

    public static int[] integerArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturulacak int array'in boyutunu giriniz...");
        int verilenLength = scanner.nextInt();

        int[] arr = new int[verilenLength];

        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Array'e eklemek icin bir tamsayi giriniz...");

            arr[i] = scanner.nextInt();

        }

        return arr;
    }




}
