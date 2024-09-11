import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample2.txt");
        if(!file.exists())
        file.createNewFile();
        String s = "hello friends" ;
        FileWriter fw = new FileWriter(file);
        fw.write(s);

        fw.close();


    }
}