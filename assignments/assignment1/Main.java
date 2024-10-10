import java.sql.Array;

public class Main{

    public static void main(String[] args) {

        Grade gradeObject=new Grade();
        int[] grades={29,37,38,41,84,67};
        System.out.println("Ex 1");
        System.out.print("The insufficient grades are: ");
        for(int grade:gradeObject.getInsufficientGrades(grades)){
            System.out.print(grade+" ");
        }
        System.out.print("\n");
        System.out.print("The average sum is: " + gradeObject.calculateAverageValue(grades)+"\n");
        System.out.print("The notes after rounding are: ");
        for(int grade: gradeObject.roundGrades(grades)){
            System.out.print(grade+" ");
        }
        System.out.print("\n");
        System.out.print("The greatest grade after rounding is: " + gradeObject.greatestRoundedGrade(grades));

        System.out.print("\n"+ "\n"+"Ex2");
        int[] numbers={17,4,3,8,10};
        ArrayEx1 arrayObject=new ArrayEx1(numbers);
        System.out.print("The greatest value in the array is: "+arrayObject.maxValue()+"\n");
        System.out.print("The smallest value in the array is: "+arrayObject.minValue()+"\n");
        System.out.print("The max sum of n-1 numbers is: "+arrayObject.maxSum()+"\n");
        System.out.print("The min sum of n-1 numbers is: "+arrayObject.minSum()+"\n");



    }



}