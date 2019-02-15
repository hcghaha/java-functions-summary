import java.util.concurrent.atomic.AtomicLong;

/**
 * 计算器实现1
 * Created by huangchaoguang on 2019/1/5.
 */
public class Counter {
    private final AtomicLong counter = new AtomicLong();

    public long increase(){
        return counter.incrementAndGet();
    }

    public static void main(String[] args) {
        final Counter counter1 = new Counter();
        System.out.println(counter1.increase());
        System.out.println(counter1.increase());
        System.out.println(counter1.increase());
        System.out.println(counter1.increase());

        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 1000) {
                    System.out.println("thread1:"+counter1.increase());
                    i++;
                }
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 1000) {
                    System.out.println("thread2:"+counter1.increase());
                    i++;
                }
            }
        });
        thread2.start();
    }

}
