package Threads.Threads1;

public class Main {

    public static void main(String args[]){

        System.out.println("Thread 1");
        Task thr1 = new Task("A");
        thr1.start();

        System.out.println("Thread 2");
        Task thr2 = new Task("B");
        thr2.start();
    }
}

class Task extends Thread{
    String name;
    public Task(String name) {
        this.name=name;
    }

    public void run(){
        Thread.currentThread().setName(this.name);
        for (int i=0;i<10;i++){
            System.out.println(i+" - "+Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
