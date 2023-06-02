import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {
    void test1() {
        int[] a = new int[3];
        Scanner reader = new Scanner(System.in);
        int numOfValidInput = 0;
        while (numOfValidInput < 3) {
            try {
                if (numOfValidInput == 0) {
                    System.out.print("Input 3 integers: ");
                }
                a[numOfValidInput] = reader.nextInt();
                if(a[numOfValidInput] <0 || a[numOfValidInput]>100){
                    throw new InputOutOfRange("[ERROR] Input integer must be in [0, 100]!");
                }
                ++numOfValidInput;
            } catch (InputMismatchException error) {
                System.out.println("[ERROR] Input invalid characters, try again.");
                reader = new Scanner(System.in); // Create a new Scanner to clear invalid buffer.
                numOfValidInput = 0;
            } catch (InputOutOfRange error){
                String message = error.getMessage();
                System.out.println(message + " Try again!");
                reader = new Scanner(System.in);
                numOfValidInput = 0;
            }
        }
        System.out.println("Input succeed. The input numbers are:");
        for (int e : a) {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }

}

class InputOutOfRange extends Exception{
    public InputOutOfRange(){
        super();
    }
    public InputOutOfRange(String message){
        super(message);
    }
}
