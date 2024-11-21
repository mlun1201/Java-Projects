public class Geometry
{
    //checks if value positive or negative
    //calculates and returns area if positive, return error message if negative
    public static String areaOfCircle(double r){
        if(r<0){
            return("Radius cannot be negative.");
        }
        else{
            return "Area = " + Math.PI*(r*r);}
        
    }

    //checks if values are positive or negative
    //calculates and returns area if positive, return error message if negative
    public static String areaOfRectangle(double len, double w){
        if(len<0 || w<0){
            return("Length or width cannot be negative.");
        }
        else{
            return "Area = " + len*w;
        }
    }

    //checks if values are positive or negative
    //calculates and returns area if positive, return error message if negative
    public static String areaOfTriangle(double len, double h){
        if(len<0 || h<0){
            return("Length of base or height cannot be negative.");
        }
        else{
            return "Area = "+len*h*0.5;
        }
        
    }

    
}