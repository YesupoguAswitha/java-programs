
import java.util.*;


public class vector{
    public static void main(String[] args) {
        //size-no of elements presents in list
        //capity-array capacity
        Vector <String> v1 = new Vector<>();
        v1.add("Aswitha");
        v1.add("Switha");
        v1.add(0,"Raj");
       

        Vector <String> v2 = new Vector<>();
        v2.add("seetha");
        v2.add("geetha");

        //System.out.println(v1);
        
        //for(int i=0; i<v2.size(); i++) {
           //  v1.add(v2.get(i));
         
        //}

        //v1.addAll(v2); // i want add in front then v1.addAll(0,v2);

        //System.out.println(v1);

        //System.out.println(v1);
        //System.out.println("Size:"+v1.size());
        //System.out.println("capacity:"+v1.capacity());
        
     //System.out.println(v1.get(0));//this code used for specific name

        //v1.remove(3); 
        //System.out.println(v1);//this code used for remove element to  specific name 
          
          //System.out.println(v1.contains("Raj"));
          //System.out.println(v1);
         // v1.set(2, "saahus");
          // System.out.println(v1);//this code used for updation
          //System.out.println(v1.get(2));
          System.out.println(v1.indexOf("Raj"));//this code is used for getout  indext. 




        }


}