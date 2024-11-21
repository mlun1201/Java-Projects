public class Odometer
{
    private int mileage;

    public Odometer(int m){
        mileage = m;
    }

    public int getMileage(){
        return mileage;
    }

    public void addMileage(){
        if(mileage==999999){
            mileage = 0;
        }
        else{
            mileage++;
        }
    }

    public void changeFuel(FuelGauge object, int i){
        if(i%24 == 0){
            object.useFuel();
        }
    }
}