/**
 * Created by huangchaoguang on 2019/1/5.
 */
public class AutoboxingTest {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 1;
        System.out.println("i1==i2: " + (i1 == i2));

        Integer num1 = 1;
        int num2 = 1;
        System.out.println("num1==num2: " + (num1 == num2));

        Integer value1 = 1;
        Integer value2 = 1;
        System.out.println("value1==value2: " + (value1 == value2));

        Integer obj1 = new Integer(1);
        Integer obj2 = new Integer(1);
        System.out.println("obj1==obj2: " + (obj1 == obj2));
    }


}

/**
 * 运行结果：
 * i1==i2: true
 * num1==num2: true
 * value1==value2: true
 * obj1==obj2: false
 * <p>
 * 分析：
 * 自动装箱：
 * 调用的是Integer.valueOf() 方法；
 * <p>
 * 而自动拆箱：
 * 调用的是Integer.intValue();
 */
