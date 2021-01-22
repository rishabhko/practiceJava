public class GenericsPrac<T,V> {

    T data;
    V data2;

//    public GenericsPrac(T data, V data2)
//    {
//        this.data=data;
//        this.data2=data2;
//    }
    public void show()
    {
        System.out.println(data+" "+data2);
    }
}
 class Ex{
     public static void main(String[] args) {
         GenericsPrac<Integer,Integer> pa=new GenericsPrac();
         pa.data=1;
//         pa.data2="rishabh";
         pa.show();
     }

}
