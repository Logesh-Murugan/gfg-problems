import java.util.Scanner;
import java.util.HashSet;
class Contains_duplicate{
    public boolean duplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
        }
        return false;
    }
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []nums = new int [n];

    for(int i=0 ; i<n ; i++){
        nums[i]= sc.nextInt();
    }

    Contains_duplicate obj = new Contains_duplicate();

    boolean result = obj.duplicate(nums);

    System.out.println(result);

    
    

}
}
