import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookDemo
{
   public static void main(String args[])
   {
      //take user input
      Scanner input = new Scanner(System.in);
      //arraylist that stores PhoneBookEntry objects
      ArrayList<PhoneBookEntry> phonebook = new ArrayList<>();
      //loops and asks for names and phone numbers then adds to phonebook
      for(int i=0;i<5;i++){
         System.out.print("Enter name: ");
         String name = input.nextLine();
         System.out.print("Enter phone number: ");
         String num = input.nextLine();
         PhoneBookEntry number_i = new PhoneBookEntry(name, num);
         phonebook.add(number_i);
      }
      //prints out names and numbers
      System.out.println("Name" + "           " + "\t Phone #");
      System.out.println("_________________________ ");
      for(int i=0;i<5;i++){
         System.out.println(phonebook.get(i).getName() + "\t" + phonebook.get(i).getPhoneNum());
      }
   }
}