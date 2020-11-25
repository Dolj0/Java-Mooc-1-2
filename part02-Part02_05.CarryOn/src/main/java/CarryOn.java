
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String i = "placeholder";
        while (true){    
            if (i.equals("no")) {
                break;
            } 
            System.out.println("Shall we carry on?");
            i = scanner.nextLine();

        }
    }    
}
    

