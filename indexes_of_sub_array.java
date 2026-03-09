import java.util.*;

public class indexes_of_sub_array {

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;
        int currentSum = 0;

        for(int end = 0; end < arr.length; end++) {

            currentSum += arr[end];

            while(currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if(currentSum == target) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        ArrayList<Integer> result = subarraySum(arr, target);

        System.out.println("Result: " + result);
    }
}