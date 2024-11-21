public class Circle {
   //circle info
   private double radius;
   //fixed
   final double PI = 3.14159;

   //constructor, accepts argument for radius of circle
   public Circle(double r){
    radius = r;
   }

   //no-arg constructor
   public Circle(){
    radius = 0.0;
   }

   //mutator and accessor methods
   public void setRadius(double r){
    radius = r;
   }

   public double getRadius(){
    return radius;
   }

   //calculate and return area of circle
   public double area(){
    return PI*radius*radius;
   }

   //calculate and return diameter of circle
   public double diameter(){
    return radius*2;
   }

   //calculate and return circumference of circle
   public double circumference(){
    return 2*PI*radius;
   }
}