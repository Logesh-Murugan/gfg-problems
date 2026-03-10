import java.util.*;

class Solution {

    public int getSL(int[] arr) {

        int largest = -1;
        int secondlargest = -1;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }

            else if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }

        return secondlargest;
    }
}

public class SecondLargest{

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        Solution obj = new Solution();

        int result = obj.getSL(arr);

        System.out.println("Second Largest Element: " + result);
    }
}