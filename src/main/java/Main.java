import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================Euler algorithm==================");

        EulerAlgorithm eulerAlgorithm = new EulerAlgorithm();
        List<EulerAlgorithmValues> eulerAlgorithmValues = eulerAlgorithm.algorithm();
        for (EulerAlgorithmValues e : eulerAlgorithmValues) {
            System.out.printf("X = %.3f", e.getX());
            System.out.printf("\tY = %.3f", e.getY_i());
            System.out.printf("\tF(x, y) = %.3f\n", e.getF_xy());
        }

        System.out.println("==================Runga-Cutta algorithm==================");

        RungaCuttaAlgorithm rungaCuttaAlgorithm = new RungaCuttaAlgorithm();
        List<RungaCuttaAlgorithmValues> rungaCuttaAlgorithmValues =
                rungaCuttaAlgorithm.algorithm();
        for (RungaCuttaAlgorithmValues r : rungaCuttaAlgorithmValues) {
            System.out.printf("X = %.3f", r.getX());
            System.out.printf("\tY = %.3f", r.getY_i());
            System.out.printf("\tF(x, y) = %.3f", r.getF_xy());
            System.out.printf("\tk1 = %.3f", r.getK1());
            System.out.printf("\tk2 = %.3f", r.getK2());
            System.out.printf("\tk3 = %.3f", r.getK3());
            System.out.printf("\tk4 = %.3f\n", r.getK4());
        }
    }
}


