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
        return roundToHunderedths(far);
    }

    public double getSlope() {
        double slope = (double) (y2 - y1) / (double) (x2 - x1);
        return roundToHunderedths(slope);
    }

    public String findSlope() {
        if (getSlope() % (int) getSlope() == 0) {
            return "" + (int) getSlope();
        } else {
            int numerator = y2 - y1;
            int denominator = x2 - x1;
            if (numerator < 0 && denominator < 0) {
                return Math.abs(numerator) + "/" + Math.abs(denominator);
            } else {
                if (denominator < 0) {
                    return numerator * -1 + "/" + Math.abs(denominator);
                } else {
                    return numerator + "/" + denominator;
                }
            }
        }
    }

    public double getY() {
        double y = (double) y1 - (getSlope() * x1);
        return roundToHunderedths(y);
    }

    public String getEquation() {
        if (getSlope() == 0) {
            return "y = " + getY();
        } else {
            if (getY() == 0) {
                if (getSlope() == 1) {
                    return "y = " + "x";
                } else if (getSlope() == -1) {
                    return "y = " + "-x";
                } else {
                    return "y = " + findSlope() + "x";
                }
            } else {
                if (getY() < 0) {
                    if (getSlope() == 1) {
                        return "y = " + "x - " + Math.abs(getY());
                    } else if (getSlope() == -1) {
                        return "y = " + "-x - " + Math.abs(getY());
                    } else {
                        return "y = " + findSlope() + "x - " + Math.abs(getY());
                    }
                } else {
                    if (getSlope() == 1) {
                        return "y = " + "x + " + getY();
                    } else if (getSlope() == -1) {
                        return "y = " + "-x + " + getY();
                    } else {
                        return "y = " + findSlope() + "x + " + getY();
                    }
                }
            }
        }
    }

    public String getPoints(double x) {
        double y = (getSlope()*x) + getY();
        return "(" + x + ", " + roundToHunderedths(y) + ")";
    }

    public double roundToHunderedths(double num) {
        return (double)(Math.round(num*100))/100;
    }
}