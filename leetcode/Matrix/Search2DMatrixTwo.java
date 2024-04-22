package leetcode.Matrix;

public class Search2DMatrixTwo {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(matrix.length);
            int start = 0;
            int end = matrix[i].length - 1;

            printArr(matrix[i]);

            while(start <= end) {
                int mid = (start + end) / 2;

                if(target == matrix[i][mid]) {
                    return true;
                } else if(target > matrix[i][mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(matrix, 5));
    }
    
}
