//local classes

public class outerclass{
    private int id =100;
    public static void main(String[] args) {
    // int salary = 5000;


     /*abstractclass ac = new abstractclass(){
        public void print(){

        }
     };
     ac.show();*/

    student2 s1 = new student2 () {

        @Override
        public void attend() {
           
        }

        @Override
        public int getMarks() {

           return 0;
        }

    };
    s1.attend();
    s1.getMarks();
     
     
     }

}
       
       
       /*class1 c1 = new class1(){
        public void print() {
        System.out.println("upadated method");
    }

       };     //anonymous  class method 

       class1 c2 = new class1() {
        public void print() {
        System.out.println("upadated method");
    }
       };

       c1.show();
       c1.print();
  
       // class2 c2 = new class2();
         //c2.print();
         //c2.show();

        //final class A{
           // public void print(){
              //  System.out.println("salary is "+salary);
            }

       }
       //A a =new A();
      // a.print();
    //}*/



   /* class class1 {
    public void show() {
        System.out.println("show method is called");
    }

    public void print(){
        System.out.println("print method is called");
    }
 }

 class class2 extends class1{
    public void print() {
        System.out.println("upadated method");
    }
 }*/


   /* public outerclass(){
        class B {

        }
    }
    
    {
        class B {

        }
    }
    static{
        class B { 

        }
    }
        
}*/
   