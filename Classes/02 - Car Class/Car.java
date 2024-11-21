public class Car {
    //car info
    private int yearModel;
    private String make;
    private int speed;

    //constructor, accepts arguments for only year and make
    public Car(int y, String m){
        yearModel = y;
        make = m;
        speed = 0;
    }

    //accessor methods
    public int getYearModel(){
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    //return calculated acceleration
    public int accelerate(){
        return speed+=5;
    }

    //return calculated deceleration
    public int brake(){
        return speed-=5;
    }
}