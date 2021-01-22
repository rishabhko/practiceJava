public class TryCatch {

    public static void main(String[] args) {
        int a=0;
        int b=10;
        try
        {
            System.out.println(b/a);
        }catch (ArithmeticException e)
        {
            System.out.println("divvide by zero");
        }

        System.out.println("after truy");
    }
}
