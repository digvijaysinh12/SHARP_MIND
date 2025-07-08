public class Pattern18 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Distance from the edges
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Value to print
                System.out.print((n - minDistance) + " ");
            }
            System.out.println();
        }
    }
}
