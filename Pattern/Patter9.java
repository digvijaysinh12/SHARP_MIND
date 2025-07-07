/*
    *  *  *  *  *
       *  *  *  * 
          *  *  *
             *  *
                *

*/
public class Patter9 {
    public static void main(String[] args) {
         pattern(5);   
    }


static void pattern(int n){
    for(int rows =1;rows<=n;rows++){
        for(int spaces=1;spaces<=rows-1;spaces++){
            System.out.print("  ");
        }
        for(int cols=1;cols<=n-rows+1;cols++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}