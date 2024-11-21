import java.io.*;

public class PrimeNumberList
{
    //takes integer as argument
    //returns T/F for if integer is a prime number
    public static boolean isPrime(int num){
        //automatically false
        boolean b=false;
        int factors = 0;
        //check for all factors of num
        for(int i=1;i<=num;i++){
            int remainder = num % i;
            if(remainder==0){
                factors++;
            }
        }
        //isPrime is true if num has only two factors, 1 and itself
        if(factors==2){
            b=true;
        }
        return b;
    }

    public static void main(String[] args) throws IOException{
        //open file
        PrintWriter outputFile = new PrintWriter("primeNumbers.txt");
        //passes through 1-100 as arguments
        for(int i=1;i<=100;i++){
            //print prime numbers into file
            if(isPrime(i)==true){
                outputFile.println(i);
            }
        }
        //close file
        outputFile.close();
    }
}