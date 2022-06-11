import java.util.ArrayList;
import java.util.List;

public class RungaCuttaAlgorithm {

    private final double h = 0.05;
    private final double y_0 = 0;
    private final int a;
    private final int b;

    public RungaCuttaAlgorithm() {
        a = (int) y_0;
        b = (int) (y_0 + 2);
    }

    /**
     * enter your formula
     */
    private static double formula(double x, double y) {
        return ((3 * x) + y)*(x-Math.pow(y,2));
    }

    /**
     * algorithm
     * returns specific List<RungaCuttaAlgorithmValues>
     */
    public List<RungaCuttaAlgorithmValues> algorithm() {
        List<RungaCuttaAlgorithmValues> result = new ArrayList<>();
        double y_i = y_0;
        double f_xy;
        double k1, k2, k3, k4;
        double x = a;
        while (x < b + h / 2) {
            f_xy = formula(x, y_i);
            k1 = f_xy;
            k2 = formula(x + h / 2, y_i + h / 2 * k1);
            k3 = formula(x + h / 2, y_i + h / 2 * k2);
            k4 = formula(x + h, y_i + h * k1);
            result.add(new RungaCuttaAlgorithmValues(x, y_i, f_xy, k1, k2, k3, k4));

            y_i += (h / 6) * (k1 + 2 * k2 + 2 * k3 + k4);
            x += h;
        }
        return result;
    }


}
