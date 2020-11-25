
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i=0; i<number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=0; i<number; i++){
            System.out.print(" ");
        }    
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int j=size-1;
        for (int i=1; i<=size; i++){
            printSpaces(j);
            printStars(i);
            j=j-1;
        }
       
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int j = 1; 
        int i = height-1;
        int k = height-2;
                
        for (int h=0; h<height; h++){
            printSpaces(i);
            i = i-1;
            printStars(j);
            j = j+2;
        }
        for (int p=0; p<2; p++){  
            printSpaces(k);
            printStars(3);
        }    

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
