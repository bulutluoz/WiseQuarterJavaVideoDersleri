package RecoverDersleri.Ders06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,4,5,6,7,8));

        System.out.println(sayilar); // [2, 4, 5, 6, 7, 8]

        sayilar.add(9);

        sayilar.remove(0);

        System.out.println(sayilar); // [4, 5, 6, 7, 8, 9]


        Integer[] arr = {2,3,4};

        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(sayilar2);

        sayilar2.add(5);

        System.out.println(sayilar2);  // [2, 3, 4, 5]

        System.out.println(Arrays.toString(arr)); // [2, 3, 4]


        List<Integer> sayilar3 = Arrays.asList(arr);

        // sayilar3.add(5); // UnsupportedOperationException




    }
}
