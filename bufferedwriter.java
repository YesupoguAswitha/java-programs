import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriter {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample2.txt");
        if(!file.exists())
        file.createNewFile();

        String s = "hello connectek" ;

        BufferedWriter bw = new BufferedWriter( new FileWriter(file));
        bw.write(s);
        bw.close();


       
  
             


    }
}