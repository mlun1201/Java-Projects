public class PhoneBookEntry
{
    //fields
    private String name;
    private String phoneNum;

    //constructor
    public PhoneBookEntry(String n, String p){
        name = n;
        phoneNum = p;
    }

    //mutator and accessor methods
    public void setName(String n){
        name = n;
    }

    public void setPhoneNum(String p){
        phoneNum = p;
    }

    public String getName(){
        return name;
    }

    public String getPhoneNum(){
        return phoneNum;
    }
}