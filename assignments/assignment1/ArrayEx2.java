import java.util.ArrayList;

public class ArrayEx2 {
    int[] arr1;
    int[] arr2;

    public ArrayEx2(int[] arr1, int[] arr2){
        this.arr1=arr1;
        this.arr2=arr2;
    }

    public int[] calculateSum(int[] arr1, int[] arr2){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int[] sumArray=new int[arr1.length];
        int k=sumArray.length-1;

        int carry=0;

        while(i>=0){
            int sum = arr1[i] + arr2[j] + carry;
            if (sum >= 10) {
                    carry = sum / 10;
                    sum = sum % 10;
                } else {
                    carry = 0;
                }

                sumArray[k]=sum;
                i--;
                j--;
                k--;
            }

        if (carry>0){
            sumArray[0]=carry;
        }


        return sumArray;


    }

    public int[] calculateDifference(int[] arr1, int[] arr2) {
        int[] diffArray = new int[arr1.length];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diffArray.length - 1;


        while (i >= 0) {
            if (arr1[i] < arr2[j]) {

                if (i > 0) {
                    arr1[i - 1]--;
                    arr1[i] += 10;
                }
            }
            diffArray[k] = arr1[i] - arr2[j] ;
            k = k - 1;
            i = i - 1;
            j = j - 1;
        }

        return diffArray;
    }

    public int[] multiply(int[]arr1, int nr) {
        int[] multiplyArr=new int[arr1.length];
        int i=arr1.length-1;
        int k=multiplyArr.length-1;
        int carry=0;
        while(i>=0){
            int prod=arr1[i]*nr+carry;
            if(prod>10){
                carry=prod/10;
                prod=prod%10;
            }else{
                carry=0;
            }
            multiplyArr[k]=prod;
            i--;
            k--;

        }
        if(carry>0){
            multiplyArr[0]+=carry;
        }
        return multiplyArr;
    }

    public int[] divide(int[] arr1, int divisor) {
        if (divisor <= 0 ) {
            throw new IllegalArgumentException("Divisor must be greater than 0");
        }

        int[] quotient = new int[arr1.length];
        int rest = 0;

        for (int i = 0; i < arr1.length; i++) {
            int current = rest * 10 + arr1[i];
            quotient[i] = current / divisor;
            rest = current % divisor;
        }

        int startIndex = 0;
        while (startIndex < quotient.length - 1 && quotient[startIndex] == 0) {
            startIndex++;
        }

        int[] result = new int[quotient.length - startIndex];
        System.arraycopy(quotient, startIndex, result, 0, result.length);
        return result;
    }




}
