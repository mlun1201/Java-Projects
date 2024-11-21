import java.util.Scanner;

public class ConversionProgram
{
    //converts argument into kilometers and prints conversion
    public static void showKilometers(double meters){
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers.");
    }

    //converts argument into inches and prints conversion
    public static void showInches(double meters){
        double inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches.");
    }

    //converts argument into feet and prints conversion
    public static void showFeet(double meters){
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet.");
    }

    //prints menu
    public static void menu(){
        System.out.print("1. Convert to kilometers\n" + "2. Convert to inches\n" +
                            "3. Convert to feet\n" + "4. Quit the program\n\n" + "Enter your choice: ");
    }
    public static void main(String[] args){
        //create scanner object for input
        Scanner input = new Scanner(System.in);
        //get distance in meters
        System.out.print("Enter distance (meters): ");
        double meters = input.nextDouble();
        //distance must not be negative
        if(meters<0){
            System.out.println("Invalid value! Must be positive.");
        }
        //loops menu until user quits
        //takes user choice and calls corresponding method
        while(meters>0){
            menu();
            int choice = input.nextInt();
            if(choice==1){
                showKilometers(meters);
            }
            else if(choice==2){
                showInches(meters);
            }
            else if(choice==3){
                showFeet(meters);
            }
            else if(choice==4){
                System.out.println("Bye!");
                meters=-1;
            }
            else{
                System.out.println("Invalid option!");
            }
            System.out.println();
        }
    }
}