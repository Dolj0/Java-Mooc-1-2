
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = 0;
        double j = 0;
        double k = 0;
                
        while (true) {
            i = Double.valueOf(scanner.nextLine());
            if (i>0) {
                j = j+i;
                k++;
            } else if (i<0) {
                continue;
            } else {
                break;
            }
        }
        
        if (j!=0) {
            System.out.println(j/k);
        } else {
            System.out.println("Cannot calculate the average");
        } 
    }
}
