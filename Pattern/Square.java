import java.util.Scanner;

public class Square {

    static void printSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");

                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Enter Number that you print square ==> ");
        N = sc.nextInt();
        printSquare(N);
    }
}
