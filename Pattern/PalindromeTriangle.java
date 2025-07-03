public class PalindromeTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            // inner loop to print the spaces
            for (int j = 1; j <= 2 * (6 - i); j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
