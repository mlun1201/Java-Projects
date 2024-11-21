public class Geometry
{
    public static String areaOfCircle(double r){
        if(r<0){
            return("Radius cannot be negative.");
        }
        else{
            return "Area = " + Math.PI*(r*r);}
        
    }

    public static String areaOfRectangle(double len, double w){
        if(len<0 || w<0){
            return("Length or width cannot be negative.");
        }
        else{
            return "Area = " + len*w;
        }
    }

    public static String areaOfTriangle(double len, double h){
        if(len<0 || h<0){
            return("Length of base or height cannot be negative.");
        }
        else{
            return "Area = "+len*h*0.5;
        }
        
    }

    
}