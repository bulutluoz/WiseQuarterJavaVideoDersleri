package K16_scope;

public class C01_LocalVariables {
    /*
        Local varible'larin scope'u
        icinde olusturulduklari kod blogudur.

        Kendi kod bloklarinin disindan KULLANILAMAZLAR
     */

    public static void main(String[] args) {

        String str = "Hava guzel";
        // sayi = 20;
        // System.out.println(chr);

        for (int i = 0; i <10 ; i++) {
            System.out.print(i);
            String str1 = "Ali";
            System.out.println(str1);
            System.out.println(str);
        }
        // System.out.println(i);
        // str1 = "Veli";
    }

    public static  void method1(){
        int sayi = 10;
        //str = "Java guzel";
    }

    public void method2(){
        char chr = '@';
        //System.out.println(str);
    }
}
