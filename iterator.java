
import java.util.ArrayList;
import java.util.Iterator;

public class iterator{
    public static void main(String[] args) {
         //iterator-interface
        //Introduced for iterating the legancy collection objects
        //legacy classes-v1.0 + new classes -v1.2
        //one direction,read only with special permission for removing the elements

        ArrayList<Integer>al = new ArrayList<>();
        al.add(5);
        al.add(85);
        al.add(78);

        Iterator<Integer> i = al.iterator();
        //i hasnext()
        //i next()

       // while(i.hasNext()){
        //{
        //    System.out.println(i.next());
        //}
        //i.next();
        //i.remove(); 
        //}
        i.next();
        i.remove();//special permission remove single element
        System.out.println(al);
    }
}