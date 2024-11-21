import java.util.Scanner;

public class SortedNames
{
   public static void main(String[] args)
   {
      //scanner object for keyboard input
      Scanner input = new Scanner(System.in);
      //get 3 names
      System.out.print("Enter a name: ");
      String nameOne = input.nextLine();
      System.out.print("Enter a name: ");
      String nameTwo = input.nextLine();
      System.out.print("Enter a name: ");
      String nameThree = input.nextLine();
      //compare each name to one another and display alphabetically
      if(nameOne.compareToIgnoreCase(nameTwo) < 0){
         if (nameOne.compareToIgnoreCase(nameThree) < 0){
            System.out.println(nameOne);
            if(nameTwo.compareToIgnoreCase(nameThree) < 0){
               System.out.println(nameTwo);
               System.out.println(nameThree);
            }
            else{
               System.out.println(nameThree);
               System.out.println(nameTwo);
            }
         }
         else{
            System.out.println(nameThree);
            System.out.println(nameOne);
            System.out.println(nameTwo);
         }
      }
      else if(nameTwo.compareToIgnoreCase(nameThree) < 0){
         System.out.println(nameTwo);
         if(nameOne.compareToIgnoreCase(nameThree) < 0){
            System.out.println(nameOne);
            System.out.println(nameThree);
         }
         else{
            System.out.println(nameThree);
            System.out.println(nameOne);
         }
      }
      else{
         System.out.println(nameThree);
         System.out.println(nameTwo);
         System.out.println(nameOne);
      }
   }
}