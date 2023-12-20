import java.util.function.Function;

public class Main {

        public static void main(String[] args) {
        // пределы интегрирования
        double a = 0;
        double b = 1;

        // функция, подынтегральное выражение
        Function<Double, Double> function = x -> Math.sin(x);

        // количество узлов для квадратурной формулы Чебышева
        int n = 7;

        // вычисление интеграла
        double integral = ChebyshevQuadrature.solve(a, b, n, function);

        System.out.println("Integral: " + integral);
    }

}