import java.util.Scanner;

public class BodyMassIndex
{
   public static void main(String[] args)
   {
      //scanner object for keyboard input
      Scanner input = new Scanner(System.in);
      //get weight of user in pounds
      System.out.print("Weight (pounds): ");
      double pounds = input.nextDouble();
      //get height of user in inches
      System.out.print("Height (inches): ");
      double inches = input.nextDouble();
      //calculate bmi
      double bmi = pounds*(703/(Math.pow(inches, 2)));
      //determine and display user's bmi rating
      if(bmi<18.5){
         System.out.println("According to your BMI you are underweight.");
      }
      else if(bmi>25){
         System.out.println("According to your BMI you are overweight.");
      }
      else{
         System.out.println("According to your BMI you are at a normal weight.");
      }
   }
}