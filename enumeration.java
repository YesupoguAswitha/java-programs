
//import java.util.Enumeration;
import java.util.Enumeration;
import java.util.Properties;
//import java.util.Hashtable;





public class enumeration{
    public static void main(String[] args) {
        //enumeration-interface
        //Introduced for iterating the legancy collection objects
        //legacy classes-v1.0
        //new classes -v1.2
         
        /* Vector<String> v = new Vector<>();
         v.add("banana");
         v.add("apple");
         v.add("mango");
         v.add("grapes");
         Enumeration<String> e = v.elements(); 
         // e.hasMoreElements()//boolean 
         // e.nextElement()
         while(e.hasMoreElements()){
            System.out.println(e.nextElement());
         }       */
         /*Hashtable <String,Integer> ages = new Hashtable<>();
         ages.put("India",500);
         ages.put("sri lanka",600);
         ages.put("london",800);
             //System.out.println(ages);
        Enumeration<Integer> e =ages.elements();
         while(e.hasMoreElements()){
            System.out.println(e.nextElement());
            } */
        
       Properties prop = new Properties();
       prop.setProperty("url", "localhost");
       prop.setProperty("username", "Aswitha");
       prop.setProperty("password", "Aswi@5");

       Enumeration<Object> e = prop.elements();
       while(e.hasMoreElements()){
            System.out.println(e.nextElement());
            }

    }
    
}