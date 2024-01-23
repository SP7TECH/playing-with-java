package revision2024;

public class Practice010 {
    // Trapping Rain Water

    public static int maxWaterTrapped(int barHeights[]) {
        int n = barHeights.length;
        
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];
        int waterTrapped = 0;

        // max left
        maxLeft[0] = barHeights[0];
        for(int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(barHeights[i], maxLeft[i - 1]);
        }

        // max right
        maxRight[n - 1] = barHeights[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], barHeights[i]);
        }

        for(int i = 0; i < n; i++) {
            System.out.println(maxRight[i]);
        }

        // calculating the water trapped
        for(int i = 0; i < n; i++) {
            int currentTrappedWater = (Math.min(maxLeft[i], maxRight[i]) - barHeights[i]);
            waterTrapped += currentTrappedWater;
        }

        return waterTrapped;
    } 
    
    public static void main(String[] args) {
        int barHeights[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Water trapped: " + maxWaterTrapped(barHeights));;
    }
    
}
