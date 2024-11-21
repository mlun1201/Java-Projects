public class Payroll
{
    //int array containing employee ids
    private int[] employeeID = {5658845, 4520125, 7895122, 8777541,
                              8451277, 1302850, 7580489};
    //int array to hold employee hours
    private int[] hours = new int[7];
    //double array to hold employee pay rates
    private double[] payRate = new double[7];
    //double array to hold employee wages
    private double[] wages = new double[7];

    //mutator and accessor methods
    public void setEmpoloyeeID(int i, int id){
        employeeID[i] = id;
    }

    public void setHours(int i, int h){
        hours[i] = h;
    }

    public void setPayRate(int i, double r){
        payRate[i] = r;
    }

    public void setWages(int i, double w){
        wages[i] = w;
    }

    public int[] getEmployeeID(){
        return employeeID;
    }

    public int[] getHours(){
        return hours;
    }

    public double[] getPayRate(){
        return payRate;
    }

    public double[] getWages(){
        return wages;
    }

    //calculate and return gross pay of employees depending on their hours and payrate
    public double grossPay(int id){
        int j = 0;
        for(int i=0;i<employeeID.length;i++){
            if(id==employeeID[i]){
                j = i;
            }
        }
        return hours[j]*payRate[j];
    }
}