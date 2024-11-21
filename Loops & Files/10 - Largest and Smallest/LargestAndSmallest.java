import java.util.Scanner;

public class LargestAndSmallest
{
   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer (enter -99 to stop): ");
      int value = input.nextInt();
      //to hold the largest and smallest values
      int smallest = value;
      int largest = value;
      for(int i=1;i>0;i++){
         //ask user for series of numbers
         System.out.print("Enter an integer (enter -99 to stop): ");
         value = input.nextInt();
         //stop asking when user inputs -99
         if(value!=-99){
            //checks value of each integer and compares with largest and smallest to switch out
            if(value>largest){
               largest=value;
            }
            if(value<smallest){
               smallest=value;
            }
         }
         else{
            //breaks loop
            break;
         }
      }
      //print results
      System.out.println("The smallest number entered was " + smallest + " and the largest number entered was " + largest);
   }
}