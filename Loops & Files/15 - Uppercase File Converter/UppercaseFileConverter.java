import java.util.Scanner;
import java.io.*;

public class UppercaseFileConverter
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      //ask user for both input and output file names
      System.out.print("Enter input file name: ");
      String fileName1 = input.nextLine();
      System.out.print("Enter output file name: ");
      String fileName2 = input.nextLine();
      //file that is going to be read
      Scanner inputFile = new Scanner(new File(fileName1));
      //file to print new lines into
      PrintWriter outputFile = new PrintWriter(fileName2);
      //loops until all lines have been read
      while(inputFile.hasNext()){
         //convert each line from input into uppercase and print into output
         String str = inputFile.nextLine();
         outputFile.println(str.toUpperCase());
      }
      //close both files
      outputFile.close();
      inputFile.close();
   }
}