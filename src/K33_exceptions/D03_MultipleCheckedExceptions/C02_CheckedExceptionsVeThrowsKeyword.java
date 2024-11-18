package K33_exceptions.D03_MultipleCheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_CheckedExceptionsVeThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {

        /*

            Compile time(Checked) exception'larda Java bize 2 alternatif sunar
            1- Java ile try-catch yapabiliriz
               exception kontrol altina alinip e objesine kaydedilir
               ve kod normal calismaya devam eder
            2- Eger exception'i kontrol altina almak istemiyorsaniz
               (ornegin, dosyaya ulasamiyorsak kodun calismaya devam etmesinin bir anlami kalmiyorsa)
               Amacimiz sadece kirmizi cizgiyi kaldirip
               Class'i Run edilebilir hale getirmek ise
               sorumlulugu aldigimizi Java'ya soylemeli
               ve bu Class'i sonradan kullanacak insanlari uyarmaliyiz

                Bunun icin method signature'ina "throws FileNotFoundException " ekleyebiliriz
         */


        FileInputStream fileInputStream =
                new FileInputStream("src/K33_exceptions/D03_MultipleCheckedExceptions/DersNotlari.txt");


        System.out.println("Hello world");

    }
}
