
import java.util.Scanner;

public class userinput{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ?");
        String name = scanner.nextLine();
        System.out.printf("Hey %s,How are you? /n",name);
        String status = scanner.nextLine();
        System.out.println("What is your age?");
        String age = scanner.nextLine();
        System.out.println("Thank you for the information");

    }

}