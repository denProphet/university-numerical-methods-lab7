import java.util.ArrayList;
import java.util.List;

public class EulerAlgorithm {
    private final double h = 0.05;
    private final double y_0 = 0;
    private int a;
    private int b;

    public EulerAlgorithm() {
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
     * returns specific List<EulerAlgorithmValues>
     */
    public List<EulerAlgorithmValues> algorithm() {
        List<EulerAlgorithmValues> result = new ArrayList<>();
        double y_i = y_0;
        double f_xy;
        double x = a;
        while (x < b + h / 2) {
            f_xy = formula(x, y_i);
            result.add(new EulerAlgorithmValues(x, y_i, f_xy));
            y_i += (h * f_xy);
            x += h;
        }
        return result;
    }


}
