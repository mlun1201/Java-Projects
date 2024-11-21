public class RoomDimension
{
    private double length;
    private double width;

    public RoomDimension(double len, double w){
        width = w;
        length = len;
    }

    public double getArea(){
        return length*width;
    }

    public String toString(){
        return("The length of the room is " + length + " and the width is " + width + ", so the area is " + getArea());
    }
}