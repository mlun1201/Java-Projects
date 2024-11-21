public class FuelGauge
{
    //field
    private int fuel;

    //constructor
    public FuelGauge(int f){ 
        fuel = f;
    }

    //return fuel
    public int getFuel(){
        return fuel;
    }

    //increment fuel by 1
    public void addFuel(){
        fuel++;
    }

    //decrement fuel by 1
    public void useFuel(){
        fuel--;
    }
}