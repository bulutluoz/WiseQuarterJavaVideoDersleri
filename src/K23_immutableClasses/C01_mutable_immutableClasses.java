package K23_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_mutable_immutableClasses {

    public static void main(String[] args) {


        String str = "Java candir";
        // immutable Class'larda method'larla yapılan değişiklikler KALICI OLMAZ

        str.toUpperCase();
        System.out.println(str.substring(2)); // va candir

        System.out.println(str); // Java candir


        List<String > isimler = new ArrayList<>(Arrays.asList("Cansu","Asuman","Hamza"));
        // mutable Class'larda method'larla yapılan değişiklikler KALICI OLUR

        System.out.println(isimler); // [Cansu, Asuman, Hamza]

        isimler.add("Ali");
        System.out.println(isimler.remove(0)); // Cansu

        System.out.println(isimler); // [Asuman, Hamza, Ali]







    }
}
