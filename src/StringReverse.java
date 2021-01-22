import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class StringReverse  {

    public static void main(String[] args) {


//    Integer.M
    }

    public static void sortBinaryArray(int[] arr){
        /* Your class should be named SortBinaryArray.
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Update in the given array itself. Don't return or print anything.
         * Taking input and printing output is handled automatically.
         */

        int firstIndex=0;
        int lastIndex=arr.length-1;
        for (int i=0;i<=lastIndex;i++)
        {
            if(arr[i]==1)
            {
                int temp=arr[lastIndex];
                arr[lastIndex]=arr[i];
                arr[i]=temp;
                lastIndex--;
                i--;
            }

        }

    }






    }
