import java.util.*;

public class Addition_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum of a + b is :" + sum);
    }
}
