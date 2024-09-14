
import java.util.*;


public class maps{
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        //creation of a map
        Map<Integer,String> ms = new Hashtable<>();

        //Addition of elements into the map
        ms.put(500050,"Hyderbad");
        ms.put(603103,"chennai");
        ms.put(516503,"badvel");
        //System.out.println(ms);

        //retrival of keys from the map
        /*Set<Integer> Keys =ms.keySet();
        for(Integer key : Keys) {
            System.out.println(key);
        }
        System.out.println();

        //Retrival of values from the map 
        Collection<String> values = ms.values();
        for (String  value : values) {
            System.out.println(value);
        }

        //retrieval of value from the map based on a key
        //System.out.println(ms.get(516503));

         for(Integer key : Keys) {
            System.out.println(key + ">>>>" +ms.get(key));
    }*/
    //deleteion of element from the map
     //ms.remove(516503);   

     //System.out.println(ms.containsKey(516503));//verification 
     
      /*System.out.println(ms);
      ms.put(123456,"banglore");
      System.out.println(ms);//added 

      System.out.println(ms);
      ms.put(603103,"banglore");//ms.repalce(123456,"mumbai")replace code
      System.out.println(ms);//value updated*/

      //m.putIfAbsent(123456,"banglore");here, value is there value then updation not done. 
       


        

  }


}