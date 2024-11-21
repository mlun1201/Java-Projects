import java.util.Scanner;

public class GeometryCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Geometry Calculator");
      System.out.print("1. Calculate the Area of a Circle \n" +
                        "2. Calculate the Area of a Rectangle \n" +
                        "3. Calculate the Area of a Triangle \n" +
                        "4. Quit \n" + "\n" + "Enter your choice (1-4): ");
      int choice = input.nextInt();
      if(choice == 1){
         System.out.print("Enter radius of circle: ");
         System.out.println(Geometry.areaOfCircle(input.nextDouble()));
      }
      else if(choice == 2){
         System.out.print("Enter length of rectangle: ");
         double length = input.nextDouble();
         System.out.print("Enter width of rectangle: ");
         double width = input.nextDouble();
         System.out.println(Geometry.areaOfRectangle(length, width));
      }
      else if(choice == 3){
         System.out.print("Enter length of base of triangle: ");
         double base = input.nextDouble();
         System.out.print("Enter height of triangle: ");
         double height = input.nextDouble();
         System.out.println(Geometry.areaOfTriangle(base, height));
      }
      else if(choice == 4){
         System.out.println("Goodbye!");
      }
      else{
         System.out.println("Choice outside of range! Please choose from 1-4.");
      }
   }
}