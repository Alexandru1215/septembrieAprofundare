import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //TreeSet<Integer> treeSet = new TreeSet<Integer>();

        long startTime;
        long endTime;
        long elapseTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
            //treeSet.add(i);
        }

        startTime = System.nanoTime();

        //linkedList.get(0);  // primul index
        //linkedList.get(500000);// in mijloc
        //linkedList.get(999999); // ultimul element
        //linkedList.remove(0);// sterge utimul
        linkedList.remove(500000); // stergem la mijloc
        //linkedList.remove(999999);


        endTime = System.nanoTime();

        elapseTime = endTime - startTime;
        System.out.println("LinkedList : \t " + elapseTime);


        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);    // aici a fost mai lenes array ul
        arrayList.remove(500000);
        //arrayList.remove(999999);

        endTime = System.nanoTime();

        elapseTime = endTime - startTime;

        System.out.println("ArrayList : \t " + elapseTime);


        startTime = System.nanoTime();

        //treeSet.remove(0);
        //treeSet.remove(500000);
        //treeSet.remove(999999);

        endTime = System.nanoTime();

        elapseTime = endTime - startTime;

       // System.out.println("TreeSet :\t " + elapseTime);

        //ArrayList a fost mai lenes doar la stergere al primului element .
        // cand a fost sters primul element , a trebuit sa mute toate elementele o casuta inapoi .

        //Ca si concluzie ArrayListul este mult mai rapid decat LinkedList!

      //  System.out.println(arrayList.get(500));

    }
}
