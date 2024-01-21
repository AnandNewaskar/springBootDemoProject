import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.stream.Nodes.collect;

public class PractiseClass {

    public static void main(String[] args)
    {
        Integer max = Stream.of(1, 2, 3, 4, 5, 6,7)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The Maximum number is: " + max);

        //Q6) Java 8 program to Count Strings whose length is greater than 3 in List?

        List<String> li = new ArrayList<>();
        li.add("afaf");
        li.add("gre00");
        li.add("tyrh");
        li.add("fg");
        li.add("f");

        long count =  li.stream().filter(str->str.length()>3).count();

        System.out.println("length of string is " + count);

        String s = li.stream().filter(str->str.length()>3).collect(Collectors.joining());

        li.stream().filter(i->i.length()>3).forEach(System.out::println);

 //    List<String> ok =   li.stream().map(i->i.toUpperCase()).collect(Collectors.toList());

    //    System.out.println(" string is " + ok);

        System.out.println(" string is " + s);

        //Java 8 program to multiply 3 to all elements in the list and print the list?

        List<Integer> l = Arrays.asList(1,4,24,14,1,4,2);
        List<Integer> l2 = l.stream().map(i->i*3).toList();
        System.out.println(" Integer is " + l2);

        List<Integer> in = Arrays.asList(5,4,4,6,1,2,9);

        Stream<Integer> st = in.stream().min(Comparator.comparing(Integer::valueOf)).stream();

        st.forEach(System.out::println);


       // Q10. Java 8 program to remove the duplicate elements from the list?

        List<Integer> i = Arrays.asList(4,4,4,3,5,1,2,5,1,8,7,7,6,5);

        List<Integer> dup = i.stream().distinct().collect(Collectors.toList());
        System.out.println( "duplicate element "+ dup);

  //      List<Integer> io = i.stream().collect(Collectors.toSet()).stream().toList();


   //     List<Integer> k = i.stream().map(j->j+j).collect(Collectors.toList());

//        for(int d:k)
//        {
//            System.out.println(d);
//        }

     //   System.out.println(" the duplicate elements are  " + io);


        // create a function with argument as string and int and return type is string
        // example ("abcdef", 2); output = "ab", "cd", "ef"


        //4) How do you find frequency of each element in an array or a list?
        // Output :{Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}

        List<String> sList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Penci");

        Map<String, Long> frequencyMap = sList.stream()
                .collect(Collectors.groupingBy(
                        // Key extractor (element itself)
                        element -> element,
                        // Downstream collector (count occurrences)
                        Collectors.counting()
                ));
        System.out.println("the map is " + frequencyMap);


        List<Integer> lt = Arrays.asList(10,15,8,100,49,25,98,32,15,8);

        List<Integer> even = lt.stream().filter(n->n%2==0).collect(Collectors.toList());

        List<Integer> startWith = lt.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());

        Set<Integer> duplicate = lt.stream().collect(Collectors.toSet());
        // this is useful when wants to remove duplicate element

        List<Integer> findFirst = lt.stream().findFirst().stream().toList();

        long total = lt.stream().count();

        long maxi = lt.stream().max(Integer::compareTo).get();


        //Given a String, find the first repeated character in it using Stream functions?


        String str = "loginl is fun in java";
        char first = '\0';

        char repeated ;
        for(int j =0 ;j<str.length();j++)
        {
            repeated = str.charAt(j);
            for(int k = j+1;k<str.length();k++)
            {
                if(repeated == str.charAt(k))
                {
                    first = repeated;
                    break;
                }
            }
        }System.out.println("the first number is " + first);

        System.out.println("the  number starting with 1  is " + startWith);

        System.out.println("the even number is " + even);

        System.out.println("the first number is " + findFirst);

        System.out.println("the duplicate number is " + duplicate);

        System.out.println("the total is " + total);

                String leet = "hello leetcode tr";

        String[] split = leet.split(" ");

        for(String ch: split)
        {System.out.println("the leetcode  is " + ch);}

        int  n = split.length;

        System.out.println("the length is " + n);

        String lm = split[n-1];

        System.out.println("the substring is " + lm);


        String non = "abcdfsagssbgr";
        // double each element from list of integer

        List<Integer> k = Arrays.asList(1,4,2,5,1);

        List<Integer> dou = k.stream().map(nk->nk*2).collect(Collectors.toList());

        System.out.println("the double list  is " + dou);

        //array = {0,0,0,0,1,1,1,1} count the numbers of 1s

        int arr[] =  {0,0,0,0,1,1,1,1};
        int countt =0;

        for(int a =0;a<arr.length;a++)
        {
            if(arr[a]==1)
            {
                countt++;
            }
        }
        System.out.println("the count is " + countt);
        // find some of all even number and sum of odd number from list of integer

        List<Integer> evenlist = Arrays.asList(1,3,3,2,5,2,6,5);

        int evenSum = evenlist.stream().filter(ev->ev%2==0).mapToInt(Integer::intValue).sum();

        List<Integer> du = Arrays.asList(1,3,3,2,5,2,6,5);

       long resl  =  du.stream().mapToInt(Integer::intValue).count();

        System.out.println("the total is " + resl);


        System.out.println("the even number is " + evenSum);

        int odd = evenlist.stream().filter(od->od%2!=0).mapToInt(Integer::intValue).sum();

        System.out.println("the odd number is " + odd);

        String re = "javaokjajaaaa";

        // replace j from string to a

        char[] c = re.toCharArray();

        for(int a =0;a<c.length;a++)
        {
            if(c[a]=='j')
            {
                c[a]='g';
            }
        }

String res = new String(c);
        System.out.println("the string is " + res);

        String h = "hello world";
        List<String> word = Arrays.asList(h.split("\\s"));
        String tr = h.replaceAll("\\s","");

//        Map<String, Long> fre = word.stream().collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
//
//        List<String> rep = fre.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

     //   System.out.println("repeating interview words" + rep);



//        Map<String, Long> fre= word.stream().collect(Collectors.groupingBy(e->e, Collectors.counting())).entrySet().stream()
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));


        Map<Character ,Integer> occur = new HashMap<>();

        char[] charr = tr.toCharArray();

        for(char c1 : charr)
        {
            if(occur.containsKey(c1))
            {
                occur.put((c1), occur.get(c1)+1);
            }
            else {
                occur.put(c1,1);
            }
        }


        System.out.println("repeating interview words" + occur);



        List<Integer> kl = Arrays.asList(14,20,30,50,60);

        Integer second = kl.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println("second highest" + second);


        //4) How do you duplicate element  in an array or a list?
        // Output :{Pen, Stapler,Pencil, NoteBook, Eraser, Pen, Eraser}

        List<String> mon = Arrays.asList("Pen", "Eraser", "pen" ,"Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String,Long> op = mon.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));


        System.out.println("the duplicate element are " + op);

    }
}
