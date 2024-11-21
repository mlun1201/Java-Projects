import java.util.Scanner;

public class LandTractDemo
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter length of tract 1: ");
      double length1 = input.nextDouble();
      System.out.print("Enter width of tract 1: ");
      double width1 = input.nextDouble();
      LandTract tract1 = new LandTract(length1, width1);
      System.out.println(tract1.toString());
      System.out.print("Enter length of tract 2: ");
      double length2 = input.nextDouble();
      System.out.print("Enter width of tract 2: ");
      double width2 = input.nextDouble();
      LandTract tract2 = new LandTract(length2, width2);
      System.out.println(tract2.toString());
      if(tract1.equals(tract2)==true){
         System.out.println("The areas of both tracts are equal.");
      }
      else{
         System.out.println("The areas of both tracts are unequal.");
      }
   }
}