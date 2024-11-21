import java.util.Scanner;

public class LetterCounter
{
   public static void main(String[] args)
   {
      //to keep count
      int count = 0;
      //ask user for string
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      //ask user for character
      String statement = input.nextLine();
      System.out.print("Enter a character: ");
      String character = input.nextLine();
      //convert String to char
      char c = character.charAt(0);
      //count how many times the character appears in string
      for(int i=0;i<statement.length();i++){
         if((statement.charAt(i)) == c){
            count++;
         }
      }
      //print results
      System.out.println("The character " + c + " appears " + count + " times");;
   }
}