import java.util.Scanner;

public class LandTractDemo
{
   public static void main(String[] args)
   {
      //take user input
      Scanner input = new Scanner(System.in);
      //get length and width of tracts and create LandTract objects for both
      //print dimensions for each after creating object
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
      //display if areas of tracts are equal or not
      if(tract1.equals(tract2)==true){
         System.out.println("The areas of both tracts are equal.");
      }
      else{
         System.out.println("The areas of both tracts are unequal.");
      }
   }
}