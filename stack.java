
import java.util.Stack;




public class stack {
    public static void main(String[] args) {
    /*LIFO-last in first out -stack
     FIFO-first in first out-queue

     stack is a class in java which implements the last interface and extends the vector class and also represents the LIFO princple.
    */
    /*Stack<String> books =new Stack<>();
    books.add("Red");
    books.add("Black");
    books.add(0,"White");

    //books.remove("Red"); //this one used for removal
    books.set(0,"yellow");//this code used for replace
    
    //System.out.println(books);
    System.out.println(books.get(2));//this one used for the get it specfic data 
     
     this type of code is avaliable in satck but we does't use this type of code.statck has special methods are available.
     */
    
    Stack<String> books =new Stack<>();
    books.push("Red");//push and add exctly equal
    books.add("Black");
    books.add("White");

    System.out.println(books.search("Red"));    




    }
}