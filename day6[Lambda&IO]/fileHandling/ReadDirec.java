import java.io.File;

public class ReadDirec {
    public static void main(String[] args) {
        System.out.println("Enter name of file");
        String fileName=new String("ashu.txt");
        try{
            File file=new File(fileName);
            System.out.println(file.getAbsolutePath());
            System.out.println(file.toPath());
            System.out.println(file.listRoots());
            System.out.println(file.listFiles());
        } catch (Exception e) {
            // TODO: handle exception
        }finally{

        }
    }
}
