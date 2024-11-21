import java.util.Scanner;

public class TestAverage
{
   public static void main(String[] args)
   {
      //create and initialize average variable
      double average=0;
      //scanner to take user input
      Scanner input=new Scanner(System.in);
      //for loop repeats the process of taking next double input and setting it as value for double variable test_i
      for(int i=1;i<4;i++){
         //prints out Test Score + the loop # indicating each score is different
         System.out.print("Test Score " + i + ": " );
         //test_i acts as a singular variable for that specific run of the loop, thus replaced through each iteration
         double test_i = input.nextDouble();
         //value of test_i in each loop is added to the average, which is a variable that does not reset because it's outside of loop
         average += test_i;
      }
      //printed, use String.format("%.2f", x) to round up to first two decimals
      //calculates average when printing
      System.out.println("Score Average: " + String.format("%.2f",average/3));
      //close scanner
      input.close();
   }
}