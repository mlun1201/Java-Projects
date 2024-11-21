import java.util.Scanner;
 
public class WiFiDiagnostic
{
   public static void main(String[] args)
   {
      //scanner object for keyboard input
      Scanner input = new Scanner(System.in);
      //begin suggestion-confirmation
      System.out.println("Reboot the computer and try to connect.");
      System.out.print("Did that fix the problem? ");
      String answer = input.nextLine();
      //check if problem has been fixed, else continue suggestions until user answer is not "no" or final suggestion is made
      //if answer is not "no", program ends
      if(answer.compareTo("no") == 0){
         System.out.println("Reboot the router and try to connect.");
         System.out.print("Did that fix the problem? ");
         answer = input.nextLine();
         if(answer.compareTo("no") == 0){
            System.out.println("Make sure the cables between the router & modern are plugged in firmly.");
            System.out.print("Did that fix the problem? ");
            answer = input.nextLine();
            if(answer.compareTo("no") == 0){
               System.out.println("Move the router to a new location and try to connect.");
               System.out.print("Did that fix the problem? ");
               answer = input.nextLine();
               if(answer.compareTo("no") == 0){
                  System.out.println("Get a new router.");
               }
            }
         }
      }
   }
}