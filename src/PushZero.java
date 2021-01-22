import java.util.*;
import java.util.regex.Pattern;

public class PushZero {
    public static void main(String[] args) {
        int[] scores={100 ,100 ,50 ,40 ,40 ,20 ,10};
        int [] alice={5 ,25 ,50 ,120};
        int[] ans=climbingLeaderboard(scores,alice);


    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] ans= new int[alice.length];
        for (int i=0;i<alice.length;i++)
        {
            int pos=1;
            for(int j=0;j<scores.length;j++)
            {
                if(j<scores.length-1 && scores[j]==scores[j+1])
                {
                    continue;
                }
                if (alice[i]<scores[j])
                {
                    pos++;
                    continue;
                }
                if(alice[i]>scores[j])
                {
                    ans[i]=pos;
                }
            }
            if (ans[i]==0)
            {
                ans[i]=pos;
            }
        }
        return ans;



    }
}