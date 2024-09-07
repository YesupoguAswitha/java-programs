
import java.util.Random;

public class nonstatic{  
      static int number;//int number ---//this one is different random number number but infront of int number we put the static then same number will print.
      public static void main(String[] args) {

        nonstatic ns = new nonstatic();
        ns.number = new Random().nextInt();

        nonstatic ns2 = new nonstatic();
        ns2.number = new Random().nextInt();

        nonstatic ns3 = new nonstatic();
        ns3.number = new Random().nextInt();

        System.out.println(ns.number);//this one used for non-static method 
        System.out.println(ns2.number);
        System.out.println(ns3.number);  

        System.out.println(nonstatic.number);//this one used for static method   


        
    }


    public static void print(){
            System.out.println("static method");
        }  

    public  void print2(){
            System.out.println("non-static method");
        }  
   
}