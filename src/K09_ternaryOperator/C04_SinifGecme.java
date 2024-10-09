package K09_ternaryOperator;

import java.util.Scanner;

public class C04_SinifGecme {

    public static void main(String[] args) {

        // Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();


        System.out.println( not>=50 ?  "Sinifi gectin"  : "Maalesef kaldin"  );


    }
}
