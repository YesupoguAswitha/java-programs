
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set{
   public static void main(String[] args) {
       //hashset-->hashmap-->array of node(key,value)
       /*HashSet<Integer> hs =new HashSet<>();
       System.out.println(hs);
       hs.add(10);
       hs.add(2);
       hs.add(85);
       hs.add(65);
       hs.add(5);
       hs.add(75);
       System.out.println(hs);

       System.out.println(hs.remove(85));//removal
       System.out.println(hs.contains(850));//verifying
       for(Integer element:hs){
       System.out.println(element);*/

       /*LinkedHashSet<Integer> lhs = new LinkedHashSet<>(); 
       lhs.add(10);
       lhs.add(90);
       lhs.add(30);
       lhs.add(60);
       lhs.add(40);
       lhs.add(80);

       for (Integer element:lhs){
        System.out.println(element);
    
       }

       System.out.println(lhs);
       System.out.println(lhs.size());
       System.out.println(lhs.isEmpty());*/

       TreeSet<Integer> ts =new TreeSet<>();
       ts.add(10);
       ts.add(90);
       ts.add(30);
       ts.add(60);
       ts.add(40);
       ts.add(80);

       System.out.println(ts);
       System.out.println(ts.first());
       System.out.println(ts.last());
       System.out.println(ts.pollFirst());//remove element
       System.out.println(ts.subSet(5,65));
       System.out.println(ts);
       System.out.println(ts.descendingSet());

       }

       
   }