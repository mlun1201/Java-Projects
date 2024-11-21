public class DriverExam
{
    //final String array containing correct answers, cannot be changed
    final private String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B",
                                            "C", "D", "A", "D", "C", "C", "B", "D", "A"};
    //String array to hold student's answers
    private String[] studentAnswers = new String[20];

    //mutator, sets answers into array
    public void setStudentAnswers(int i, String n){
        studentAnswers[i] = n;
    }

    //calculate and return total amount of correct answers
    public int totalCorrect(){
        int count = 0;
        for(int i=0;i<studentAnswers.length;i++){
            if(correctAnswers[i].equalsIgnoreCase(studentAnswers[i])){
                count++;
            }
        }
        return count;
    }

    //calculate and return total amount of incorrect answers
    public int totalIncorrect(){
        int count = 0;
        for(int i=0;i<studentAnswers.length;i++){
            if(correctAnswers[i].compareToIgnoreCase(studentAnswers[i]) != 0){
                count++;
            }
        }
        return count;
    }

    //determin and return if student passed based on amount of total correct answers
    public boolean passed(){
        if(totalCorrect()>=15){
            return true;
        }
        else{
            return false;
        }
    }

    //determine and return how many and which questions were missed
    public int[] questionsMissed(){
        int[] q = new int[20];
        int count = 0;
        for(int i=0;i<studentAnswers.length;i++){
            if(correctAnswers[i].compareToIgnoreCase(studentAnswers[i]) != 0){
                q[count] = i+1;
                count++;
            }
        }
        return q;
    }
}