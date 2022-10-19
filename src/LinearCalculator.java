import java.text.DecimalFormat;
public class LinearCalculator {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    DecimalFormat df = new DecimalFormat("0.00");

    public LinearCalculator(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {
        double far = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return far;
    }

    public double getSlope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return slope;
    }

    public String findSlope() {
        if (getSlope() % (int) getSlope() == 0) {
            return "" + (int)getSlope();
        } else {
            int numerator = y2 - y1;
            int denominator = x2 - x1;
            return numerator + "/" + denominator;
        }
    }

    public double getY() {
        double y = y1 - getSlope() * x1;
        return y;
    }

    public String getEquation() {
        if (getY() == 0) {
            return "y = " + findSlope() + "x";
        } else {
            if (getY() < 0) {
                return "y = " + findSlope() + "x" + df.format(getY());
            } else {
                return "y = " +  findSlope() + "x + " + df.format(getY());
            }
        }
    }

    public String getPoints(double x) {
        double y = (getSlope()*x) + getY();
        return "(" + x + ", " + df.format(y) + ")";
    }
}