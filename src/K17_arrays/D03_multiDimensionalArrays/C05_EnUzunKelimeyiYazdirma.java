package K17_arrays.D03_multiDimensionalArrays;

public class C05_EnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        String[][] arr = { {"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};


        // iki katli array'deki en uzun kelimeyi yazdirin


        // Tum elementleri gozden gecirecek miyiz ? EVET

        String enuzunKelime = "";

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if ( arr[i][j].length() > enuzunKelime.length()){

                    enuzunKelime = arr[i][j];
                }

            }

        }

        System.out.println("Array'deki en uzun kelime : " + enuzunKelime); // Merhabalar

    }
}
