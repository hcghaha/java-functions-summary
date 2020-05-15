import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamTest {
    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<String>();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");
        System.out.println("haha");
        ForkJoinPool forkJoinPool = new ForkJoinPool(20);
        forkJoinPool.submit(() -> {
            System.out.println("hehe");
            list.parallelStream().forEach((number) -> {
                try {
                    System.out.println("heihei"+number);
                    Thread.sleep(5);
                } catch (InterruptedException e) { }
            });
        }).join();

        System.out.println("end");
    }


}
