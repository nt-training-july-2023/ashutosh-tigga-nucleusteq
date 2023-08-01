import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class CopyFile {
    static void copyData(File actualFile,File copyFile) {
        StringBuilder sb=new StringBuilder();
        try(FileInputStream fis =new FileInputStream(actualFile)) {
            int data=0;
            while ((data =fis.read())!=-1) {
                sb.append(""+(char)data);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        String s=sb.toString();
        byte []b=s.getBytes();
        try (FileOutputStream fos=new FileOutputStream(copyFile, true)){
            fos.write(b);
            System.out.println("File copied");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which file to copy ");
        String fileName = sc.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("In which file you want to copy "+file.getName()+" content ");
            String copyFileName = sc.nextLine();
            File file2 = new File(copyFileName);
            if(file2.exists()){
                copyData(file,file2);
            }else{
                try {
                    file2.createNewFile();
                    copyData(file, file2);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        } else {
            System.out.println("File doesn't exists ");
        } // end of if else
    }
}
