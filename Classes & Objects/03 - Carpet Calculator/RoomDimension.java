public class RoomDimension
{
    //fields
    private double length;
    private double width;

    //constructor
    public RoomDimension(double len, double w){
        width = w;
        length = len;
    }

    //calculate and return area of room
    public double getArea(){
        return length*width;
    }

    //display dimensions
    public String toString(){
        return("The length of the room is " + length + " and the width is " + width + ", so the area is " + getArea());
    }
}