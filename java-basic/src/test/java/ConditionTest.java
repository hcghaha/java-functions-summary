import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * 条件变量测试
 * Created by huangchaoguang on 2019/2/14.
 */
public class ConditionTest {


    public static void main(String[] args) {
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(1);


        ReentrantLock lock = new ReentrantLock();
        lock.lock();


    }
}
