//package samples.threads;

public class TestRaceCondition {
    public static void main(String[] args) throws Exception {
        Operator operator = new Operator();
        Operator operator2 = new Operator();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    operator.inc();
                    operator2.dec();
                }
            }
        }, "plus");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    operator.dec();
                    
                }
            }
        }, "minus");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    operator.print();
                   operator2.print();
                }

            }
        }, "printer");

        t1.start();
        t2.start();
        t3.start();

    }

    static class Operator {
        int[] number = { 0 };

        public void inc() {
            synchronized (this) {
                number[0]++;
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
                number[0]--;
            }
            // try {
            //     if (number[0] == 0) {
            //         number[0]++;
            //         System.out.println(Thread.currentThread().getName() + " : plus");
            //         Thread.sleep(1000);
            //         notifyAll();
            //     } else {
            //         System.out.println(Thread.currentThread().getName() + " : waiting");
            //         wait();
            //     }
            // } catch (Exception e) {
            // }

        }

        public synchronized void dec() {
            number[0]++;
            try {
                Thread.sleep(100);    
            } catch (Exception e) {
             
            }
            
            number[0]--;
            // try {
            //     if (number[0] != 0) {
            //         number[0]--;
            //         System.out.println(Thread.currentThread().getName() + " : minus");
            //         Thread.sleep(1000);
            //         notifyAll();
            //     } else {
            //         System.out.println(Thread.currentThread().getName() + " : waiting");
            //         wait();
            //     }
            // } catch (Exception e) {
            // }
        }

        public synchronized void print() {
            try {
                System.out.println(number[0]);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}