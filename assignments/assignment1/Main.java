public class Main{

    public static void main(String[] args) {

        Grade gradeObject=new Grade();
        int[] grades={29,37,38,41,84,67};
        int[] insufficientGrades= gradeObject.getInsufficientGrades(grades);
        System.out.print("The insufficient grades are: ");
        for(int grade:insufficientGrades){
            System.out.print(grade+" ");
        }
        System.out.print("\n");
        System.out.print("The average sum is: " + gradeObject.calculateAverageValue(grades));


    }



}