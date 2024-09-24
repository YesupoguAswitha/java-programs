
// non static inner classes---nested 
    // static inner classes--- nested
    //local classes
    //anonymuos inner classes
    
    public class TestClass1 {
        private int id = 101;
    public static void main(String[] args) {
        System.out.println("in main method:testclass1");
        //testclass1 tc1 = new testclass1();
       // testclass5 tc5 = new testclass1(). new testclass5();
        //tc5.sub();
       // testclass4 tc4 =new testclass1().new testclass4();
       // System.out.println(tc4.getEmployeeID());
       // tc4.calculateSalary();
        

        TestClass5 tc5 = new TestClass1.TestClass5();
         tc5.abc();
    }

    public static class TestClass5{
    public void abc() {
          System.out.println("abc");
    } 
   }
   
    

    /*public class testclass4 extends student {
        private int id =102;
        public void show() {
            int id= 103;
            System.out.println(id);//local variable 
            System.out.println(this.id);//inner clas
            System.out.println(testclass1.this.id);//outer class 
            System.out.println(getMarks());
            giveExam();
        }

        public void add() {
            testClass4 tc4 = new testClass4();
            tc4.show();
        }

       @Override
        public void giveExam() {
           System.out.println("exam given");
        }

    }

    public class testclass5{
        public void sub(){
              testClass4 tc4 = new testclass1().new testClass4();
              tc4.show();
        }
    }*/

    

   /*public class testclass4 implements employee{
    
    public void show(){

    }

        @Override
        public int getEmployeeID() {
           return id;
        }

        @Override
        public void calculateSalary() {
            System.out.println("salary is 1lakh");
        }
   }

   public class testclass5 extends testclass4 {
    public void abc() {
          show();
    } 
   }*/

   /* private class testclass5 {

    }
    protected class testclass6 {

    }

    public static class testclass7 {

    }
    private abstract class testclass8 {

    }
    protected final class testclass9 {

    }
    
    
    
}
class testclass2 {
    public static void main(String[] args) {
        System.out.println("in main method: testclass2");
    }

}
class testclass3 {
    public static void main(String[] args) {
        System.out.println("in main method: testclass3");
    }
}
class testclass4 {
    public static void  main(String[] args) {
        System.out.println("in main method: testclass4");
    }*/


    }
 
    