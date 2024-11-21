import java.util.Scanner;

public class TemperatureDemo {
   public static void main(String[] args){
      //create temperature object with user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Fahrenheit temperature: ");
      double temp = input.nextDouble();
      Temperature ftemp = new Temperature(temp);
      //call and print conversions
      System.out.println("In Celsius: " + ftemp.celsius() + "\n" + "In Kelvin: " + ftemp.kelvin());
   }
}