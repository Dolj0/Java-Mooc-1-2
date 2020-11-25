
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.valueOf(scanner.nextLine());
        int j = Integer.valueOf(scanner.nextLine());
        
        double k = Math.sqrt(j+i);
        
        
        System.out.println(Math.round(k));
    }
}
