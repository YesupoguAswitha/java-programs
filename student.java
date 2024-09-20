public class student{
    String name = "Asiwtha";
    public void greet(){
        System.out.println("hi " + name);
    }
    public static void main(String[] args) {
        //student s1 =new student();
        //s1.greet();
        int i;
        i = 10;
        new student(). greet();//this is calles anonymous object
        student s1 = new student();
        s1.greet(); //referenced object
    }
}