import java.util.HashMap;
import java.util.function.Function;
public class ChebyshevQuadrature {
    public static final HashMap<Integer, Double> T2 = new HashMap<>(){{
        put(1, -0.577350);
        put(2, 0.577350);
    }};
    public static final HashMap<Integer, Double> T3 = new HashMap<>(){{
        put(1, -0.707107);
        put(2, 0d);
        put(3, 0.707107);
    }};
    public static final HashMap<Integer, Double> T4 = new HashMap<>(){{
        put(1, -0.794654);
        put(2, -0.187592);
        put(3, 0.187592);
        put(4, 0.794654);
    }};
    public static final HashMap<Integer, Double> T5 = new HashMap<>(){{
        put(1, -0.832498);
        put(2, -0.374541);
        put(3, 0d);
        put(4, 0.374541);
        put(5, 0.832498);
    }};
    public static final HashMap<Integer, Double> T6 = new HashMap<>(){{
        put(1, -0.866247);
        put(2, -0.422519);
        put(3, -0.266635);
        put(4, 0.266635);
        put(5, 0.422519);
        put(6, 0.866247);
    }};
    public static final HashMap<Integer, Double> T7 = new HashMap<>(){{
        put(1, -0.883862);
        put(2, -0.529657);
        put(3, -0.323912);
        put(4, 0d);
        put(5, 0.323912);
        put(6, 0.529657);
        put(7, 0.883862);
    }};
    public static final HashMap<Integer, Double> T9 = new HashMap<>(){{
        put(1, -0.911589);
        put(2, -0.601019);
        put(3, -0.528762);
        put(4, -0.167906);
        put(5, 0d);
        put(6, 0.167906);
        put(7, 0.528762);
        put(8, 0.601019);
        put(9, 0.911589);
    }};
    public static final HashMap<Integer, HashMap<Integer, Double>> TABLE = new HashMap<>(){{
        put(2, T2);
        put(3, T3);
        put(4, T4);
        put(5, T5);
        put(6, T6);
        put(7, T7);
        put(9, T9);
    }};

    public static double solve(double a, double b, int n, Function<Double, Double> function) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double x = (b+a)/2 + ((b-a)/2) * TABLE.get(n).get(i+1);
            double fx = function.apply(x);
            sum += fx;
        }
        return sum * (b-a)/n;
    }
}
