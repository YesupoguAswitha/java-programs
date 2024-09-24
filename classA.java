public class classA{
    public static void main(String[] args) {

         Audi a = new Audi();
         a.drive(50,"audi");
        
        car c1 = new car()
        {
           public void drive (int speed,String model){
            System.out.println("driving "+model);
           }
        };
         c1.drive(70,"bmw");
    // lambda exxpression with anonymus function
    // 3 components :-(arguments list) ,"->" arrow token,{function body}
         car c2 =( speed,model)-> {
        System.out.println("driving tata");
        System.out.println("car is driving very smoothly at speed " +speed);
         if (speed>100)
         System.out.println("speed driving");
         else 
          System.out.println("slow driving");
          
         };
        c2.drive(60, "tata");

       
    }
}

class Audi implements car {

    @Override
    public void drive(int speed,String m) {
        System.out.println("Driving "+m);
    }

}

@FunctionalInterface
interface car {
    public void drive(int speed,String model);

}