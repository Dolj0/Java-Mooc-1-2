
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int j = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i<0){
                j = j+1;  
            } else if (i>0){
                continue;
            } else {
                System.out.println("Number of negative numbers: "+j);
                break;
            }
        }
    }
}
