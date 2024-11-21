public class Rainfall
{
    //double array, holds total rainfall for 12 months
   private double[] totalRainfall;

   //constructor, accepts double array as argument
   public Rainfall(double[] t){
    totalRainfall = t;
   }

   //calculates and returns total rainfall
   public double getTotalRainFall(){
    double total = 0;
    for(int i=0;i<totalRainfall.length;i++){
        total += totalRainfall[i];
    }
    return total;
   }

   //calculates and returns average rainfall
   public double getAverageRainFall(){
    return getTotalRainFall()/12;
   }

   //determines and returns which month holds highest value
   public int getHighestMonth(){
    int highest = 0;
    for(int i=0;i<totalRainfall.length;i++){
        if(totalRainfall[i]>totalRainfall[highest]){
            highest = i;
        }
    }
    return highest;
   }

   //determines and returns which month holds lowest value
   public int getLowestMonth(){
    int lowest = 0;
    for(int i=0;i<totalRainfall.length;i++){
        if(totalRainfall[i]<totalRainfall[lowest]){
            lowest = i;
        }
    }
    return lowest;
   }

   //returns value located at i in the array
   public double getRainAt(int i){
    return totalRainfall[i];
   }
}