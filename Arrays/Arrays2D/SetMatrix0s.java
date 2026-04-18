package Arrays.Arrays2D;

// Set matrix zeros
// Input:  [[1,1,1],
//          [1,0,1],
//          [1,1,1]]
// Output: [[1,0,1]
//         ,[0,0,0],
//          [1,0,1]]

// Input:  [[0,1,2,0],
//          [3,4,5,2],
//          [1,3,1,5]]
// Output: [[0,0,0,0],
//          [0,4,5,0],
//          [0,3,1,0]]

import java.util.Arrays;

public class SetMatrix0s {
    static void setzeros(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[] row = new int[n], col = new int[m];

        for (int r = 0;  r <  n; r++) {
            for (int c = 0; c < m; c++) {
                if (matrix[r][c] == 0) {
                    row[r] = -1; col[c] = -1;
                }
            }
        }

        for (int r = 0;  r <  n; r++) {
            for (int c = 0; c < m; c++) {
                if (row[r] == -1 || col[c] == -1) {
                    matrix[r][c] = 0;
                }
            }
        }
    }

    static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0},{1, 2, 1, 9}, {1, 1, 1, 4}};
        setzeros(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
