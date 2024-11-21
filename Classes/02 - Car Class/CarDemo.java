public class CarDemo {
   public static void main(String[] args) {
      //create car with year and make
      Car myCar = new Car(2011, "Toyota");
      //accelerate and print speed using get and accelerate method
      for(int i=0;i<5;i++){
         myCar.accelerate();
         System.out.println("Current speed of car: " + myCar.getSpeed() + " m/h");
      }
      //brake and print speed using get and brake method
      for(int i=0;i<5;i++){
         myCar.brake();
         System.out.println("Current speed of car: " + myCar.getSpeed() + " m/h");
      }
   }
}