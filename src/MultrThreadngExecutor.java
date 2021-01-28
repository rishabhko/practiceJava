import java.sql.CallableStatement;
import java.util.concurrent.*;

public class MultrThreadngExecutor {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService exService= Executors.newFixedThreadPool(10);
        ScheduledExecutorService ex= Executors.newScheduledThreadPool(5);
        exService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("By service");
            }
        });
//        exService.shutdown();
//        Thread.sleep(1);
        Future ft= exService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("by future");
            }
        });
        System.out.println(ft.isDone());

        System.out.println("my main");
        Thread.sleep(100);
        System.out.println(ft.isDone());
        Callable<String> cv=new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "yes callable";
            }
        };
//        exService.;
    int count =Runtime.getRuntime().availableProcessors();
        System.out.println(count);
        exService.shutdown();
//        ex.schedule()

    }

}
