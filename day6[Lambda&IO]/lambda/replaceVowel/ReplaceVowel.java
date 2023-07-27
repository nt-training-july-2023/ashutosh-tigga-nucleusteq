interface ReplaceVowelInterface{
    public String replace(String str);
}
// a i o u e
public class ReplaceVowel {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String s=new String("ASHUTOSH TIGGA");
        System.out.println("Before Replaced Vowel "+s);
        ReplaceVowelInterface obj = (String str)->{
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if( (ch=='a') || (ch=='A') || (ch=='e') || (ch=='E') || (ch=='i') || (ch=='I') || (ch=='o') || (ch=='O') || (ch=='u') || (ch=='U')){
                    sb.append("#");
                }else{
                    sb.append(""+ch);
                }
            }
            return new String(sb);
        };
        String res=obj.replace("ASHUTOSH TIGGA");
        System.out.println("After Replaced Vowel "+res);

    }
}
