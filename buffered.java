import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffered {
    public static void main(String[] args) throws IOException  {
        File file = new File("./sample.txt");
        if(!file.exists())
        file.createNewFile();

        FileReader fr = new FileReader(file);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr =new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        int asciiCode;  
        while((asciiCode = br.read()) != -1){
        System.out.print((char)asciiCode);
        }
        fis.close();
        isr.close();
        fr.close();
        br.close();
    }
}