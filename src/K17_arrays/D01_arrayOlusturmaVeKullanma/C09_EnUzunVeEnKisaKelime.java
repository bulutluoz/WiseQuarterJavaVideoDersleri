package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class C09_EnUzunVeEnKisaKelime {

    public static void main(String[] args) {

        // Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdirin

        String[] isimler = {"hamza", "esra", "serat", "ali", "cansu","ibrahim","can","yasemin"};

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length ; i++) {

            if ( isimler[i].length() < enKisaKelime.length()){
                enKisaKelime = isimler[i];
            }


            if (isimler[i].length() > enUzunKelime.length()){
                enUzunKelime = isimler[i];
            }

        }

        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En kisa kelime : " + enKisaKelime);






    }


    // Verilen String bir array’deki
    // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.



}
