// 8.      *
//        ***
//       *****
//      *******
//     *********

public class Pattern10 {
    public static void main(String[] args) {
        pattern(5);
    }   

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            //stars
            for(int cols=1;cols<=2*i-1;cols++){
                System.out.print("* ");
            }
            //spaces
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
