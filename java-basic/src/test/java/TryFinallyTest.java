/**
 * Created by huangchaoguang on 2019/2/15.
 */
public class TryFinallyTest {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        int a=1;
        try{
            a=2;
            return a++;
        }finally {
            a=a+3;
            return a;
        }
    }
}
