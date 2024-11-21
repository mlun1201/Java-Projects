public class FuelGauge
{
    private int fuel;

    public FuelGauge(int f){ 
        fuel = f;
    }

    public int getFuel(){
        return fuel;
    }

    public void addFuel(){
        fuel++;
    }

    public void useFuel(){
        fuel--;
    }
}