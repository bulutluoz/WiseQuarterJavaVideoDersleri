package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C10_MethodlariKullanma {

    public static void main(String[] args) {


        int[] arr = {3,6,7,3,5,1};

        arr = C05_TumElementleriArtirma.arrayinElemanlariniArtir(arr,4);

        System.out.println(Arrays.toString(arr)); // [7, 10, 11, 7, 9, 5]

        arr = C05_TumElementleriArtirma.arrayinElemanlariniArtir(arr,1);

        System.out.println(Arrays.toString(arr)); // [8, 11, 12, 8, 10, 6]


        System.out.println(C06_PozitifElementlerinToplami.pozitifElementlerinToplami(arr)); // 55


        int[] kullaniciArr = C08_KullaniciyaArrayOlusturtma.integerArrayOlustur();
        System.out.println(Arrays.toString(kullaniciArr)); // [1, 2, 3, 4, 5, 6]

    }
}
