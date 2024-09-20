
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class hpf{
    public static void main(String[] args) throws IOException {
        File file =new File("dbconfig.properties");
        if(!file.exists())
          file.createNewFile();//file creation code
        // System.out.println(file.exists());// file is there or not .its a verification code.
        //file.delete(); //file delete
        //System.out.println(file.exists());
        Properties prop = new Properties();
       // prop.setProperty("url", "localhost");
        //prop.setProperty("username", "Aswitha");
        //prop.setProperty("password", "Aswi@05");

        //FileOutputStream fos = new FileOutputStream(file);
        //prop.store(fos, "new prop file created");
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        //Set<String>keys = prop.stringPropertyNames();
        //Set<Object> keys =  prop.keySet();//only keys
        //Collection<Object> c = prop.Values();//this one used for only values
        //System.out.println(keys);

        //System.out.println(prop.getProperty( "url"));//giving specific one 
         //System.out.println(prop.getProperty("machineName","lenovo"));//ianother method of creating value 


    }

}