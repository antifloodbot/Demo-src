import java.math.BigDecimal;
import java.math.BigInteger;

public class Third {
    public static void main(String[] args) {
        byte b = 25;
        short sh = -2457;
        int i = 45;
        long l = 6777129993989L;
        BigInteger b1 = BigInteger.valueOf(123l);
        BigDecimal bd = new BigDecimal(25.3);

        float f = 1124124F;
        double d = 12.3;
        Double e = new Double(3.2);
        i = 2;
        float y = (2*l- 3*i) - 2*f;
        double x = (2*i - 3*l) - 2.5*f;
        x = 1;
        System.out.println(1/2);
        double d2 = 1/2.0;
        System.out.println(d2);
        System.out.println(503143%2);
        double a = -5;
        double res = Math.pow(((Math.pow(x,2) + Math.pow(Math.PI,0.3))/(1 + 3*x) - a/3),1.0/3)-Math.pow(Math.E,x);
        System.out.println(res);
    }
}
