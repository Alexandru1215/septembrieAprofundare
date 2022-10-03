package algorithm;

import javax.sound.sampled.EnumControl;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class DataStructureAndAlgorithm {
    public static void main(String[] args) {
/*

        // Stack = First In - Last out - store obj like  a "vertical tower"
        //                    push()  -  to add
        //                    pop()   -  to remove
        //                    empty() -  boolean - simply true if is empty list or false

        Stack<String> stack = new Stack<String>();
        stack.push("Pipet de pui");
        stack.push("Ciorbita de pui");
        stack.push("Ceafa de porc la gratar");
        //stack.empty();
        //System.out.println(stack.empty());
        //  System.out.println(stack.get(0));
        //  System.out.println(stack.get(1));
        //   System.out.println(stack.get(2));
        String e = "";
        for (String menu : stack) {
            System.out.println(menu);
        }
        for(int i=0 ;i <100; i++){
            stack.push("MineCraft");   // am adaugat obiecutl MineCraft de 100  de ori :))
        }
        System.out.println("*********!!!!!!!!!!*********** "+stack);
        System.out.print("************ "+stack.size());

        String menuRestaurant = stack.stream()
                .filter(menu -> menu.contains("Ciorbica de pui"))
                .map(menu -> menu.toUpperCase())
                .findAny().orElse("Ciorbita de vacuta");

        System.out.println(stack.peek());
        System.out.println("Elementul cautat  in meniu se afla la index ul " + stack.search("Ciorbita de pui"));

        System.out.println("In the restaurant menu we have " + menuRestaurant);

       System.out.println(stack);
        System.out.println(stack.size());

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.empty());

        Stack<Integer> stackInt = new Stack<>();   //declar un Stack nou in care adauagam Integer
        System.out.println(stackInt.empty());      // verificam daca are sau nu elemente in el .

        // adaugare se face in "turn vertical"   merge pe principiul Fst In - Lst Out

        for (int i=0 ; i <5 ; i++){   // adaugam 5 elemente in el.
            stackInt.push(i);
            System.out.println(i);
        }
        System.out.println(stackInt.capacity());
        System.out.println(stackInt.empty());  // verific daca am adaugat elementele

        for(int i=0;i<5; i++){        // stergem cele 5 elemente din Stack
            Integer y = (Integer)stackInt.pop();
            System.out.println(y);
        }

        System.out.println(stackInt.empty()); // verificam daca mai sunt elemente ramase
                stackInt.search(1);

        System.out.println(stackInt.capacity());

        while(stackInt.empty()){
            Integer y = (Integer)stackInt.push(100000000);
            System.out.println(y);
            System.out.println(stackInt.size());
            System.out.println(stackInt.capacity());
        }
        System.out.println(stackInt.size());
       for(int i=0; i<stackInt.size();i++){
           System.out.println(stackInt);


                    // Vrem sa aflam numar maxim si numar minim intr un Array -
                    // Metoda 1 cu parcurgere for si If

        int[] numbers = new int[]{3, 4, 6, 12, 9};
        int min = numbers[0];
        int max = numbers[0];          //declaram un int max, pentru operatie in for
           for (int number : numbers) {        // facem for clasic pentru parcurgere Array
               if (number > max) {                        // conditia sa fie adevarata
                   max = number;
                   if (number < max) {
                       min = number;
                   }
               }
           }
        System.out.println("max number -" + max);                    // afisam valoarea maxima obtinuta
        System.out.println("min number - " + min);                     //afisam valoare minima ----


            // Metoda 2

        List<Integer> numberFound = Arrays.stream(numbers)      //dupa declarare intram in elementele Array ului
                .boxed()                                      // creaza o punte cu numere lipsa intre elemente pana ajunge la ultimul elemnent din Array
                .collect(Collectors.toList());                // colecteaza intr o lista (agregare intr o primitiva),
        //face operatia de reducere , avem max, min , count, averge

        System.out.println("Min element " + Collections.min(numberFound));
        System.out.println("Max element " + Collections.max(numberFound));

        Queue<String> queue = new LinkedList<>();
        queue.offer("ceapa");
        queue.offer("apa");
        queue.offer("cafea");
        queue.offer("scoici");
        queue.offer("Pepsi");

        System.out.println("This is the list : " + queue + '\n' + " I have " + queue.size() + " item in list now ");
        if (queue.contains("cafea")) {
            queue.remove("cafea");
        } else if (!queue.contains("cafea")) {
            System.out.println("Is not there !");
        }
        System.out.println("This is the list now : " + queue + '\n' + " I have " + queue.size() + " item in list now ");

        Stack<String> nume = new Stack<>();
        nume.push("Alex");
        nume.push("Alexa");
        nume.push("Rox");
        nume.push("Roxana");

        Queue<String> nicks = new LinkedList<String>(nume);

        String num = nume.stream()
                .filter(numele -> numele.contains("Alexa"))
                .map(numele -> numele.toUpperCase())
                .findFirst().get();
        System.out.println(num);
        System.out.println(nicks);
        System.out.println(nume);
        System.out.println("este egal stack si queue ?"+ nicks.equals(nume));
        System.out.println(nume);
        if (nume.contains("Alexa")) {
            System.out.println("is true");
        } else if (!nume.contains("Alexa")) {
            System.out.println("is not there !");
        }
        String foundNume = nicks.stream()
                .filter(numeX -> numeX.contains("Alexa"))
                .findFirst().get();
        System.out.println("is there - "+foundNume);
        System.out.println("nick name list  - "+nicks);
        if (nicks.contains("Alexa")) {
            System.out.println("Name is here! "+nicks.contains("Alexa"));
            nicks.remove("Alexa");
            System.out.println("Will not be anymore here !");
        }
        System.out.println("new nick-name list - "+nicks);

        System.out.println(nicks.element());
        System.out.println(nicks);
        System.out.println(nicks.size());
        nicks.offer("Aurel");
        System.out.println(nicks.element());
        System.out.println(nicks);
        System.out.println(nicks.size());
        System.out.println("*******");
        System.out.println(nicks.peek().toLowerCase());
        System.out.println(nicks.peek().contains("Alex"));
        System.out.println(nicks);
        System.out.println("*******");
        System.out.println(nicks.equals(nume));
        nicks.remove("Aurel");
        System.out.println(nicks.equals(nume));
        System.out.println(nicks);
        System.out.println(nume);
        System.out.println("------------------");
        System.out.println(nicks.isEmpty());
*/
/*
         Queue<Double> medie =  new PriorityQueue<>(Collections.reverseOrder());
         medie.offer(2.0);
         medie.offer(1.5);
         medie.offer(4.0);
         medie.offer(6.0);
         for(Double medii:medie){
             System.out.println("* "+medii);
         }

        System.out.println(medie);
        while (!medie.isEmpty()){
            System.out.println(medie.poll());
        }
            Queue<String> contest = new PriorityQueue<>(Collections.reverseOrder());
        contest.offer("Brian");
        contest.offer("Alex");
        contest.offer("Rox");
        contest.offer("Manuel");
        contest.offer("Sorin");
        contest.offer("Naruto");
        contest.offer("Alexa");
        System.out.println(contest);
        System.out.println(medie);
            for(String nume :contest){
                System.out.println(nume);
            }
           String nickname = contest.stream()
                   .filter(nume -> nume.contains("Alex"))
                   .findAny().get();
        System.out.println(nickname+ " is there!");
        while (!contest.isEmpty()){
           System.out.println(contest.poll());
        }
       // System.out.println(contest);

        for(String nicks : contest){
            //System.out.println(nicks);
        }*/
/*
        int[] arrDeInt = new int[11];  //declarat un  Array de int cu nr fix de elemente
        System.out.println(arrDeInt.length);//marime Array ului
        arrDeInt[0] = 1;   // elemente adaugate pentru fiecare index in parte
        arrDeInt[1] = 2;
        arrDeInt[2] = 3;
        arrDeInt[3] = 4;
        arrDeInt[4] = 5;
        arrDeInt[5] = 7;
        arrDeInt[6] = 6;
        arrDeInt[7] = 9;
        arrDeInt[8] = 7;
        arrDeInt[9] = 11;
        arrDeInt[10] = 10;*/
/*
        int count = 0; // initializare unu contuar - care sa mi adauge cate 1 la index precedat, astfel face numaratoarea

        for (int i = 0; i < arrDeInt.length; i++) { //acest for imi va afisa elementul si indexul fiecare contorizat
            count++;
            System.out.println("index " + i + " element " + arrDeInt[i]);
        }
        System.out.println(count++);
        int sum = 0; //am initializat 'sum'  pentru a ne afisa dupa parcurgerea elementelor cu un for a sumei tuturor elementelor din Array

        System.out.println(arrDeInt.length);
        for (int i = 0; i < arrDeInt.length; i++) {
            //   System.out.println("index - " + arrDeInt[i]);
            sum += arrDeInt[i];

        }
        System.out.println("The sum of all elements is : " + sum);  // am afisat suma
        for (int i = 0; i < arrDeInt.length; i++) {  // aici vom parcurge Array ul cu for pentru  a scoate numerele pare si cele impare in output
            if (arrDeInt[i] % 2 != 1) {
                // System.out.println("Even numbers are  : " + arrDeInt[i]);
            }
            if (arrDeInt[i] % 2 == 1) {
                //System.out.println("Odd numbers are :  " + arrDeInt[i]);
            }
            if (arrDeInt[i] == 4) {  // aici am pus o conditie , daca gasim elementul cu numar 4 sa il anumultim cu 2, sa i schimbam astfel identitatea din 4 in 8 .
                arrDeInt[i] = arrDeInt[i] * 2;
                // System.out.println("After we found the number we multiple the number by 2 - and now is  = " + arrDeInt[i]);
            }
            if (arrDeInt[i] == 11) {// la fel si aici, am pus conditia si in cazul in care gasim elementul aplicam operatiile asupra lui .
                arrDeInt[i] = arrDeInt[i] * 4 + 2;
                System.out.println("founded number is now " + arrDeInt[i]); //se va afisa noul numar dupa ce s a actionat asupra sa .
            }
            {
            }
        }




        // Integer arr = Arrays.stream(arrDeInt).sum(); // suma elementelor din Array

        // Integer arr1 = Arrays.stream(arrDeInt) // initilizam si  am intrat in Array
        //  .filter(arry ->arry %2 !=1)// gasesc numerele pare
        //  .map(arry->arry *2)   // numerele pare le inmultesc cu 2
        //  .sum();        // rezultat
        // System.out.println();
         */

      /*  ArrayList<Integer> sortArr = new ArrayList<>();
        sortArr.add(1);
        sortArr.add(3);
        sortArr.add(2);
        sortArr.add(5);
        sortArr.add(4);
        sortArr.add(6);
        sortArr.add(7);
        sortArr.add(9);
        sortArr.add(10);
        sortArr.add(8);

        Collections.sort(sortArr); // s au asezat in oridtine

        for (Integer listX : sortArr) {
            System.out.println("New sortet list -  " + listX);
        }

        ArrayList<String> nume = new ArrayList<>();
        nume.add("Roxana");
        nume.add("Grigore");
        nume.add("Alexandru");
        nume.add("Alex");
        nume.add("Alexa");
        nume.add("Rox");
        nume.add("Roks");
        nume.add("Roxana");
        nume.add("AlexAndru");
        //int c = 0;
        System.out.println("new list ** (" + nume + ")");

        for (int i = 0; i < nume.size(); i++) {
            if (nume.contains("Alex")) {
                nume.remove("Alex");
                if(nume.remove("Alexa")){
                    System.out.println("the best is less");
                }
            }

        }
        Collections.sort(nume);
        System.out.println("new list ** (" + nume + ")");

        // System.out.println("lista de nume");
        //   System.out.print(nume);
        // System.out.println("numar de elemente in lista "+nume.size());
        //  Collections.sort(nume);
        //for(String nickName : nume){
        //    System.out.println("lista sortata - "+ nickName);
        //    }

        //int count = 0; // pot afisa si cu iterator  plus count , - numarul in dreptul numelui
        //  Iterator<String> num = nume.iterator();
        //  System.out.println(num.next()+" "+count++);
        //   System.out.println(num.next()+" "+count++);
        //    System.out.println(num.next()+" "+count++);
        //    System.out.println(num.next()+" "+count++);
        //    System.out.println(num.next()+" "+count++);
        //   System.out.println(num.next()+" "+count++);

        // System.out.println("********************"+'\n');
        //  int contuar = 0;    // un cod mult mai frumos decat cel de sus .
        //  for(String itNum : nume){
        //count++;
        // System.out.println(itNum+" "+contuar++);


        // vrem sa se afiseze din 3 in 3 incepand de la 0  pana 12
        //Wraper Class merge bine cu ArrayLists
        //ajuta sa modifice primite in obiecte.
        // mai ales cand lucram cu Collections .
        //asta facem azi , ArrayList, Collection , wrapperClass ...

        // Integer wrapperVariable;
        //System.out.println(wrapperVariable);

        //  int index = 0 ; // delcaram , initializam index .


        //  for(;index<12;){ //plecam de la 12 descrescator pana la 0 -  putem folosi  while loop
        //  wrapperVariable = Integer.parseInt(index+"");
        //       //System.out.println(wrapperVariable);
        //     index=index+3;

        //    }
        //     int i = 100;  // afisam de la 100 descrescator din  20 in 20
        //     while(i>=0){
        //        System.out.println(i);
        //       i=i-20;
        //  }

       */  //variable = (condition) ? expressionTrue :  expressionFalse;
/*

        ArrayList<Integer> findNumbers = new ArrayList<>();
        findNumbers.add(1);
        findNumbers.add(3);
        findNumbers.add(2);
        findNumbers.add(4);
        findNumbers.add(5);
        findNumbers.add(7);
        findNumbers.add(9);
        findNumbers.add(8);

        String res = (findNumbers.contains(10))?
                "is there " : " is not there ";

        String found = String.valueOf(findNumbers.contains(3));
        int numberFound  = 8;
        System.out.println((findNumbers.contains(2)));
        System.out.println(found);






        switch (numberFound) {
            case 1-> System.out.println("This is the number ");

            case 3 -> System.out.println("This is the number ");
            case 2 -> System.out.println("This is the number ");
            case 4 -> System.out.println("This is the number ");
            case 5 -> System.out.println("This is the number ");
            case 7 -> System.out.println("This is the number ");
            case 9 -> System.out.println("This is the number ");
            case 8 -> System.out.println("This is the number ");
            default -> System.out.println("Work no matter what ");
        }



        // este 10 in Array? metoda 1 pt output -
        if (findNumbers.contains(10)) {
            System.out.println("Numeber is there");
        } else {
            System.out.println("Number  is not there - Pam Pam");
        }

        //metoda 2 -  direct drin System.out.println, conditie apoi true or false;

        System.out.println(findNumbers.contains(10) ? "is there" : "Boom, Work it ");


        // metoda 3 - declaram un resultat pe care il vom printa apoi.
        // initializam String ul result -
        // variable = (condition) ? expressionTrue :  expressionFalse;

        String result = (findNumbers.contains(10)) ?
                "The numbers is there." :
                "The number is not there for moment!";
        System.out.println(result);


        System.out.println((findNumbers.contains(8)) ? "Is there!" : "Is not there!");
        System.out.println((findNumbers.contains(6)) ? true : false);
          //  Integer foundedN = 7;
 */


        System.out.println();

    }


}



