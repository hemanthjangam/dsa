package Arrays.Arrays2D;

//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

//Example 1:
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

//Example 2:
//Input: numRows = 1
//Output: [[1]]


import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    static List<List<Integer>> triangles(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.getFirst().add(1);
        if (numRows == 1) return matrix;

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int val = matrix.get(i - 1).get(j - 1) + matrix.get(i - 1).get(j);
                row.add(val);
            }
            row.add(1);
            matrix.add(row);
        }

        return matrix;
    }

    static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> matrix =  triangles(numRows);
        System.out.println(matrix);
    }
}
