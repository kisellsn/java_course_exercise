package Threads.BlokingQueue;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> questionList;


    public Consumer(BlockingQueue<Integer> questionList) {
        this.questionList = questionList;
    }


    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
                System.out.println("Answered question: "+ questionList.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
