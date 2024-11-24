package K35_collections.D02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C04_BelirliElementleriSilme {

    public static void main(String[] args) {

        // Verilen String bir Set'deki
        // istenmeyen harf iceren elementleri silin

        Set<String> isimler = new HashSet<>();
        isimler.add("Cem");
        isimler.add("Murat");
        isimler.add("Furkan");
        isimler.add("Cem");
        isimler.add("Cem");
        isimler.add("Sabri");
        isimler.add("Ridvan");

        System.out.println(isimler); // [Cem, Furkan, Murat, Ridvan, Sabri]

        String istenmeyenHarf = "a";


        Iterator itr = isimler.iterator();

        while (itr.hasNext()){

            if (   ((String)itr.next()).contains(istenmeyenHarf) ){
                itr.remove();
            }
        }

        System.out.println("isimler listesinin son hali : " + isimler);


    }
}
