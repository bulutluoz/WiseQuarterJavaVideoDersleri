package K10_switchStatements;

import java.util.Scanner;

public class C03_IkiBasamakliSayiyiYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 100'den kucuk pozitif bir tamsayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        // 29 ==> yirmi dokuz
        // 87 ==> seksen yedi

        if (sayi>0 && sayi<100) {

            int birlerBasamagi = sayi % 10;
            int onlarBasamagi = sayi / 10;

            System.out.print("Girdiginiz sayi :  ");

            switch (onlarBasamagi) {

                case 0:
                    break;
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }

            System.out.print(" ");

            switch (birlerBasamagi) {

                case 0:

                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }

        } else{
            System.out.println("Girilen sayi istenen aralikta olmali");
        }


    }
}
