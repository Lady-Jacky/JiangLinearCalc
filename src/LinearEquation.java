public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }



    public double distance() {
        double far = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return roundToHunderedth(far);
    }

    public double slope() {
        double slope = (double) (y2 - y1) / (double) (x2 - x1);
        return roundToHunderedth(slope);
    }

    public String modifySlope() {
        if (slope() % (int) slope() == 0) {
            return "" + (int) slope();
        } else {
            //The next 3 lines of code helps ensure that fractions such as -7/-2 will become 7/2
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

    public double yIntercept() {
        double y = (double) y1 - (slope() * x1);
        return roundToHunderedth(y);
    }

    public String equation() {
        if (slope() == 0) {
            return "y = " + yIntercept();
        } else {
            if (yIntercept() == 0) {
                if (slope() == 1) {
                    return "y = " + "x";
                } else if (slope() == -1) {
                    return "y = " + "-x";
                } else {
                    return "y = " + modifySlope() + "x";
                }
            } else {
                //The Math.abs in the following lines make it so that I would be able to use a subtraction sign
                //in the equation when there is a negative y-intercept
                if (yIntercept() < 0) {
                    if (slope() == 1) {
                        return "y = " + "x - " + Math.abs(yIntercept());
                    } else if (slope() == -1) {
                        return "y = " + "-x - " + Math.abs(yIntercept());
                    } else {
                        return "y = " + modifySlope() + "x - " + Math.abs(yIntercept());
                    }
                } else {
                    if (slope() == 1) {
                        return "y = " + "x + " + yIntercept();
                    } else if (slope() == -1) {
                        return "y = " + "-x + " + yIntercept();
                    } else {
                        return "y = " + modifySlope() + "x + " + yIntercept();
                    }
                }
            }
        }
    }

    public String coordinateForX(double x) {
        double y = (slope()*x) + yIntercept();
        return "(" + x + ", " + roundToHunderedth(y) + ")";
    }

    public double roundToHunderedth(double num) {
        return (double)(Math.round(num*100))/100;
    }


    public String lineInfo() {
        //prints out the results of all the other methods
            return "The 2 points are: " + "(" + x1 + ", " + y1 + ")" + " and " + "(" + x2 + ", " + y2 + ")\nThe equation of the line between the 2 points is: " + equation() +"\nThe slope of the line is: " + slope() +
                    "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between the 2 points is: " + distance();
    }
}

