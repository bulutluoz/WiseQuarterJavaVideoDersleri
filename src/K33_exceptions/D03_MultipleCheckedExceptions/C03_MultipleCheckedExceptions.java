package K33_exceptions.D03_MultipleCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultipleCheckedExceptions {

    public static void main(String[] args) {

        /*
            FileInputStream fileInputStream olusturdugumuzda
            Java Ya dosyayi bulamazsam dedi,
            biz de try catch ile sarmalayip
            FileNotFoundException'i kontrol altina aldik

            Ancak fileInputStream.read() yazdigimizda
            bu defa da IOException riski barindirdigi icin altini kirmizi cizdi

            IOException, FileNotFoundException'in parent'i oldugundan
            islem yaparken bu iliskiyi dikkate almaliyiz
            1- eger ikisini de ayri catch cumleleri ile yazacaksak
               uste child exception yazilmalidir

            2- eger ikisini ayri ayri yazmak istemezsek
               sadece parent olan IO exception'i yazmamiz yeterli olacaktir
               cunku IOException ikisini de kapsar.

         */

        // notlar dosyasindaki yazilari konsolda yazdirin

        try {
            FileInputStream fileInputStream =
                    new FileInputStream("src/K33_exceptions/D03_MultipleCheckedExceptions/DersNotlari.txt");

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }


        }catch (FileNotFoundException e ){

            System.out.println("Dosya bulunamadi");
            e.printStackTrace();

        } catch (IOException e){

            System.out.println("Dosyadaki bilgiler okunamadi");
            e.printStackTrace();

        }











    }
}
