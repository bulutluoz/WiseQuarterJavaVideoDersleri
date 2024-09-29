package RecoverDersleri.Ders02;

public class C03_OrOperatoru {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;


        boolean sonuc = (sayi1+=3) >10  || (sayi2-=5)<40 || (sayi3/=3)>10 ;


        System.out.println("sayi1 : " + sayi1);
        System.out.println("sayi2 : " + sayi2);
        System.out.println("sayi3 : " + sayi3);
    }
}
