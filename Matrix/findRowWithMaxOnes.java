/*
Problem Statement:
Given a row-wise sorted binary matrix of size R x C, find the 0-indexed row number 
that contains the maximum number of 1s. If multiple rows have the same maximum number,
return the smallest row index. If no 1s exist, return -1.

Example:
Input:
    mat = [
      [0, 0, 0, 1],
      [0, 1, 1, 1],
      [0, 0, 1, 1],
      [1, 1, 1, 1]
    ]

Output:3

Explanation:
Row 3 contains 4 ones which is the maximum among all rows.
If there were multiple rows with 4 ones, we would return the smallest row index.

---

Approaches:
1. Optimal Approach (O(R + C)) - Traverse from top-right corner moving left or down.
2. Brute Force Approach (O(R * log C)) - Use binary search to count ones per row.
*/


public class findRowWithMaxOnes {

    // Optimal Approach
    static int findRowMaxOnesOptimal(int[][] matrix,int R,int C){
        int row = 0;
        int col = C-1;
        int maxRowIndex = -1;
        while (row<R&&col>=0) {
            if(matrix[row][col]==1){
                maxRowIndex = row;
                col = col-1;
            }else{
                row = row+1;
            }
        }
        return maxRowIndex;
    }

    // Bruete Force Approach
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
        System.out.println("Test Case 1 → Expected: 3, Got: " + findRowMaxOnesOptimal(matrix1, 4, 4));

        // Test Case 2: All rows are zero
        int[][] matrix2 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Test Case 2 → Expected: -1, Got: " + findRowMaxOnesOptimal(matrix2, 3, 3));

        // Test Case 3: All rows are ones
        int[][] matrix3 = {
            {1, 1},
            {1, 1},
            {1, 1}
        };
        System.out.println("Test Case 3 → Expected: 0, Got: " + findRowMaxOnesOptimal(matrix3, 3, 2));

        // Test Case 5: Only one row
        int[][] matrix5 = {
            {0, 1, 1, 1}
        };
        System.out.println("Test Case 5 → Expected: 0, Got: " + findRowMaxOnesOptimal(matrix5, 1, 4));
    }
}
