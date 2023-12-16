package beginner.TwoDimensionalArray;

public class DiagonalSum {
    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(i == j) {
                    sum += arr[i][j];
                }

                if(i + j == arr.length - 1 && i != j) {
                    sum += arr[i][j];
                } 
            }
        }

        return sum;
    }

    public static int optimizedDiagonalSum(int arr[][]) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            
            // i+j = n - 1 => j = n - 1 - i
            int j = arr.length - 1 - i;
            if((i + j) == arr.length - 1 && i != j) sum += arr[i][j];
        }

        return sum;
    }

    public static void main(String[] args) {
        int evenMatrix[][] = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16}};

        int oddMatrix[][] = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}};

        System.out.println(diagonalSum(evenMatrix));
        System.out.println(diagonalSum(oddMatrix));

        System.out.println(optimizedDiagonalSum(evenMatrix));
        System.out.println(optimizedDiagonalSum(oddMatrix));
    }
}
