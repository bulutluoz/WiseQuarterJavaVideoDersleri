package K35_collections.D01_linkedList_Queue_Deque;

import java.util.*;

public class C01_LinkedListOlusturma {

    public static void main(String[] args) {

        // List<>() kullanarak bir isimler listesi olusturun

        // List<String> isimler = new List<>();

        /*
         List, Queue ve Deque Interface olduklarindan OBJE olusturulamaz
         AMMA child class'lari olan LinkedList constructor'ini kullanabilirler
         */

        List<String> isimler1 = new ArrayList<>();

        List<String> isimler2 = new LinkedList<>();
        Queue<String> isimler3 = new LinkedList<>();
        Deque<String> isimler4 = new LinkedList<>();
        LinkedList<String> isimler5 = new LinkedList<>();

        /*
         isimler2, isimler3 ve isimler4 objelerinin HEPSI
         LinkedList class'inin objeleridir
         Hepsi ayni class'in objesi olduklari halde
         Data turleri farkli interface'ler secildigi icin
         bu 3 obje cok farkli ozellikler gosterir
         */

    }
}
