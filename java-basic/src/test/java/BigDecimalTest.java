import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigDecimalTest {


    public static void main(String[] args) {

        double d = 17.119d;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
        BigDecimal bigDecimal2 = new BigDecimal(d);

        BigInteger bigInteger = new BigInteger("12121212122112");
        System.out.println(bigInteger.bitCount());
        System.out.println(bigInteger.bitLength());
        long x = bigDecimal2.multiply(new BigDecimal(100)).longValue();
        System.out.println(x);
        System.out.println(bigDecimal2.multiply(new BigDecimal(100)).setScale(5, RoundingMode.HALF_UP).longValue());

        System.out.println(x);
        System.out.println(bigDecimal2.multiply(new BigDecimal(100)).setScale(5, RoundingMode.HALF_UP).longValue());
    }
}
