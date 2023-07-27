import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String args[]) throws FileNotFoundException,IOException{
        File file= new File("Text.txt");
        FileReader reader=new FileReader(file);
        Properties p=System.getProperties();  
        p.load(reader);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("address"));
        System.out.println(p.stringPropertyNames());
    }
}
