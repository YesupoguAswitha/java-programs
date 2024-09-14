
import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("s1");
        al.add("s2");

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Y1");
        ll.add("Y2");
        ll.add("Y3");
        ll.add(1,"YY");
        ll.addAll(al);
        System.out.println(ll);
        
    }
}