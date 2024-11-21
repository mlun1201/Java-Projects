import java.util.Scanner;

public class CarpetCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Length of floor: ");
      double length = input.nextDouble();
      System.out.print("Width of floor: ");
      double width = input.nextDouble();
      System.out.print("Cost per sq ft: $");
      double cost = input.nextDouble();
      RoomDimension room = new RoomDimension(length, width);
      RoomCarpet carpetCost = new RoomCarpet(room, cost);
      System.out.println(room.toString() + "\n" + carpetCost.toString());
   }
}