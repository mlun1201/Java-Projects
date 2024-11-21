import java.util.Scanner;

public class PayrollDemo
{
   public static void main(String[] args)
   {
      //take user input
      Scanner input = new Scanner(System.in);
      //create Payroll object, default constructor
      Payroll p = new Payroll();
      //loop that set and assign all employees' hours, payrates, and gross pay to appropriate arrays
      for(int i=0;i<p.getEmployeeID().length;i++){
         System.out.println("Employee " + p.getEmployeeID()[i]);
         System.out.print("Enter this employee's hours: ");
         p.setHours(i, input.nextInt());
         System.out.print("Enter this employee's pay rate: ");
         p.setPayRate(i, input.nextDouble());
         p.setWages(i, p.grossPay(p.getEmployeeID()[i]));
      }
      //print table displaying employee wages
      System.out.println("Employee ID" + "               " + "Gross Wage");
      System.out.println("____________________________________");
      //loop prints all employees
      for(int i=0;i<p.getEmployeeID().length;i++){
         System.out.println(p.getEmployeeID()[i] + "                   " + p.getWages()[i]);
      }
   }
}