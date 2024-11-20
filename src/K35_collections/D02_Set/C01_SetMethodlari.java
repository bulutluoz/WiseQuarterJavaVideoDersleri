package K35_collections.D02_Set;

import java.util.*;

public class C01_SetMethodlari {

    public static void main(String[] args) {


        Set<Integer> sayilar = new HashSet<>();
        System.out.println(sayilar); // []
        System.out.println(sayilar.hashCode()); // 0

        sayilar.add(20);
        System.out.println(sayilar); // [20]
        System.out.println(sayilar.hashCode()); // 20

        sayilar.add(15);
        System.out.println(sayilar); // [20, 15]
        System.out.println(sayilar.hashCode()); // 35


        List<Integer> sayiList = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(sayiList.hashCode()); // 30817



        Set<String> harfler = new HashSet<>();
        harfler.add("a");
        harfler.add("p");
        harfler.add("l");
        harfler.add("a");
        harfler.add("f");
        harfler.add("a");

        System.out.println(harfler); // [p, a, f, l]





    }
}
