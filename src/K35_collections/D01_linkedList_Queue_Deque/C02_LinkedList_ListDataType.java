package K35_collections.D01_linkedList_Queue_Deque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList_ListDataType {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        List<Integer> sayilar1 = new LinkedList<>();



        /*
            data turu List secildigi icin
            bugune kadar kullandigimiz arrayList ile ortak ozelliklere sahiptir

            daha dogrusu hem sayilar hem de sayilar1
            data turu secilen List Interface'indeki method'lara sahip olurlar
         */

        sayilar1.add(10);
        sayilar1.add(20);

        System.out.println(sayilar1); // [10, 20]

        sayilar1.add(1,15);

        System.out.println(sayilar1); // [10, 15, 20]


    }
}
