package Arrays.Arrays2D;

// Right rotate matrix by 90degrees
// Input:  [[1,2,3],
//          [4,5,6],
//          [7,8,9]]
// Output: [[7,4,1],
//          [8,5,2],
//          [9,6,3]]

// Input:  [[5,1,9,11],
//          [2,4,8,10],
//          [13,3,6,7],
//          [15,14,12,16]]
// Output: [[15,13,2,5],
//          [14,3,4,1],
//          [12,6,8,9],
//          [16,7,10,11]]

import java.util.Arrays;

public class RightRotate90 {
    static void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        for (int r = 0; r < n; r++) {
            for (int c = r + 1; c < m; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }

        for (int r = 0; r < n; r++) {
            int left = 0, right = matrix[0].length - 1;
            while (left < right) {
                int temp = matrix[r][right];
                matrix[r][right] = matrix[r][left];
                matrix[r][left] = temp;
                left++; right--;
            }
        }
    }

    static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
