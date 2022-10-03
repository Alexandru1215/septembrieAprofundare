package data_structure;

import javax.swing.text.StyledEditorKit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*


      //  List<Integer> someNewNumbers = new ArrayList<>();

      //  System.out.println("Acestea sunt numerele din lista " + someNumbers);
      //  System.out.println("Marimmea listei - " + someNumbers.size() + " elemente");
      //  System.out.println("Parcurgere cu for-loop");
        //  for (Integer numbers : someNumbers) {
        //    System.out.print(numbers + " ");
        //  }
      //  for (Integer numbers : someNumbers) {
     //       if (numbers % 2 != 1) {
     //           someNewNumbers.add(numbers * 2);
    //            //  System.out.println(someNewNumbers);
       //     }
       // }
      //  for (Integer numbers : someNewNumbers) {
       //     if (numbers > 10) {
        //        System.out.println(numbers);
         //   }
       // }
                List<Integer> someNumbers = List.of(2, 4, 5, 6, 8, 10);

        Integer numberFound = someNumbers.stream()   // intram in lista
                .filter(numbers -> numbers % 2 != 1)  // aici  ne intereseaza numerele pare ( conditie)
                .map(numbers -> numbers * 2)              // numerele din lista le inmultim cu 2 ( trec peste si transform)
                .filter(numbers -> numbers > 10)       //conditia sa fie numarul inmultit cu 2 mai mare decat 10
                .findFirst().get();        // sa gasim primul numar din lista care fiind par si *2 e mai > ca 10
        System.out.println(numberFound);         //  sa il afisam :) (un for)

        //System.out::println
    */

         /*

        LinkedList<String> ll = new LinkedList<String>();
        ll.push("Alex");
        ll.add("Rox");
        ll.addFirst("Alexandru");
        ll.offer("Vali");
        ll.addLast("Cristina");
        ll.add(1,"Roxana");
        System.out.println("cate elemente sunt in lista - "+ll.size());
        for (String nume : ll) {
            System.out.println(" * "+nume);
        }

        System.out.println(" am scos elementul first - "+ll.pollFirst());

        System.out.println("lista contine elementul ? "+ll.contains("Alex"));
        System.out.println(" cate elemente mai sunt in lista ? "+ll.size());
        System.out.println(ll.indexOf("Roxana"));
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        ll.addLast("MArio");
        System.out.println(ll);



        HashMap<Integer, String> fruits = new HashMap<Integer, String>();
        fruits.put(1, "apple");
        fruits.put(2, "banana");
        fruits.put(3, "mango");
        fruits.put(4, "cherry");

                //to acces  getK() and getV() we need
        // Map.Entry interface and we call all  entrySet().


        for (Map.Entry me : fruits.entrySet()) {
            System.out.println("Key is " + me.getKey() + " "
                    + "Value is " + me.getValue());
        }

        fruits.putIfAbsent(6, "Kiwi");

        System.out.println("After I used the method - putIfAbsent() " + '\n' + fruits);

        System.out.println("After I invoke putAll() method - " + '\n' + fruits);
    */


        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Rox");
        names.add(0,"Noe");
        names.add(1,"SanJack");


       for(String n : names ){
           System.out.println(n);
       }
        System.out.println('\n');
       HashSet<String> namesHs = new HashSet<>();

        namesHs.add("Alex");
        namesHs.add("Rox");
        namesHs.add("Stro");

        namesHs.remove("Stro");
        Iterator <String> it  = namesHs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println('\n');

        LinkedHashSet<String> namesLhS = new LinkedHashSet<>();
        namesLhS.add("Alex");
        namesLhS.add("Roxana");
        namesLhS.add("Cristina");
        namesLhS.add("Valentin");

        for(String str : namesLhS){
            System.out.println(str);
        }






    }
}

