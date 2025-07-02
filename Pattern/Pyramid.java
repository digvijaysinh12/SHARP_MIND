
public class Pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=4;k>=2*i-1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
