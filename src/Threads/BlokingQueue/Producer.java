package Threads.BlokingQueue;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> questionList;

    private int questionNo;

    public Producer(BlockingQueue<Integer> questionList) {
        this.questionList = questionList;
    }


    @Override
    public void run() {
        while (true){
            try {
                synchronized (this){
                    int nextQuestion = questionNo++;
                    System.out.println("Got next question: "+ nextQuestion);
                    questionList.put(nextQuestion);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
