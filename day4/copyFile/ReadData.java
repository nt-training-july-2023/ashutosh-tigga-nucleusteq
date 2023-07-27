import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class ReadData {

    public void copyFileUsingFilestream(String fileName) {
    
        try {
            System.out.println(" copy file using FileStream ");
            File  file=new File(fileName+".txt");
           FileInputStream fis=new FileInputStream(file);
            FileOutputStream fos=new FileOutputStream(new File("D:\\nucleusteq\\training\\task\\day4\\copyFile\\copy\\new.txt"), true);
           int data;
            while ((data=fis.read())!=-1) {
                fos.write(data);
                System.out.println(data);
            }
            System.out.println("copied");
        } catch (FileNotFoundException e) {
            System.out.println("File not found of that name "+e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }//end of method

    public void copyFile() throws IOException{
        System.out.println("Copy File using File");
        File file1=new File("text.txt");
        File file2=new File("D:\\nucleusteq\\training\\task\\day4\\copyFile\\copy\\text1.txt");
        Files.copy(file1.toPath(), file2.toPath());
        System.out.println("copied");
      
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        ReadData read = new ReadData();
        System.out.println("Enter File name you want to copy ");
        read.copyFileUsingFilestream(sc.nextLine());
        read.copyFile();

    }
}
