import java.util.*;

public class Input_greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:"); // Prompt the user for input
        String name = sc.nextLine(); // Read the entire line entered by the user // printing whole word
        // String name = sc.next(); //-->>printing first word

        // nextInt() -->> taking input of integer
        // nextFloat() -->> taking input of float
        System.out.println("Hello, " + name + "!"); // Print the input
    }
}