//using runnable
public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Main thread is-" + Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(new RunnableDemo().new RunnableImp());
            t1.start();
        }
    }

    private class RunnableImp implements Runnable {

        public void run() {
            System.out.println(Thread.currentThread().getName() + " executiong run method!");
        }
    }
}



