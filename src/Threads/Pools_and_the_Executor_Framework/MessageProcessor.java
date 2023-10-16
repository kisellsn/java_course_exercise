package Threads.Pools_and_the_Executor_Framework;

import javax.naming.Name;

public class MessageProcessor implements Runnable{
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"[RECEIVED] message "+ message);
        respondToMessage(); //make thread sleep to simulate doing som  work
        System.out.println(Thread.currentThread().getName()+"[DONE] Processing message "+ message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message "+message);
        }
    }
}
