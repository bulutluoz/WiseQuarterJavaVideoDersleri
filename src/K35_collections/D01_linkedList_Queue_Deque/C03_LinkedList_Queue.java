package K35_collections.D01_linkedList_Queue_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList_Queue {

    public static void main(String[] args) {

        Queue<Integer> sayilar1 = new LinkedList<>();
        Queue<Integer> sayilar2 = new LinkedList<>();

        /*
         inheritance hatirlanacagi uzere
         sayilar2 objesi LinkedList objesidir
         ANCAK data turu Queue secildiginden
         TUM QUEUE'lar ile ortak ozelliklerini gorebiliriz

         Queue ==> kuyruk
         eklenenler sona eklenir
         silinenler bastan silinir
         */

        // sayilar1 listesine eleman ekleyelim

        sayilar1.add(10);
        sayilar1.add(15);
        sayilar1.add(12);
        sayilar1.add(24);
        sayilar1.add(45);
        sayilar1.add(34);
        sayilar1.add(46);
        sayilar1.add(56);

        System.out.println(sayilar1); // [10, 15, 12, 24, 45, 34, 46, 56]


        // sayilar1 listesinden eleman silelim

        sayilar1.remove();
        sayilar1.remove();

        System.out.println(sayilar1); // [12, 24, 45, 34, 46, 56]


        // peek()
        System.out.println(sayilar1.peek()); // 12
        System.out.println(sayilar1); // [12, 24, 45, 34, 46, 56]
        System.out.println(sayilar2.peek()); // null

        /*
         Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
         queue'nun basindaki elementi silmeden bize getirir, liste bos ise null dondurur
         */



        // element()
        System.out.println(sayilar1.element()); // 12
        System.out.println(sayilar1); // [12, 24, 45, 34, 46, 56]
        // System.out.println(sayilar2.element()); // NoSuchElementException

        /*
         Retrieves, but does not remove, the head of this queue.
         queue'nun basindaki elementi silmeden bize getirir
         This method differs from peek only in that it throws an exception if this queue is empty.
         peek'den farki, bos queue'da kullanilirsa exception firlatmasidir
         */




        // poll()
        System.out.println(sayilar1.poll()); // 12
        System.out.println(sayilar1); // [24, 45, 34, 46, 56]
        System.out.println(sayilar2.poll()); // null

        /*
         Retrieves and removes the head of this queue, or returns null if this queue is empty
         ilk elementi siler ve bize getirir, queue bos ise null getirir
         */




        // offer()

        System.out.println(sayilar1.offer(25)); // true
        System.out.println(sayilar1); // [24, 45, 34, 46, 56, 25]


        /*
         Inserts the specified element into this queue
         if it is possible to do so immediately without violating capacity restrictions.
         When using a capacity-restricted queue,
         this method is generally preferable to add,
         which can fail to insert an element only by throwing an exception.

         add() ile ayni islemi yapar
         aralarindaki fark
         add() mutlaka ekler,
         offer() ise eklemeyi teklif eder
         Eger bir kapasite sinirlamasi yoksa EKLENIR
         kapasite sinirlamasi varsa exception firlatir
         */



    }
}
