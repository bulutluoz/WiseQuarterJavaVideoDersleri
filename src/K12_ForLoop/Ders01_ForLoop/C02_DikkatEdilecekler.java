package K12_ForLoop.Ders01_ForLoop;

public class C02_DikkatEdilecekler {


    public static void main(String[] args) {

        /*
         Eger ilk deger icin condition true vermezse loop body'si HIC CALISMAZ
         For Loop calisti ama loop body devreye girmedi
         */

        for (int i = 10; i >100 ; i++) {

            System.out.println(i);
        }


        /*
         EGER artirma/azaltma yaptigimiz halde condition hep true oluyorsa
         Teknik olarak SONSUZ LOOP olusur
         */


        for (int i = 10; i >0 ; i++) {

            System.out.print(i + " ");

        }





    }

}