package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class C01_SinifGecme {

    public static void main(String[] args) {

        // kullanicidan notunu alin
        // notu 50 veya daha buyukse "sinifi gectin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("Sinifi gectin");
        }


    }
}
