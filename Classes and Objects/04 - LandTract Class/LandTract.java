public class LandTract
{
    private double length;
    private double width;

    public LandTract(double len, double w){
        length = len;
        width = w;
    }

    public double getArea(){
        return length*width;
    }

    public boolean equals(LandTract tract2){
        boolean status = false;
        if(getArea() == tract2.getArea()){
            status = true;
        }
        return status;
    }

    public String toString(){
        return("The area of the tract is: " + getArea());
    }
}