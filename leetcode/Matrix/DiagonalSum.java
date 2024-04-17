package leetcode.Matrix;

public class DiagonalSum {
    public static int diagonalSumBruteForce(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(i == j) {
                    sum += mat[i][j];
                }

                if(i + j == mat.length - 1 && i != j) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSumBruteForce(matrix));
    }
}
