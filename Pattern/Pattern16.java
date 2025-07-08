public class Pattern16 {

    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (i == 0 || j == 0 || j == 2 * (n - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
