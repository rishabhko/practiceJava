import javafx.util.Pair;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Prac {
    public static void main(String[] args) {

     List<Integer> list=new LinkedList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(1,10);
     Iterator<Integer> it=list.iterator();
     Object[] ob= new Object[5];
     ob[0]=1;
     ob[1]="rishabh";
        for (Object o:ob
             ) {
            System.out.println(o);

        }





    }}

  class Car {
    void run()
    {
        System.out.println("car is running");
    }
    void Start(){}
}
class Audi extends Car {
    void run()
    {
        System.out.println("Audi is running safely with 100km");
    }
    public static void main(String args[])
    {
        Car b= new Audi();    //upcasting
        b.run();
        b.Start();
    }
}
