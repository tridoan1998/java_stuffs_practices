class Helper implements Runnable {
    public void run() {
        try {
            System.out.println("thread2 going to sleep for 5000");
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Thread2 interrupted");
        }
    }
}

public class Test implements Runnable {
    public void run() {

    }

    public static void main(String[] args) {
        Test obj = new Test();
        Helper obj2 = new Helper();

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

    }
}
