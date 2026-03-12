import java.util.Scanner;
class Solution{
    public int[] concate(int [] arr){
        int n = arr.length;
        int ans[]= new int [ n* 2];
        for(int i=0;i< n; i++){
            ans[i]=arr[i];
            ans[i + n]= arr[i];
        }
        return ans;
    }
}   
public class Concatenation_of_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj = new Solution();
        int[] result = obj.concate(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
