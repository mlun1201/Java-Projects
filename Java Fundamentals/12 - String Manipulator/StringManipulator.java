import java.util.Scanner;

public class StringManipulator
{
   public static void main(String[] args)
   {
      //initialize Scanner to read inputs from user
      Scanner input = new Scanner(System.in);
      //ask user what their favorite city is
      System.out.println("What's your favorite city?");
      //User input will be assigned to String favCity
      String favCity = input.nextLine();
      //x.length() - # of characters in a String + 1
      //x.toUpperCase() - transforms all characters of String to uppercase
      //x.toLowerCase() - transforms all characters of String to lowercase
      //x.charAt(#) - finds specific character within String
      System.out.println("# of characters in the name: " + favCity.length() + "\n" + "The city in uppercase is: " + favCity.toUpperCase() + "\n" + "The city in lowercase is: " + favCity.toLowerCase() + "\n" + "The first character is: " + favCity.charAt(0));
      //close scanner
      input.close();
   }
}