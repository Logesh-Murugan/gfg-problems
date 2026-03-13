import java.util.Scanner;

public class Valid_Anagram {
    public boolean checkanagram(String s,String t){

        if(s.length() != t.length()){
            return false;
        }
        int [] count = new int [26];

        for(int i=0 ;i< s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i)- 'a']--;
        }

        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        Valid_Anagram obj = new Valid_Anagram();

        boolean result = obj.checkanagram(s, t);

        System.out.println(result);
    }
    
}
