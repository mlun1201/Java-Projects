import java.util.Scanner;

public class CompoundInterest
{
   public static void main(String[] args)
   {
      //scanner to take user input
      Scanner input = new Scanner(System.in);
      //ask user what their deposit amount is
      System.out.print("Original deposit amount: $");
      //the input is assigned to double variable principal
      double principal = input.nextDouble();
      //ask for annual interest rate
      System.out.print("Annual interest rate: ");
      //input is assigned to double rate
      double rate = input.nextDouble();
      //convert percentage rate to decimal rate
      rate /= 100;
      //ask for # of times interest is compounded a year
      System.out.print("# of times interest is compounded per year: ");
      //input is assigned to double compounded
      double compounded = input.nextInt();
      //ask how long the account will earn interest
      System.out.print("# of years account will be left to earn interest: ");
      //input assigned to int years
      //rather than double, int is used so that value is not a decimal
      int years = input.nextInt();
      //calculate the compound interest
      //Math.pow(a,b) - used to raise value to a power. a is the base number, b is the exponent
      double amount = principal*(Math.pow((1+(rate/compounded)),(compounded*years)));
      //String.format("%.2f",x) used to round to first two decimals
      System.out.println("Amount of money after " + years + " years: $" + String.format("%.2f",amount));
      //close scanner
      input.close();
   }
}