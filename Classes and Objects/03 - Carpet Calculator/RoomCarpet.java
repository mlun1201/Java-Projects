public class RoomCarpet
{
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost){
        size = dim;
        carpetCost = cost;
    }

    public double getTotalCost(){
        return size.getArea()*carpetCost;
    }

    public String toString(){
        return("The carpet cost per square foot is $" + carpetCost + " so the total cost of the carpet will be $" + getTotalCost());
    }
}
