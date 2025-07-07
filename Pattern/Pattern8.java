/*
               *
            *  *
         *  *  *
      *  *  *  *
   *  *  *  *  *
 */
public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int rows=1;rows<=n;rows++){
            // for spaces
            for(int space=1;space<=n-rows;space++){
                System.out.print("  ");
            }
            //for *
            for(int cols=1;cols<=rows;cols++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
