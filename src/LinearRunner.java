import java.util.Scanner;
import java.text.DecimalFormat;
public class LinearRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter coords: ");
        String cord1 = scan.nextLine();
        System.out.print("Enter coords: ");
        String cord2 = scan.nextLine();

        int indexOfX1 = cord1.indexOf(", ");
        int indexOfY1 = cord1.indexOf(")");


        int x1 = Integer.parseInt(cord1.substring(1,indexOfX1));
        int y1 = Integer.parseInt(cord1.substring(indexOfX1 + 2,indexOfY1));

        int indexOfX2 = cord2.indexOf(", ");
        int indexOfY2 = cord2.indexOf(")");

        int x2 = Integer.parseInt(cord2.substring(1,indexOfX2));
        int y2 = Integer.parseInt(cord2.substring(indexOfX2 + 2,indexOfY2));

        LinearCalculator calc = new LinearCalculator(x1, y1, x2, y2);
        System.out.println("Distance: " + df.format(calc.distance()));

        System.out.println("Slope: " + calc.getSlope());
        System.out.println("Equation: " + calc.getEquation());
        System.out.println("The y-intercept is: " + calc.getY());
    }
}
