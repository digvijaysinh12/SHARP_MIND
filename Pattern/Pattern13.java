// 11.  * * * * *
//       * * * *
//        * * *
//         * *
//          *

public class Pattern13{
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int rows =5;rows>=1;rows--){
            //spaces
            for(int space=1;space<=n-rows;space++){
                System.out.print("  ");
            }
            //stars
            for(int cols=1;cols<=2*rows-1;cols++){
                if(cols%2==0){
                    System.out.print("  ");
                }else{
                System.out.print("* ");
                }
            }
            //spaces
            for(int space=1;space<=n-rows;space++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}