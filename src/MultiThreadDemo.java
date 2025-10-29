public class MultiThreadDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new NumberPrinter("Thread-" + i));
            t.start();
        }
    }
}

class NumberPrinter implements Runnable {
    private String threadName;

    public NumberPrinter(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(threadName + " is printing number: " + i + " from the list");
                Thread.sleep(1000); // pause 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
    }
}
