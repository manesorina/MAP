import java.util.Arrays;
public class ArrayEx1 {

    int[] numbers;


    public ArrayEx1(int[] numbers){
        this.numbers=numbers;
    }

    public int maxValue(){
        int max=0;
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            i++;
        }
        return max;

    }

    public int minValue(){
        int min=numbers[0];
        for(int i=0;i<numbers.length-1;i++){

            if(numbers[i]<min){
                min=numbers[i];
            }

        }
        return min;
    }

    public int maxSum(){
        int sum=0;
        for(int i=0;i<=numbers.length-1;i++){
            sum+=numbers[i];
        }

        return sum-minValue();
    }

    //public int minSum(){
    //    return maxSum()+minValue()-maxValue();
    //}

    public int minSum(){
        int sum=0;
        for(int i=0;i<=numbers.length-1;i++){
            sum+=numbers[i];
        }

        return sum-maxValue();
    }


}
