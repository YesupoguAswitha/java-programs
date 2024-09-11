public class program1{
    public static void main(String[] args) {
        System.out.println("program excution start ");
        int fNumber = 9;
        int sNumber = 1;
        int result =0;
        try{ 
            result = fNumber/sNumber;

        }
        catch(ArithmeticException ae){
            System.out.println(ae.toString());//wite a logic to enter this message into log files
            throw ae;// this code is exception code so code will stop
        }
        finally{ //its optional code 
            System.out.println("finally block");
        }
        

        System.out.println("output is: "+result);

        System.out.println("proram execution end");

    }
}