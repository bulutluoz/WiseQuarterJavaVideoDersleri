package K05_WrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int sayi = scanner.nextInt();
        int rakamlarToplami = 0;


        int oAndakiSayininBirlerBasamagi = sayi % 10 ;
        rakamlarToplami = rakamlarToplami + oAndakiSayininBirlerBasamagi;


        sayi = sayi / 10;


        oAndakiSayininBirlerBasamagi = sayi % 10;

        rakamlarToplami = rakamlarToplami + oAndakiSayininBirlerBasamagi;

        sayi = sayi / 10;

        rakamlarToplami = rakamlarToplami + sayi;


        System.out.println("Verilen sayinin rakamlar toplami : " + rakamlarToplami);






    }
}
