public class Pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print("  ");
            }
            for(int stars=1;stars<=2*i-1;stars++){
                if(stars==1 || stars==2*i-1||i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
