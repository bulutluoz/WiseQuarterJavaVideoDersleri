package K14_whileLoop;

import java.util.Scanner;

public class C03_EnUzunKelime {

    public static void main(String[] args) {
        // asagidaki gorevi yapan bir method olusturun

        // kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
        // esit sayida harfe sahip isimlerden herhangi biri olabilir


            enUzunIsmiYazdir();



    }

    public static void enUzunIsmiYazdir(){

        Scanner scanner = new Scanner(System.in);

        String girilenIsim = "";
        String enUzunIsim = "";

        while ( ! (girilenIsim.equals("q") || girilenIsim.equals("Q"))   ){

            System.out.println("Lutfen en uzun ismi bulmak icin, bir isim giriniz," +
                                "\nBitirmek icin Q'ya basiniz");

            girilenIsim = scanner.nextLine();

            if ( girilenIsim.length() > enUzunIsim.length()){

                enUzunIsim = girilenIsim;
            }

        }

        System.out.println("Girilen isimlerden en uzun olani : " + enUzunIsim);

    }



}
