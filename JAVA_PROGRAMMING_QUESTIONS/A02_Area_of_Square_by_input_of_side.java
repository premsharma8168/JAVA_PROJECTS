import java.util.*;
public class A02_Area_of_Square_by_input_of_side {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Side of Square : ");
      float side = sc.nextFloat();
      float Area_of_Square = side * side;
      System.out.print("Area of Square of Side "+ side +" : " + Area_of_Square);
  }
}