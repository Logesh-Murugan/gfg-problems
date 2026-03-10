import java.util.Scanner;

class Score{
    public int ScoreofaString(String s){
        int score = 0;

        for(int i=1;i<s.length();i++){
            int diff =Math.abs(s.charAt(i) - s.charAt(i - 1));
            score += diff;
        }
        return score;

    }

}

public class Score_of_a_String {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Score obj = new Score();

        int result = obj.ScoreofaString(s);

        System.out.println(result);
    }

    
}
