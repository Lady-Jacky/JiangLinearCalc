public class LinearCalculator {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

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

    public double getY() {
        double y = y1 - getSlope() * x1;
        return y;
    }

    public String getEquation() {
        if (getY() == 0) {
            return "y = " + getSlope() + "x";
        } else {
            if (getY() < 0) {
                return "y = " + getSlope() + "x - " + getY();
            } else {
                return "y = " + getSlope() + "x + " + getY();
            }
        }
    }
}