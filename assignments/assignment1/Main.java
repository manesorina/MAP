public class Main{

    public static void main(String[] args) {

        Grade gradeObject=new Grade();
        int[] grades={23,25,40,67,89,90,12};
        int[] insufficientGrades= gradeObject.getInsufficientGrades(grades);
        System.out.print("The insufficient grades are: ");
        for(int grade:insufficientGrades){
            System.out.print(grade+" ");
        }

    }



}