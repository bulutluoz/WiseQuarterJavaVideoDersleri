package K35_collections.D01_linkedList_Queue_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class C04_LinkedList_Deque {

    public static void main(String[] args) {

        // Deque double ended queue demektir
        // method'lar basa ve sona uygulanacak sekilde 2'ye ayrilir

        Deque<Integer> sayilar = new LinkedList<>();

        // sayilar'a eleman ekleyin

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(23);
        System.out.println(sayilar); // [10, 20, 23]

        sayilar.addFirst(12);
        sayilar.addLast(45);

        System.out.println(sayilar); // [12, 10, 20, 23, 45]
        sayilar.add(20);
        sayilar.add(20);


        // sayilar'dan eleman silin
        System.out.println(sayilar); // [12, 10, 20, 23, 45, 20, 20]

        System.out.println(sayilar.remove()); // 12 Retrieves and removes the head of the queue represented
        System.out.println(sayilar); // [10, 20, 23, 45, 20, 20]

        System.out.println(sayilar.removeFirstOccurrence(20)); // true Removes the first occurrence of the specified element from this deque
        System.out.println(sayilar); // [10, 23, 45, 20, 20]

        System.out.println(sayilar.removeFirstOccurrence(40)); // false Removes the first occurrence of the specified element from this deque
        System.out.println(sayilar); // [10, 23, 45, 20, 20]

        System.out.println(sayilar.removeFirst()); // 10 Retrieves and removes the first element of this deque.
        System.out.println(sayilar); // [23, 45, 20, 20]



        // push

        sayilar.push(44);
        System.out.println(sayilar); // [44, 23, 45, 20, 20]

        /*
         Pushes an element onto the stack represented by this deque
         (in other words, at the head of this deque)
         if it is possible to do so immediately without violating capacity restrictions,
         throwing an IllegalStateException if no space is currently available.
         This method is equivalent to addFirst.

         addFirst() ile ayni islevi yapar
         aralarindaki fark push() kapasite sinirlamasi yoksa ekler
         kapasite sinirlamasi varsa IllegalStateException firlatir
         */




























    }
}
