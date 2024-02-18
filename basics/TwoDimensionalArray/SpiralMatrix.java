package basics.TwoDimensionalArray;

public class SpiralMatrix {

    public static void printSpiralMatrix(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol) {
            
            // Top Row 
            for(int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right Col
            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom Row
            for(int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // Left Col
            for(int i = endRow - 1; i >= startRow + 1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startRow] + " ");
            }

            System.out.println();
            
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
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

        printSpiralMatrix(evenMatrix);
        printSpiralMatrix(oddMatrix);
    }
    
}
