public class CarInstrumentSimulator
{
   public static void main(String[] args)
   {
      FuelGauge fuel = new FuelGauge(6);
      Odometer mileage = new Odometer(165789);
      for(int i=0;fuel.getFuel()<15;i++){
         fuel.addFuel();
      }
      System.out.println("Mileage: " + mileage.getMileage());
      System.out.println("Fuel: " + fuel.getFuel());
      for(int i=1;fuel.getFuel()>0;i++){
         mileage.addMileage();
         mileage.changeFuel(fuel, i);
         System.out.println("Mileage: " + mileage.getMileage());
         System.out.println("Fuel: " + fuel.getFuel());
      }
   }
}