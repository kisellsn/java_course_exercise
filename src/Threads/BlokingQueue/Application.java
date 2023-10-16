package Threads.BlokingQueue;


import Threads.BlokingQueue.Consumer;
import Threads.BlokingQueue.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

    public static void main(String args[]){

        BlockingQueue<Integer> questionList = new ArrayBlockingQueue<>(5);
        Thread t1 = new Thread(new Producer(questionList));
        Thread t2 = new Thread(new Consumer(questionList));

        t1.start();
        t2.start();
    }
}
