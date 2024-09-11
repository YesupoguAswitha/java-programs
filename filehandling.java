
import java.io.File;
import java.io.IOException;

public class filehandling {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\txtfiles\\text.txt");
        /*if(f.exists());
        f.delete();
        System.out.println(f.createNewFile());*/

        //System.out.println(f.exists());
        //System.out.println(f.delete());
        // System.out.println(f.createNewFile()); 

        System.out.println(f.isHidden());

    }
    
}