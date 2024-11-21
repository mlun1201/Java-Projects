import java.util.Scanner;

public class SalesTax
{
   public static void main(String[] args)
   {
      //new scanner set up to make variables = input
      Scanner input=new Scanner(System.in);
      //ask user to input item's price
      System.out.print("Price of item: $");
      //next double entered will set the value for variable purchase
      double purchase = input.nextDouble();
      //create and initialize tax rate variables, calculate tax rate
      double stateTaxRate = 0.04*purchase, countyTaxRate = 0.02*purchase;
      double totalSalesTax = stateTaxRate + countyTaxRate;
      //print everything out
      //String.format(".2f",x) - rounds up to the first two decimals
      System.out.println("State sales tax: $" + String.format("%.2f",stateTaxRate) + "\n" + "County sales tax: $" + String.format("%.2f",countyTaxRate) + "\n" + "Total sales tax: $" + String.format("%.2f",totalSalesTax) + "\n" + "Total sale: $" + String.format("%.2f",(totalSalesTax+purchase)));
      //close scanner
      input.close();
   }
}