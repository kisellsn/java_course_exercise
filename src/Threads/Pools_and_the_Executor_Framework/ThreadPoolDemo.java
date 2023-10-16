package Threads.Pools_and_the_Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);

        Runnable processor2 = new MessageProcessor(32);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(23);
        executor.execute(processor3);

        executor.shutdown();

        while (!executor.isTerminated()){
            //wait
        }// or
//        try {
//            executor.awaitTermination(10, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        System.out.println("Submitted all tasks");
    }
}
