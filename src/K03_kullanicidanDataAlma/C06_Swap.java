package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //                     ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci tamsayiyi giriniz...");
        int sayi1 = scanner.nextInt(); // 25

        System.out.println("Ikinci tamsayiyi giriniz...");
        int sayi2 = scanner.nextInt(); // 40

        int temp = 0;       // s1=25 s2=40 temp=0
        temp = sayi2;       // s1=25 s2=40 temp=40
        sayi2 = sayi1;      // s1=25 s2=25 temp=40
        sayi1 = temp;       // s1=40 s2=25 temp=40

        System.out.println("sayi1'in yeni degeri : " + sayi1); // 40
        System.out.println("sayi2'nin yeni degeri : " + sayi2); // 25


    }
}
