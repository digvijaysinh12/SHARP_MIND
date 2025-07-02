public class Palindrome {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        String[] testCases = {
            "",                 // Edge case: empty string
            "a",               // Single character
            "aa",              // Two same characters
            "ab",              // Two different characters
            "aba",             // Palindrome
            "AbA",             // Case-sensitive
            "A man, a plan, a canal: Panama",  // With punctuation and spaces
            "No lemon, no melon",              // With spaces
            "12321",           // Numeric palindrome
            "123ab321",        // Not a palindrome
            "Was it a car or a cat I saw?",    // Punctuation
            " ",               // Space only
            "!!",              // Special characters
            "madamimadam",     // Long palindrome
            "Hello",           // Regular non-palindrome
        };

        for (String test : testCases) {
            boolean result = sol.isPalindrome(test);
            System.out.println("Input: \"" + test + "\" => isPalindrome: " + result);
        }
    }
}

class Solution{
    boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>= 'A' && s.charAt(i)<='Z'){
                ans+=s.charAt(i);
            }
        }     
        int left =0;
        int right = ans.length()-1;

        while (left<right) {
            if(ans.charAt(left)!=ans.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}