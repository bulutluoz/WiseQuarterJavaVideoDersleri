package K22_passByValue;

public class C01_PassByValue {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.toUpperCase());  // JAVA CANDIR
        System.out.println(str); // Java candir
        /*
            bir variable'i argument olarak kullanip
            baska bir method'a gonderdigimizde
            Java variable'in kendisini degil VALUE(deger)'sunu gonderir
         */

        String isim = "ali mert yilmaz can";

        // verilen isim kac kelimeli olursa olsun
        // tum isimleri ilk harfleri buyuk, sonraki harfleri kucuk olarak
        // duzenleyip yazdiran bir method olusturun
        ismiDuzenleYazdir(isim);
        ismiDuzenleYazdir("pelin su yilmaz demir");


        // verilen cumleyi buyuk harfe cevirip yazdiran bir methos olusturun

        String cumle = "Ali okula git";
        buyukHarfeCevir(cumle);
        System.out.println("main method'da cumle : " + cumle);
    }

    public static void buyukHarfeCevir(String cumle){

        cumle = cumle.toUpperCase();

        System.out.println("Method'da cumle  : " + cumle); // ALI OKULA GIT
    }

    public static void ismiDuzenleYazdir(String str){
        // System.out.println(isim);
        System.out.println("method basinda str : "+ str); // ali mert yilmaz can

        /*
            isim variable'i main method icerisinde olusturuldugu icin
            local bir variable'dir
            scope'u main method'dur
            ve main method disindan KULLANILAMAZ

            Eger isim variable'inin degerini
            ismiDuzenleYazdir()'unda kullanmak istersek
            parametre olarak yollayabiliriz
         */
            String[] isimlerArr = str.split(" ");
            String yeniIsim = "";

            for (int i = 0; i < isimlerArr.length ; i++) {
                yeniIsim += (isimlerArr[i].substring(0,1).toUpperCase()+
                             isimlerArr[i].substring(1).toLowerCase() );
                if (i< isimlerArr.length-1){
                    yeniIsim += " ";
                }
            }
        System.out.println("Ismin duzenlenmis hali : "+yeniIsim); // Ali Mert Yilmaz Can


    }



}

