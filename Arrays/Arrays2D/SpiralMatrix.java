package Arrays.Arrays2D;

// Print array in spiral manner

//Input: matrix = [[1,2,3],
//                 [4,5,6],
//                 [7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]

//Input: matrix = [[1,2,3,4],
//                 [5,6,7,8],
//                 [9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;

        while ((left <= right) && (top <= bottom)) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            } top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            } right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                } bottom --;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[left][i]);
                }
            }
        }

        return result;
    }

    static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> order =  spiral(matrix);
        System.out.println(order);
    }
}
