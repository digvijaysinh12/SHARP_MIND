
public class ReverseString {
    static String reverse(String str,int i,int j){
        if (i>j) {
            return str;
        }
        char c= str.charAt(i);
        str.charAt(i) = str.charAt(j);
        str.charAt(j) = c;
        return reverse(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverse(input,0,input.length());
        System.out.println("Reversed String: " + reversed);
    }    
}