import java.util.HashMap;

public class HashMapsPrac {

    public static String uniqueChar(String str){
        // Write your code here

        HashMap<Character, Integer> map= new java.util.HashMap<>();
        String result="";
        for (int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                continue;
            }
            else
            {
                map.put(str.charAt(i),1);
                result=result+ str.charAt(i);

            }
            int[] input={1,23,4,5,55,3};

            if((Math.abs(input[i])-Math.abs(input[0]))==7 || (input[i]-input[0])==9)
            {}
        }
        return result;

    }
}
