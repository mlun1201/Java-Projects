import java.util.Scanner;

public class TestScoresAndGrade
{
   public static void main(String[] args)
   {
      //variable to test score average
      double average=0;
      //scanner object for keyboard input
      Scanner input=new Scanner(System.in);
      //for loop to continue until 3 test scores are taken
      for(int i=1;i<4;i++){
         //get test score
         System.out.print("Test Score " + i + ": " );
         double test_i = input.nextDouble();
         //checks to see if number is within bounds
         if(test_i<0||test_i>100){
            System.out.println("Invalid");
            //repeats iteration of loop until valid number is inputted
            i-=1;
         }
         else{
            //add each score up
            average += test_i;
         }
      }
      //calculate average and print
      average/=3;
      //two decimals
      System.out.println("Average Score: " + average);
      //print out corresponding letter grade
      if(average<60){
         System.out.println("Grade: F");
      }
      else if(average<70){
         System.out.println("Grade: D");
      }
      else if(average<80){
         System.out.println("Grade: C");
      }
      else if(average<90){
         System.out.println("Grade: B");
      }
      else{
         System.out.println("Grade: A");
      }
   }
}