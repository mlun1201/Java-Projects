import java.util.Scanner; 

public class FreezeBoilDemo {
   public static void main(String[] args) {
      //create temperature with user input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter temperature: ");
      int temp = input.nextInt();
      FreezeBoil myTemp = new FreezeBoil(temp);
      //three boolean variables to compare to
      boolean ethylStateBoiling = myTemp.isEthylBoiling();
      boolean oxygenStateBoiling = myTemp.isOxygenBoiling();
      boolean waterStateBoiling = myTemp.isWaterBoiling();
      boolean ethylStateFreezing = myTemp.isEthylFreezing();
      boolean oxygenStateFreezing = myTemp.isOxygenFreezing();
      boolean waterStateFreezing = myTemp.isWaterFreezing();
      //check and print if it will boil or freeze
      if(ethylStateBoiling==true){
         System.out.println("At " + temp + " ethyl will boil.");
      }
      if(oxygenStateBoiling==true){
         System.out.println("At " + temp + " oxygen will boil.");
      }
      if(waterStateBoiling==true){
         System.out.println("At " + temp + " water will boil.");
      }
      if(ethylStateFreezing==true){
         System.out.println("At " + temp + " ethyl will freeze.");
      }
      if(oxygenStateFreezing==true){
         System.out.println("At " + temp + " oxygen will freeze.");
      }
      if(waterStateFreezing==true){
         System.out.println("At " + temp + " water will freeze.");
      }
   }
}