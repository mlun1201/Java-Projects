public class Temperature {

    //temp info
    private double ftemp;
    
    //constructor, accepts argument for temperature
    public Temperature(double f){
        ftemp = f;
    }

    //mutator and accessor methods
    public void setFahrenheit(double f){
        ftemp = f;
    }

    public double getFahrenheit(){
        return ftemp;
    }

    //calculate and return celsius conversion
    public double celsius(){
        return (5.0/9)*(ftemp-32);
    }

    //calculate and return kelvin conversion
    public double kelvin(){
        return ((5.0/9)*(ftemp-32))+273;
    }
}