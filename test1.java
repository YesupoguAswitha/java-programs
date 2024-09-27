public class test1{
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Thread t1 = new Thread(e1);
        //e1.start();
        t1.start();

        manager m1 = new manager();
        Thread t2 =new Thread(m1);
          t2.start();      
                //m1.start();

        System.out.println(Thread.activeCount());
    
    /*Thread t1 = new Thread();
    Thread t2 = new Thread();  
    Thread t3 = new Thread();   
    Thread t4= new Thread();

    t1.start();
    t2.start();
    t3.start();
    t4.start();  //multi thraeding
    
    System.out.println(Thread.activeCount());*/


        /*System.out.println("hello guys, welcome to java programs");
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());*/
    }

    }

class Employee extends Thread {

    /*public Employee (String tName){
        super(tName);
    }*/ //giving name 

    @Override
    public void run(){
        System.out.println("hello " + Thread.currentThread().getName() + " >>> " + getId());
    }

   
    
}


class manager extends Thread {
     /*public manager (String tName){
        super(tName);
    }
*/

    @Override
    public void run(){
        System.out.println("hii " + Thread.currentThread().getName() + " >>> " + getId());
    }

    
}

