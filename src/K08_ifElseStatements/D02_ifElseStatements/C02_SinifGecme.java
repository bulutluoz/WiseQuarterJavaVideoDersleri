package K08_ifElseStatements.D02_ifElseStatements;

import java.util.Scanner;

public class C02_SinifGecme {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not=scanner.nextDouble();

        if (not >= 50){
            System.out.println("Sinifi gectin...");
        }else {
            System.out.println("maalesef kaldin...");
        }


    }
}
