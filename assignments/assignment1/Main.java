import java.sql.Array;

public class Main{

    public static void main(String[] args) {

        Grade gradeObject=new Grade();
        int[] grades={29,37,38,41,84,67};
        System.out.println("Ex 1");
        System.out.print("The insufficient grades are: ");

        for(int grade:gradeObject.getInsufficientGrades(gradeObject.roundGrades(grades))){
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





        System.out.print("\n"+ "\n"+"Ex2"+"\n");
        int[] numbers={17,4,3,8,10};
        ArrayEx1 arrayObject=new ArrayEx1(numbers);
        System.out.print("The greatest value in the array is: "+arrayObject.maxValue()+"\n");
        System.out.print("The smallest value in the array is: "+arrayObject.minValue()+"\n");
        System.out.print("The max sum of n-1 numbers is: "+arrayObject.maxSum()+"\n");
        System.out.print("The min sum of n-1 numbers is: "+arrayObject.minSum()+"\n"+"\n");

        System.out.print("Ex3"+"\n");
        int[] arr1={1,3,0,0,0,0,0,0,0};
        int[] arr2={8,7,0,0,0,0,0,0,0};


        ArrayEx2 arrayEx2=new ArrayEx2(arr1,arr2);
        System.out.print("The sum is: "+"\n");
        for (int num:arrayEx2.calculateSum(arr1,arr2)){
            System.out.print(num+ " ");
        }

        System.out.print("\n"+"The difference is: "+"\n");

        int[] arr3={8,3,0, 0, 0, 0, 0, 0, 0};
        int[] arr4={5,4, 1, 0, 0, 0, 0, 0, 0};
        for(int num:arrayEx2.calculateDifference(arr3,arr4)){
            System.out.print(num+" ");
        }

        System.out.print("\n"+"The product is: "+"\n");
        int[] arr5={2,3,6,0,0,0,0,0,0};
        for(int num:arrayEx2.multiply(arr5,1)){
            System.out.print(num+" ");
        }

        System.out.print("\n"+"The dvision is: "+"\n");
        int[] arr6={2,3,6,0,0,0,0,0,0};
        for(int num:arrayEx2.divide(arr6,2)) {
            System.out.print(num+" ");
        }


        System.out.print("\n"+"\n"+"Ex 4"+"\n");
        int[] keyboards={20,15,25,35};
        int[] usbDrives={20,15,40,15};

        int[] keyboards2={60};
        int[] usbDrives2={8,12};
        ElektronikShop ekShop=new ElektronikShop(keyboards, usbDrives);
        System.out.print("Cheapest keyboard is: "+ekShop.cheapestKeyboard(keyboards)+"\n");
        System.out.print("Most expensive device: "+ekShop.mostExpensive(keyboards,usbDrives)+"\n");
        System.out.println("Most expensive usb that Markus affords is: "+ekShop.expensiveInBudget(usbDrives,20));
        System.out.println("The most expensive keyboard+usbDrive package that Markus affords is: "+ekShop.totalMaxSpent(keyboards2,usbDrives2,60));
    }



}