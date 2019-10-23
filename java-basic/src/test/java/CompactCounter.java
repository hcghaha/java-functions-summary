import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * 计算器实现2
 * Created by huangchaoguang on 2019/1/5.
 */
public class CompactCounter {

    private volatile long counter;

    private static final AtomicLongFieldUpdater<CompactCounter> updater = AtomicLongFieldUpdater.newUpdater(CompactCounter.class, "counter");

    public long increase() {
        return updater.incrementAndGet(this);
    }


    public static void main(String[] args) {
        boolean b = false;
        boolean a = true;


        final CompactCounter counter1 = new CompactCounter();
        System.out.println(counter1.increase());
        System.out.println(counter1.increase());
        System.out.println(counter1.increase());
        System.out.println(counter1.increase());

//        CompactCounter counter2 = new CompactCounter();
//        System.out.println(counter2.increase());
//        System.out.println(counter2.increase());
//        System.out.println(counter2.increase());
//        System.out.println(counter2.increase());

        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 100) {
                    System.out.println("thread1:"+counter1.increase());
                    i++;
                }
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 100) {
                    System.out.println("thread2:"+counter1.increase());
                    i++;
                }
            }
        });
        thread2.start();
    }

}
