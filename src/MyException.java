import java.util.HashMap;
import java.util.Iterator;

public class MyException {


    public static void main(String[] args) {

        int[] q = {1 ,2 ,5 ,3 ,4 ,7 ,8 ,6};
        int bribe = 0;

        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0, j = 0; i < q.length; i++) {
            if (q[i] == (j + 1)) {
                j++;
                while (hashMap.containsKey(j+1)) {
                    j++;
                }

                continue;
            }
            if (q[i] > (j + 3)) {
                System.out.println("Too chaotic");
                return;
            }
            bribe = bribe + q[i] - (j + 1);
            hashMap.put(q[i], "a");


        }
        System.out.println(bribe);


        int[] arr={1,2,3,4,5};

//        arr[(arr.length-1)]==0;



}




}
