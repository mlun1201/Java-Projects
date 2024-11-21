import java.util.Scanner;

public class CarpetCalculator
{
   public static void main(String[] args)
   {
      //take user input
      Scanner input = new Scanner(System.in);
      //get length, width, and cost per sqft of floor
      System.out.print("Length of floor: ");
      double length = input.nextDouble();
      System.out.print("Width of floor: ");
      double width = input.nextDouble();
      System.out.print("Cost per sq ft: $");
      double cost = input.nextDouble();
      //create RoomDimension object
      RoomDimension room = new RoomDimension(length, width);
      //create RoomCarpet object with RoomDimension object
      RoomCarpet carpetCost = new RoomCarpet(room, cost);
      //print total cost
      System.out.println(room.toString() + "\n" + carpetCost.toString());
   }
}