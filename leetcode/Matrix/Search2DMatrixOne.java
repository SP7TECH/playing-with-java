package leetcode.Matrix;

public class Search2DMatrixOne {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5, 7}, 
                {10, 11, 16, 20}, 
                {23,30,34,60}};

        System.out.println(searchMatrix(arr, 3));;
    }
}
