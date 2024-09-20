
import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator{
    public static void main(String[] args) {
         //list iterator-interface
        //Introduced for iterating the legancy collection objects
        //legacy classes-v1.0 + new classes -v1.2
        //bi direction,read write
    
    ArrayList<Integer> al = new ArrayList<>();
    al.add(5);
    al.add(85);
    al.add(78);

    ListIterator<Integer> li = al.listIterator();
    while(li.hasNext()) {
      System.out.println(li.next());
        }
     
    System.out.println();


    while(li.hasPrevious()) {
        System.out.println(li.previous());
        }
    
    
    }

}