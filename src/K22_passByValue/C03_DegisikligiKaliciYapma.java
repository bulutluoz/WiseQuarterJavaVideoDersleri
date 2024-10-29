package K22_passByValue;

import java.util.Scanner;

public class C03_DegisikligiKaliciYapma {


    public static void main(String[] args) {

        // verilen bir cumlede, sadece ilk harf buyuk geriye kalan tum harflrti kucuk yapip
        // sonunda . yoksa nokta koyup bize donduren bir method olusturun

        // kullanicidan bir cumle alip
        // method ile duzenleyin ve yeni halini kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        cumle = cumleyiduzenle(cumle);
        System.out.println("main method'da cumlenin son hali : " + cumle); // Ali gel.

    }


    public static String cumleyiduzenle(String cumle){

        cumle = (cumle.substring(0,1).toUpperCase()+
                 cumle.substring(1).toLowerCase() );

        if (cumle.charAt(cumle.length()-1) != '.'){
            cumle += ".";
        }

        return cumle;
    }



}
