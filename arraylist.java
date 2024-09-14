
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist{

  
    public static void main(String[]args){
        Integer[] arr = new Integer[] {1,5,8,9,2};
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
        al1.add(5);       

        System.out.println(al1);
        System.out.println(al1.size());

        al1.set(0,25);
        System.out.println(al1);
        for(Integer integer : al1) {
           System.out.print(integer + " ");
        }
    }

}