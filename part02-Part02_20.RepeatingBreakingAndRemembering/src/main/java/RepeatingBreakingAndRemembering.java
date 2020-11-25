
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        float k = 0;
        float j = 0;
        float l = 0;
        int o = 0;
        int e = 0;

        System.out.println("Give numbers:");
        
        while (true){
            int i = Integer.valueOf(scanner.nextLine());
            
            if (i==-1) {
                break;
            } else {
                
                if ((i%2)==0){
                    e++;
                } else if (i%2!=0){
                    o++;
                }
           
                j++;
                k = i+k;
                l= k/j;
                continue;
            }
        
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+Math.round(k));
        System.out.println("Numbers: "+Math.round(j));
        System.out.println("Average: "+l);
        System.out.println("Even: "+e);
        System.out.println("Odd: "+o);
    }
}
