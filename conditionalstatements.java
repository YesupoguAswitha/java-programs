
import java.util.Scanner;



public class conditionalstatements{
    public static void main(String[] args) {
        int i = -10;
        if(i<0){
            System.out.println("the given is a negative number ");

        }
        else{
            System.out.println("the given is a poistive number ");

        }

        //nested if

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your online assessment status?");
        String eaxmStatus = scanner.nextLine();
        String examStatus ="Pass";
        if("Pass".equals(examStatus)){
            System.out.println("please wait for further rounds");
            String round1Status = "Pass";
            if("Pass".equals(round1Status)){
                System.out.println("you have cleared round 1 interview,please wait for round 2");
                String round2Status = "fail";
            if( "Pass".equals(round2Status)){
                System.out.println("you have cleared round 2 interview,please wait for HR round ");
            }
            else{
              System.out.println("you can go to home");  
            }
            }
            else{
              System.out.println("you can go to home");  
            }
        }
        else{
            System.out.println("you can go to home");
        }

        
    }

}

    