public class RunTimePolmorphism {

    public void run()
    {
        System.out.println("class 1");
    }
}
class Second extends RunTimePolmorphism{
    public void run()
    {
        System.out.println("class 2");
    }
    public void run2()
    {
        System.out.println("class 2 second");
    }

}
//Interface AS{
//
//        }
class Doingg{
    public static void main(String[] args) {
        RunTimePolmorphism runTimePolmorphism=new Second();
        runTimePolmorphism.run();;

    }
}

