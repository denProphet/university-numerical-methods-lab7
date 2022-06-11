public class RungaCuttaAlgorithmValues {

    private final double x;
    private final double y_i;
    private final double f_xy;
    private final double k1;
    private final double k2;
    private final double k3;
    private final double k4;

    public RungaCuttaAlgorithmValues(double x, double y_i, double f_xy,
                                     double k1, double k2, double k3, double k4) {
        this.x = x;
        this.y_i = y_i;
        this.f_xy = f_xy;
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
        this.k4 = k4;
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

    public double getK1() {
        return k1;
    }

    public double getK2() {
        return k2;
    }

    public double getK3() {
        return k3;
    }

    public double getK4() {
        return k4;
    }
}
