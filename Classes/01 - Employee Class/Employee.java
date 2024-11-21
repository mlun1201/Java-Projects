public class Employee {
   
    //employee info
    private String name;
    private int idNumber;
    private String department;
    private String position;

    //constructor, accepts arguments and assign corresponding values for all fields
    public Employee(String n, int id, String d, String p){
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }
    
    //constructor, only take arguments for name and idNumber
    public Employee(String n, int id){
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    //no-arg constructor
    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }

    //mutator and accessor methods
    public void setName(String n){
        name = n;
    }
    
    public void setIdNumber(int id){
        idNumber = id;
    }

    public void setDepartment(String d){
        department = d;
    }

    public void setPosition(String p){
        position = p;
    }

    public String getName(){
        return name;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public String getDepartment(){
        return department;
    }

    public String getPosition(){
        return position;
    }
}