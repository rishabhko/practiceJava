import javafx.util.Pair;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;


public class Prac implements Comparable<Integer> {

//    @
//    String name:
    public static void main(String[] args) {

        Queue<Integer> queue= new PriorityQueue<>();
        BlockingDeque<Integer> integers= new LinkedBlockingDeque<>();
        Class<?> clazz=queue.getClass();
        System.out.println(clazz.isAnnotation());
        ExecutorService service= Executors.
                newFixedThreadPool(10);
        service.submit()








    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}

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
