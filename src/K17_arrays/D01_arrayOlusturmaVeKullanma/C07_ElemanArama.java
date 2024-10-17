package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class C07_ElemanArama {

    public static void main(String[] args) {

        // Verilen String bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        String arananHarf = "k";

        int sayac = 0;

        for (int i = 0; i < harfler.length ; i++) {

            if ( harfler[i].equals(arananHarf)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("istenen harf array'de yok");
        }else{
            System.out.println("Istenen harf array'de " + sayac + " defa kullanilmis");
        }


    }

    public static void elemanArama(String[] metinArr , String arananMetin ){

        int sayac = 0;

        for (int i = 0; i < metinArr.length ; i++) {

            if ( metinArr[i].equals(arananMetin)){
                sayac++;
            }

        }

        if (sayac == 0){
            System.out.println("istenen harf array'de yok");
        }else{
            System.out.println("Istenen harf array'de " + sayac + " defa kullanilmis");
        }

    }
}
