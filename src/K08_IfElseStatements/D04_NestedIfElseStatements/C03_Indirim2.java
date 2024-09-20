package K08_IfElseStatements.D04_NestedIfElseStatements;

import java.util.Scanner;

public class C03_Indirim2 {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedi giriniz...");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urunun indirimsiz fiyatini girin...");
        double urunFiyati = scanner.nextDouble();

        double indirimsizToplamFiyat = urunFiyati*urunAdedi;

        System.out.println("Musteri kartiniz var mi ? E: Evet H: Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        // ana degisken urun sayisi olsun

        if (urunAdedi<0){
            System.out.println("Urun adedi sifirdan kucuk olamaz");

        } else if (urunAdedi>=10) { // urun adedi 10'dan fazla olanlar

            if (kartVarMi == 'E'){
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat*80/100);
            } else if (kartVarMi == 'H') {
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }else{
                System.out.println("kart var mi icin E veya H girmelisiniz");
            }


        } else { // urun adedi 0-9 arasi olanlar

            if (kartVarMi == 'E'){
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            } else if (kartVarMi == 'H') {
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat*90/100);
            }else{
                System.out.println("kart var mi icin E veya H girmelisiniz");
            }

        }

    }
}
