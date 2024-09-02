public class constuctors{
     public int i;
    public static void main(String[] args) {
        constuctors constuctors = new constuctors(85);
        System.out.println(constuctors.i);
    }
public  constuctors(){
    i=20;
    System.out.println("constuctor is called");
}

public constuctors(int a){
    i=a;
    System.out.println("constructor is called");
}
}