package data_structure;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMain {
    public static void main(String[] args) {
/*
        HashMap<Integer, String> hashMap = new HashMap<>();   // initializare
        hashMap.put(3, "Alex");                                // declarare
        hashMap.put(1, "Rox");
        hashMap.put(2, "Vali");
        hashMap.put(4, "Cris");
        hashMap.put(0, "Aurel");
        System.out.println(hashMap);               // afisare K+V
        System.out.println('\n');
        //  Set set = hashMap.entrySet();
        Iterator iterator = hashMap.entrySet().iterator();              //  set.iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.print("Key is " + me.getKey() + " : ");
            System.out.println("Value is " + me.getValue());
        }
        System.out.println('\n');

        String[][] map2D = new String[2][2]; // declarare Array2d
        //  map2D[0][0]
        map2D[0][0] = "team1";   // initiliazare
        map2D[0][1] = "Alex";
        map2D[1][0] = "team2";
        map2D[1][1] = "Rox";
        System.out.println(map2D[0][0] + " " + map2D[0][1]);
        System.out.println(map2D[1][0] + " " + map2D[1][1]);
        System.out.println(Arrays.deepToString(map2D));
        System.out.println('\n');
        Map<String, String> map = Stream.of(new String[][]{ //Stream of a two-dimensional String array and collect them into a map
                {"team1", "Alex"},
                {"team2", "Rox"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));    // aici K  + V au fost la fel . aecelasi tip 'String'
        System.out.println(map);
        System.out.println('\n');

        Iterator iterator1 = map.entrySet().iterator();      // iterator
        while (iterator1.hasNext()) {                         // am folosit metoda din Iteraor
            Map.Entry me2 = (Map.Entry) iterator1.next();
            System.out.print(me2.getKey() + " ");
            System.out.println(me2.getValue());
        }

        System.out.println('\n');
        Map<Integer, String> map3 = Stream.of(new Object[][]{
                {1, "Alex"},
                {2, "Rox"},
                {3, "Mitici"}
        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));
        System.out.println(map3);
*///12,15,9,4,1990,1986  - numere pare  / numere mai mici de 22 /  numerele care inmultite cu 2 sunt mai mici de 20

        // List<Integer> numbers = List.of(1, 5, 9, 77, 1990, 1986,88,66,22,2);
        //List<String> myLetters = List.of("a", "l", "e", "x", "a", "n", "d", "r", "u");

//1 exercitiu Integer - numbers
        //   Integer numberFound = numbers.stream()
        //            .filter(num -> num % 2 != 1)
        //            .map(num -> num * 2)
        //              .filter(num -> num <100 )
        //              .map(num -> num /3)
        //              .findFirst().get();
        //     System.out.println(numberFound);

// 2 Exercitiu 2  Strings = myLetters.
/*
        String letterFound = myLetters.stream()
                .filter(letter -> myLetters.contains("a"))
                .findFirst().get();
        System.out.println(letterFound);
        System.out.println(myLetters);
        String letterX = myLetters.stream()
                .filter(leter -> leter.contains("x"))
                .map(leter -> leter.toUpperCase())
                .findFirst().get();
        System.out.println(letterX);
        System.out.println(myLetters);

        List<Integer> nummere = List.of(1, 5,4, 9, 77, 1990, 1986,88,66,22,11986);
        Integer chnageNumber =  nummere.stream()
                .filter(number -> number %2 !=1)
                //.map(number  -> number.intValue())
                .findFirst().get();
        System.out.println(chnageNumber);


        Stack<String> stack = new Stack<String>();
        stack.push("Audi");
        stack.push("BMW");
        stack.push("Mercedes");

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        */
/*
        data_structure.DynamicArray dynamicArray = new data_structure.DynamicArray(5);

        System.out.println(dynamicArray.capacity);
        System.out.println(dynamicArray.size);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        // dynamicArray.insert(0,"S");
        //dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));


        System.out.println(dynamicArray);
        System.out.println("size : " + dynamicArray.size);
        System.out.println("capacity : " + dynamicArray.capacity);
        System.out.println("empty : " + dynamicArray.isEmpty());

 */
/*
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(1215, "Alex123");
        m1.put(121590, "Alexandru125");
        m1.put(1986, "RoxFit");

         if(m1.containsKey(1215)){
             m1.remove(1215);
         }else {
             System.out.println("Work no matter what ! ");
         }

        // Iterator iterator = m1.entrySet().iterator();
        // while(iterator.hasNext()){
        //   System.out.println(iterator.next());
        // }
        for (Map.Entry me : m1.entrySet()) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println('\n');
        Map<Integer, String> m2 = new TreeMap<Integer, String>(m1);
        Set set = m2.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println('\n');
        System.out.println(m2+" ");



        //System.out.println(userAndPass);
        // System.out.println(userAndPass.size());
        //for(Map.Entry me : userAndPass.entrySet()){
        //  System.out.println(me.getKey()+" - " + me.getValue());
        // }
 */





    }
}
