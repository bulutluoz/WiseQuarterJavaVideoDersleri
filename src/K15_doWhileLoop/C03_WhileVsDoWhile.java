package K15_doWhileLoop;

public class C03_WhileVsDoWhile {

    public static void main(String[] args) {

        /*
            Uygun deger girilmediginde;

            While loop'da atanan ilk deger icin while kontrolu false oldugundan
            loop body'si hic calismadan loop biter

            Do while loop'da ise ilk deger kontol edilmeden once
            loop body'si bir kere calisir
            ve ilk deger uygun olmasa bile ilk degeri yazdirir

            Ozetle :

            Do-While loop'un en buyuk artisi ve eksisi aynidir

            Kontrol yapilmadan once body bir kere calisir

            bu ozellik bazen avantaj, bazen de dezavantaj olabilir
         */

        // Verilen sayidan baslayip, 1'er artirarak,
        // 10'a kadar (10 haric) olan sayilari yazdirin

        int sayi = 15;

        // while loop

        while (sayi<10){
            System.out.print(sayi + " ");
            sayi++;
        }

        System.out.println("");


        sayi = 15 ;

        // do while loop

        do {

            System.out.print(sayi + " ");
            sayi++;

        }while (sayi<10);









    }
}
