public class admin extends developer{
    
//adding or deleting the products or application
    public  void manage() {
        super.read();
        write();
        System.out.println("manage code");
        
    }

    public void read (){
        System.out.println("Admin read code");
    }
    
}