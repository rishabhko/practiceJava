public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={2,4,5,7,1,0};
        int sorted[]=sort(arr);
        for (int num:sorted) {
            System.out.println(num);

        }

    }

    public static int[] sort(int arr[])
    {
        for (int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0&& key<arr[j])
            {
                int temp=arr[j];
                arr[j]=key;
                arr[j+1]=temp;
                j--;

            }

        }
        return arr;
    }
}
