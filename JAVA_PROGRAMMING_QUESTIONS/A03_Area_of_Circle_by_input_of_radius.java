import java.util.Scanner;

public class A03_Area_of_Circle_by_input_of_radius {
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius of Circle : ");
      float radius = sc.nextFloat();
      float pie = 3.14f;
      float Area_of_Circle = pie * radius * radius;
      System.out.print("Area of Circle of radius "+ radius +" : " + Area_of_Circle);
  }
}
