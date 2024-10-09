import java.util.ArrayList;
import java.util.Arrays;
public class Grade {

    public int[] getInsufficientGrades(int[] grades){
        ArrayList<Integer> insufficientGradesList= new ArrayList<>();
        Arrays.sort(grades);

        for(int grade : grades){
            if(grade<40){
                insufficientGradesList.add(grade);
            }else{
                break;
            }
        }
        int[] insufficientGrades= new int[insufficientGradesList.size()];
        for(int i=0;i<insufficientGradesList.size();i++){
            insufficientGrades[i]=insufficientGradesList.get(i);
        }

        return insufficientGrades;

    }

    public String calculateAverageValue(int[] grades){
        int sum=0;

        for(int grade:grades){
            sum+=grade;
        }

        int numberOfNotes=grades.length;
        double averageV=(double) sum/numberOfNotes;
        return String.format("%.2f",averageV);

    }






}

