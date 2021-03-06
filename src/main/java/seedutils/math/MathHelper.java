package main.java.seedutils.math;

import java.math.BigDecimal;

public class MathHelper {
    public static BigDecimal gcd(BigDecimal a, BigDecimal b) {
        if (a.compareTo(BigDecimal.ZERO) == 0)
            return b;
        if (b.compareTo(BigDecimal.ZERO) == 0)
            return a;
        if (a.compareTo(b) == 0)
            return a;
        if (a.compareTo(b) > 0)
            return gcd(a.remainder(b), b);
        return gcd(a,  b.remainder(a));
    }

    public static double gcd(double a, double b) {
        while(b != 0) {
            a %= b;
            double temp = a;
            a = b;
            b = temp;
        }

        return a;
    }

}
