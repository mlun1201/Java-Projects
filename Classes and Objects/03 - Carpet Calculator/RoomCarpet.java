public class RoomCarpet
{
    //fields
    private RoomDimension size;
    private double carpetCost;

    //constructor, take RoomDimension object
    public RoomCarpet(RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }

    //call method from RoomDimension to calculate and return total cost
    public double getTotalCost(){
        return size.getArea()*carpetCost;
    }

    //display cost
    public String toString(){
        return("The carpet cost per square foot is $" + carpetCost + " so the total cost of the carpet will be $" + getTotalCost());
    }
}
