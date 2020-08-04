//package samples.threads;

public class TestThread {
    public static void main(String[] args) {

        String currentThread = Thread.currentThread().getName();
        System.out.println("Current thread is :" + currentThread);

        Thread t = new MyThread("MyThread");


        Thread t2 = new Thread(new MyThread2(), "MyTHread2");
        t2.start();
        t.start();
        

        System.out.println("Exit");
        //System.exit(0);
    }

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(6000);
            } catch (Exception e) {}
            String currentThread = Thread.currentThread().getName();
            System.out.println("Current thread is :" + currentThread);
            
        }
    }

    static class MyThread2 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
            String currentThread = Thread.currentThread().getName();
            System.out.println("Current thread is :" + currentThread);
            
        }
    }
}