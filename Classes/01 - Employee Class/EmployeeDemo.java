public class EmployeeDemo {
   public static void main(String[] args) {
      //create employees and assign data using constructor
      Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
      Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
      //print out using accessor methods
      System.out.println("Name" + "               " + "ID Number" + "    " + "Department" + "     " + "Position");
      System.out.println("_________________________________________________________________");
      System.out.println(susan.getName() + "       " + susan.getIdNumber() + "        " + susan.getDepartment() + "     " + susan.getPosition());
      System.out.println(mark.getName() + "         " + mark.getIdNumber() + "        " + mark.getDepartment() + "             " + mark.getPosition());
      System.out.println(joy.getName() + "         " + joy.getIdNumber() + "        " + joy.getDepartment() + "  " + joy.getPosition());
   }
}