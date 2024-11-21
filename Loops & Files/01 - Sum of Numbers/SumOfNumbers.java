import java.util.Scanner;

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      //to hold final total
      int sum = 0;
      //ask user for positive integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int number = input.nextInt();
      //add up all integers up to input
      for(int i=1;i<=number;i++){
         sum+=i;
      }
      //print out results
      System.out.println("The sum of all integers from 1 to " + number + " = " + sum);
   }
}