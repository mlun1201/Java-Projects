public class CelsiusTemperatureTable
{
    //calculates and returns conversion of fahrenheit to celsius
    //takes fahrenheit as argument
    public static double celsius (int f){
        return (5.0/9)*(f - 32);
    }

    public static void main(String[] args){
        //print out table visual
        System.out.println("Fahrenheit" + "        "+ "Celsius");
        System.out.println("----------" + "        " + "----------");
        //passes through 0-20 as arguments
        //prints fahrenheit and celsius
        for(int i=0;i<=20;i++){
            System.out.println(i + "                 " + celsius(i));
        }
    }
}