import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task extends Thread {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String ques="0010100101";
        int startIndex=0;
        int endIndex=0;
        ArrayList<String> ans=new ArrayList<>();


        for (int i=0; i<ques.length()-1;i++){
            if (ques.charAt(i)=='1')
            {
                startIndex=i;
            for (int j=i+1;j<ques.length();j++)
            {
                if (ques.charAt(j)=='1')
                {
                   ans= add(startIndex,j,ans,ques);
                   break;
                }
            }

            }
    }

        for (String temp:ans
        ) {
            System.out.println(temp);

        }}

    public static ArrayList<String> add(int startIndex, int endIndex, ArrayList<String> ans, String ques )
    {
        String tempAns="";
        for (int i=startIndex;i<=endIndex;i++)
        {
            tempAns=tempAns+ques.charAt(i);
        }
        ans.add(tempAns);
        return ans;

    }







}