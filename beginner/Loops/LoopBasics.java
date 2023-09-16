package beginner.Loops;

public class LoopBasics {
    public static void main(String args[]) {
        // Printing a pattern with for

        for(int i = 0; i < 4; i++) {
            System.out.println("* * * *");
        }

        // Printing a pattern with while

        System.out.println("With while");
        int j = 0;
        while(j < 4) {
            System.out.println("* * * *");
            j++;
        }
    }
}
