package threads;

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {0};

        Thread a = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increase(arr);
                }
            }

        };

        Thread b = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    dicrease(arr);
                }
            }

        };
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(arr[0]);
    }

    public static synchronized void increase(int[] a) {
        a[0]++;
    }

    public static synchronized void dicrease(int[] b) {
        b[0]--;
    }
}
