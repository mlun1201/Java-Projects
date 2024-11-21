public class FallingDistance
{
    //calculates and returns fall distance
    //takes falling time in seconds as argument
    public static double fallingDistance(int sec){
        return (0.5)*9.8*(sec*sec);
    }

    public static void main(String[] args){
        //passes through values 1-10 as arguments
        for(int i=1;i<=10;i++){
            //prints return value
            System.out.println(i + "     " + fallingDistance(i));
        }
    }
}