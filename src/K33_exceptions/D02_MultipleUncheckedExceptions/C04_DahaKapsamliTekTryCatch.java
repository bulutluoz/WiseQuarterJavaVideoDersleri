package K33_exceptions.D02_MultipleUncheckedExceptions;

public class C04_DahaKapsamliTekTryCatch {

    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // verilen negatif olmayan bir sayiyi index olarak kabul edip
        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayiyi yazdirin
        // eger kullanici index'den buyuk sayi girerse
        // hata mesaji ve son index'i yazdirin

        int index = 16;

        if (index < 0 ){
            System.out.println("Index negatif olmamalidir");
        } else {
             // 3.yontem : daha kapsamli tek try catch
            /*
                Bu yontem digerlerine gore daha kisa
                Exception tum hatalari kapsadigi icin
                bizim ongoremedigimiz exception'lar da olussa yakalar
                Hata ayiklama acisindan yine 1.yontem tercih edilebilir

                4.yontem nested try catch
                kod acisindan anlasilmasi daha zor olacagi icin tercih edilmez
                kod okuma sorularinda ornek cozecegiz

             */


            try {

                System.out.println(arr[index]);
                System.out.println(str.charAt(index));

            }catch (Exception e){
                System.out.println("Index sinirlarin disinda. String icin son index : " + (str.length()-1)
                        + ", array icin son index : " + (arr.length-1));
            }





        }// else sonu









    }
}
