public class EulerAlgorithmValues {

    private final double x;
    private final double y_i;
    private final double f_xy;

    public EulerAlgorithmValues(double x, double y_i, double f_xy) {

        this.x = x;
        this.y_i = y_i;
        this.f_xy = f_xy;
    }

    public double getX() {
        return x;
    }

    public double getY_i() {
        return y_i;
    }

    public double getF_xy() {
        return f_xy;
    }
}

