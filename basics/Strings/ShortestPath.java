package basics.Strings;
import java.util.Scanner;

public class ShortestPath {
    public static float shortestPath(String path) {
        float x = 0, y = 0;
        path = path.toUpperCase();
        
        for(int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    y++;
                    break;

                case 'S':
                    y--;
                    break;

                case 'E':
                    x++;
                    break;
            
                default:
                    y--;
                    break;
            }
        }

        float x2 = (float)Math.pow(x, 2);
        float y2 = (float)Math.pow(y, 2);

        return (float)Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the path: ");
            String path = sc.nextLine();
            
            if(shortestPath(path) != -1) {
                System.out.println(shortestPath(path));
            } else {
                System.out.println("Not a valid string");
            }
        }
    }
}
