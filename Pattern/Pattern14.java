
public class Pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i=5;i>=1;i--){
            {
                for(int spaces=1;spaces<=n-i;spaces++){
                    System.out.print("  ");
                }
                
                for(int stars=1;stars<=2*i-1;stars++){
                    if(stars%2==0){
                      System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            {

            }
            System.out.println();
        }
    }
}