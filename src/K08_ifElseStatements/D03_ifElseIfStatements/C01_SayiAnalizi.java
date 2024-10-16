package K08_ifElseStatements.D03_ifElseIfStatements;

import java.util.Scanner;

public class C01_SayiAnalizi {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        
        if (girilenSayi < 0) System.out.println("Pozitif sayi girmelisiniz...");
        else if (girilenSayi<=9) {
            System.out.println("girdiginiz sayi rakam");
        } else if (girilenSayi<=99) {
            System.out.println("iki basamakli sayi");
        } else if (girilenSayi<=999) {
            System.out.println("uc basamakli sayi");
        } else System.out.println("cok buyuk sayi");

    }
}
