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


    public int[] roundGrades(int[] grades){
        ArrayList<Integer> roundedGradesList = new ArrayList<>();
        Arrays.sort(grades);
        for(int grade:grades){
            if(grade>=38){
                int nextMultipleOf5=((grade/5)+1)*5;
                if(nextMultipleOf5-grade<3){
                    roundedGradesList.add(nextMultipleOf5);
                }else{
                    roundedGradesList.add(grade);
                }
            }else{
                roundedGradesList.add(grade);
            }

        }
        int[] roundedGrades= new int[roundedGradesList.size()];
        for(int i=0;i<roundedGradesList.size();i++){
            roundedGrades[i]=roundedGradesList.get(i);
        }
        return roundedGrades;

    }

    public int greatestRoundedGrade(int[] grades){
        int[] roundedGrades=roundGrades(grades);
        Arrays.sort(roundedGrades);
        return roundedGrades[roundedGrades.length-1];
    }





}

