import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scanner{
    public static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");
        if(!file.exists())
        file.createNewFile();


        Scanner scanner = new Scanner(file);


        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());

        }

        scanner.close();


        
    }
}