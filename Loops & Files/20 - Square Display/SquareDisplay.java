import java.util.Scanner;

public class SquareDisplay
{
   public static void main(String[] args)
   {
      //ask user for positive integer less than 15
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer no greater than 15: ");
      int integer = input.nextInt();
      //check if integer meets conditions
      if(integer<=0||integer>15){
         System.out.println("Invalid integer.");
      }
      else{
         //number of rows
         //loops 'integer' times
         for(int i=0;i<integer;i++){
            int count = 0;
            //number of columns
            //prints X 'integer' times
            while(count<integer){
               System.out.print("X");
               count++;
            }
            //move to next line
            System.out.println("");
         }
      }
   }
}