import java.util.Scanner;

public class DriverTest
{
   public static void main(String[] args) 
   {
      //create new DriverExam object
      DriverExam d = new DriverExam();
      //take user input
      Scanner input = new Scanner(System.in);
      System.out.println("Enter student's answers:");
      //get and assign student's answers to studentanswers array
      for(int i=0;i<20;i++){
         System.out.print(i+1 + ". ");
         d.setStudentAnswers(i, input.nextLine());
      }
      //print if student passed or not
      if(d.passed() == true){
         System.out.println("Student passed!");
      }
      else{
         System.out.println("Student failed.");
      }
      //print total correct and wrong
      System.out.println("Total Correct: " + d.totalCorrect() + "\n" + "Total Incorrect: " + d.totalIncorrect());
      //print which questions were missed
      System.out.print("Questions Missed: ");
      for(int i=0;i<20;i++){
         if(d.questionsMissed()[i] != 0){
            System.out.print(d.questionsMissed()[i] + " ");
         }
      }
   }  
}