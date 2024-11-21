public class LandTract
{
    //fields
    private double length;
    private double width;

    //constructor
    public LandTract(double len, double w){
        length = len;
        width = w;
    }

    //calculate and return area
    public double getArea(){
        return length*width;
    }

    //determine and return if the area of two tracts are equal
    public boolean equals(LandTract tract2){
        boolean status = false;
        if(getArea() == tract2.getArea()){
            status = true;
        }
        return status;
    }

    //display area
    public String toString(){
        return("The area of the tract is: " + getArea());
    }
}