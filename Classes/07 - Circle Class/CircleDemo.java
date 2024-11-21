import java.util.Scanner;

public class CircleDemo {
   public static void main(String[] args) {
      //create circle with user input and calling class
      Scanner input = new Scanner(System.in);
      System.out.print("Enter circle's radius: ");
      double radius = input.nextDouble();
      Circle myCircle = new Circle(radius);
      //print circle's data with Circle class mathods
      System.out.println("Area: " + myCircle.area() + "\n" + "Diameter: " + myCircle.diameter() + "\n" + "Circumference: " + myCircle.circumference());
   }
}