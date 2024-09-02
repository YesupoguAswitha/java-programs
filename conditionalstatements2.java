public class conditionalstatements2{
    public static void main(String[]args){
        int i = 5;
        switch(i){
        case 1:
         System.out.println("this is a first statement");
            break;
        case 2:
           System.out.println("this is second statement");
            break;
        case 3:
            System.out.println("this is a third statement");
            break;
        default:
            System.err.println("this is a default statement");
            break;   
        }
    }
}