public class findRowWithMaxOnes {

    static int findRowMaxOnesBrute(int matrix[][],int R,int C){
        int maxCount = -1;
        int maxRowIndex = -1;

        for(int i=0;i<R;i++){
            int count = countOnesOfEachRow(matrix[i]);
            if(count>maxCount&&count>0){
                maxCount = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    static int countOnesOfEachRow(int row[]){
        int left =0;
        int right = row.length-1;
        if(row[right]!=1){
            return 0;
        }
        int firstOneIndext = row.length;
        while (left<=right) {
            int mid = (left+right)/2;

            if(row[mid] == 1){
                firstOneIndext = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return row.length - firstOneIndext;
    }
    // Main method for testing various cases
    public static void main(String[] args) {
        // Test Case 1: Normal case
        int[][] matrix1 = {
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.println("Test Case 1 → Expected: 3, Got: " + findRowMaxOnesBrute(matrix1, 4, 4));

        // Test Case 2: All rows are zero
        int[][] matrix2 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Test Case 2 → Expected: -1, Got: " + findRowMaxOnesBrute(matrix2, 3, 3));

        // Test Case 3: All rows are ones
        int[][] matrix3 = {
            {1, 1},
            {1, 1},
            {1, 1}
        };
        System.out.println("Test Case 3 → Expected: 0, Got: " + findRowMaxOnesBrute(matrix3, 3, 2));

        // Test Case 4: Same number of ones in multiple rows
        int[][] matrix4 = {
            {0, 0, 1, 1},
            {0, 1, 1, 0},
            {1, 1, 0, 0},
            {1, 1, 0, 0}
        };
        System.out.println("Test Case 4 → Expected: 0, Got: " + findRowMaxOnesBrute(matrix4, 4, 4));

        // Test Case 5: Only one row
        int[][] matrix5 = {
            {0, 1, 1, 1}
        };
        System.out.println("Test Case 5 → Expected: 0, Got: " + findRowMaxOnesBrute(matrix5, 1, 4));
    }
}
