import java.util.*;
import java.io.*;

public class ReadData {

   
    Scanner reader = null;

    public void readInFile(String fileName) {
        try {
             File file = new File(fileName+".txt");
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found of that name "+e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch(Exception e){
                 System.out.println("File not closed "+e.getMessage());
            }
        }

    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
         ReadData read = new ReadData();
        System.out.println(" Enter File name that you want to read ");
        read.readInFile(sc.nextLine());
    }
}
