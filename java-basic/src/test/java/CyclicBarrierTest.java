import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        final CyclicBarrier barrier = new CyclicBarrier(5);
        for (int i=0; i<4; i++){
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
//                    try {
////                        barrier.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (BrokenBarrierException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println("子线程end");
                }
            }).start();
        }
        barrier.await();

        System.out.println("主线程end");



    }


}
