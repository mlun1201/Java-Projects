public class FreezeBoil {

    //temp info
   private int temperature;

   //constructor, accepts argument for temperature
   public FreezeBoil(int t){
    temperature = t;
   }

   //mutator and accessor methods
   public void setTemperature(int t){
    temperature = t;
   }

   public double getTemperature(){
    return temperature;
   }

   //check if boiling/freezing, return true or false
   public boolean isEthylFreezing(){
    if(temperature<=-173){
        return true;
    }
    else{
        return false;
    }
   }

   public boolean isEthylBoiling(){
    if(temperature>=172){
        return true;
    }
    else{
        return false;
    }
   }

   public boolean isOxygenFreezing(){
    if(temperature<=-362){
        return true;
    }
    else{
        return false;
    }
   }

   public boolean isOxygenBoiling(){
    if(temperature>=-306){
        return true;
    }
    else{
        return false;
    }
   }

   public boolean isWaterFreezing(){
    if(temperature<=32){
        return true;
    }
    else{
        return false;
    }
   }

   public boolean isWaterBoiling(){
    if(temperature>=212){
        return true;
    }
    else{
        return false;
    }
   }
}