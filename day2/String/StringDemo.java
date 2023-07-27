public class StringDemo{
    public static void main(String[] args) {
        String str=new String("  Ashutosh ");
        int sizeOfString=str.length();
        String str2=str.concat("Tigga");
        char ch=str.charAt(0);
        int index=str.indexOf("As");
        StringBuilder sb=new StringBuilder(str2);
        sb.replace(0, 8, "Shiva");
        System.out.println("size :"+sizeOfString+" \nbefore concating "+str+"after concating "+str2);
        System.out.println(" replaced "+sb);
        System.out.println(" substring of "+str +":"+str.substring(0, 8));
        System.out.println("After Trim :"+str+" :"+str.trim());
        System.out.println(str+" Compare to "+" Ashutosh :"+str.compareTo("Ashutosh"));
         System.out.println(str+" Compare to "+" Ashutosh :"+str.compareToIgnoreCase("Ashutosh"));
         System.out.println(str+" Compare to AFTER TRIM "+" Ashutosh :"+str.trim().compareTo("Ashutosh"));

    }
}