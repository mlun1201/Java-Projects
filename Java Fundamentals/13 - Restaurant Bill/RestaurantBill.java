import java.util.Scanner;

public class RestaurantBill
{
   public static void main(String[] args)
   {
      //scanner to take user input
      Scanner input = new Scanner(System.in);
      //ask user for meal price
      System.out.print("Charge for the Meal: $");
      //User input becomes value of the double variable mealCharge
      double mealCharge = input.nextDouble();
      //intialize variables for tax, total, and tip
      //assign them calculated values based on previous variable
      double tax=mealCharge*0.0675, total=tax+mealCharge, tip=total*0.2;
      //print using String.format("%.2f",x) to round up to first two decimals
      //calculates total when printing (total+tip)
      System.out.println("Tax: $" + String.format("%.2f", tax) + "\n" + "Tip: $" + String.format("%.2f", tip) + "\n" + "Total Bill: $" + String.format("%.2f", total+tip));
      //close scanner
      input.close();
   }
}