
import java.util.ArrayList;




public class wrapper{
    public static void main(String[] args) {
        int i = 20;
        wrapper wc = new wrapper();
        //Integer i2 = new Integer(55);// boxing
       // Integer i2 = i;//unboxing 

        Integer i3 = Integer.valueOf(55);
        //int ii =i3.intValue(); //unboxing
        //int ii = i3; //auto-unboxing

        ArrayList<Integer> al = new ArrayList<>();
        al.add(25);//auto - boxing
        al.add(55);
        al.add(Integer.valueOf(65));//boxing

        int age = al.get(0); //auto-unboxing

         byte b = 55;
         double d= b; //type conversion 
        //System.out.println(i2);

    }
  
}
