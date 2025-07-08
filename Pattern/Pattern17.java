public class Pattern17 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int cols=i;cols>=1;cols--){
                System.out.print(cols);
            }
            for(int cols=2;cols<=i;cols++){
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
