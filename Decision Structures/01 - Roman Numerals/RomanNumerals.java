import java.util.Scanner;

public class RomanNumerals
{
   public static void main(String[] args)
   {
      //variables
      int number;
      String romanNumeral;
      //scanner object for keyboard input
      Scanner input = new Scanner(System.in);
      //get number from 1-10
      System.out.print("Enter a number between 1 and 10: ");
      number = input.nextInt();
      //get the roman numeral conversion of number
      romanNumeral = switch(number)
      {
         default -> "Invalid number";
         case 1 -> "I";
         case 2 -> "II";
         case 3 -> "III";
         case 4 -> "IV";
         case 5 -> "V";
         case 6 -> "VI";
         case 7 -> "VII";
         case 8 -> "VIII";
         case 9 -> "IX";
         case 10 -> "X";
      };

      // Display the roman numeral
      System.out.println(romanNumeral);
   }
}