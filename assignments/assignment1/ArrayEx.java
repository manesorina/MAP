import java.util.ArrayList;
import java.util.Arrays;
public class ArrayEx {

    int[] numbers;
    int[] sortedArray;

    public ArrayEx(int[] numbers){
        this.numbers=numbers;
        this.sortedArray=Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(this.sortedArray);
    }

    public int maxValue(){
        return sortedArray[sortedArray.length-1];

    }

    public int minValue(){
        return sortedArray[0];

    }

    public int maxSum(){
        int sum=0;
        for(int i=0;i<numbers.length-1;i++){
            sum += numbers[i];
        }
        return sum;
    }
}
