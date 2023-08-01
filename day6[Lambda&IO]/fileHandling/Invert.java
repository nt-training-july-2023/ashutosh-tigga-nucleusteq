import java.io.*;
import java.util.*;

class Invert {
    static File file = null;

    static boolean createOrExists(String fileName) {
        file = new File(fileName);
        if (file.exists()) {
            System.out.println(file.getName());
            System.out.println("file already exists");
            return true;
        } else {
            try {
                file.createNewFile();
                System.out.println("file created");
                return true;
            } catch (Exception e) {
                System.out.println("not able to create new file");
            }
        } // end of if else
        return false;
    }

    static void writeData(String writeContent) {
        try(FileOutputStream fos=new FileOutputStream(file,true)) {
                byte b[]=writeContent.getBytes();
                fos.write(b);
        } catch (Exception e) {
            System.out.println("error aa gaya");
        }
        
    }

    static void readData() {
        StringBuilder sb=new StringBuilder();
        try(FileInputStream fis =new FileInputStream(file)) {
            int data=0;
            String str=null;
            while ((data =fis.read())!=-1) {
                sb.append(""+(char)data);
                str=sb.toString();
            }
            String []arrOfString=str.split("\\n");
                ArrayList<String> listofContent=new ArrayList<>(Arrays.asList(arrOfString));
                Collections.reverse(listofContent);
                for (String content : listofContent) {
                    System.out.println(content);
                }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of the File :");
        String fileName = sc.nextLine();

        if (createOrExists(fileName)) {
           // System.out.println("content you want to write");
           // String content = sc.nextLine();
           // writeData(content+"\n");
            readData();
        } else {
            System.out.println("not able to proceed with this file");
        }
        
    }
}