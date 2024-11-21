public class Odometer
{
    //field
    private int mileage;

    //constructor
    public Odometer(int m){
        mileage = m;
    }

    //return mileage
    public int getMileage(){
        return mileage;
    }

    //if mileage reaches 999,999, resets to zero
    //else, increment mileage by 1
    public void addMileage(){
        if(mileage==999999){
            mileage = 0;
        }
        else{
            mileage++;
        }
    }

    //for every 24 miles (i=multiples of 24 mod 24 = 0 remainders (therefore 24 miles have been used)), fuel goes down by 1
    public void changeFuel(FuelGauge object, int i){
        if(i%24 == 0){
            object.useFuel();
        }
    }
}