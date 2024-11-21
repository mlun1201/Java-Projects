public class ArrayOperations2D
{
    //int array
    private int[][] array;

    //methods static so constructor unneeded
    //calculate and return total adding up every integer in array
    public static int getTotal(int[][] x){
        int total = 0;
        for(int row=0;row<x.length;row++){
            for(int col=0;col<x[row].length;col++){
                total += x[row][col]; 
            }
        }
        return total;
    }

    //calculate and return average, divide by total number of integers
    public static double getAverage(int[][] x){
        double count = 0.0;
        for(int row=0;row<x.length;row++){
            for(int col=0;col<x[row].length;col++){
                count++;
            }
        }
        return getTotal(x)/count;
    }

    //calculate and return total of a specific row
    public static int getRowTotal(int[][] x, int a){
        int total=0;
        for(int i=0;i<x[a].length;i++){
            total += x[a][i];
        }
        return total;
    }

    //calculate and return total of a specific column
    public static int getColumnTotal(int[][] x, int a){
        int total=0;
        for(int i=0;i<x.length;i++){
            total += x[i][a];
        }
        return total;
    }

    //determine which value is highest in a specific row
    public static int getHighestInRow(int[][] x, int a){
        int highest=x[a][0];
        for(int i=0;i<x[a].length;i++){
            if(x[a][i]>highest){
                highest = x[a][i];
            }
        }
        return highest;
    }

    //determine which value is lowest in a specific row
    public static int getLowestInRow(int[][] x, int a){
        int lowest=x[a][0];
        for(int i=0;i<x[a].length;i++){
            if(x[a][i]<lowest){
                lowest = x[a][i];
            }
        }
        return lowest;
    }
}