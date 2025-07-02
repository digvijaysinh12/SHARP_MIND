import java.util.Arrays;

public class ManualStringMethod {
    public static void main(String[] args){
        String str = " Hello World  ";



        char[] chars = new char[str.length()];
        int j=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==' ' || c>=0&&c<=9){
                continue;
            }
            chars[j++] = c;
        }
        char ans[] = new char[j];
        for(int i=0;i<j;i++){
            ans[i] = chars[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}