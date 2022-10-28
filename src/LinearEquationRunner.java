import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String cord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String cord2 = scan.nextLine();

        int indexOfX1 = cord1.indexOf(", ");
        int indexOfY1 = cord1.indexOf(")");

        //Makes the x and y of both coordinates into integers
        int x1 = Integer.parseInt(cord1.substring(1,indexOfX1));
        int y1 = Integer.parseInt(cord1.substring(indexOfX1 + 2,indexOfY1));

        int indexOfX2 = cord2.indexOf(", ");
        int indexOfY2 = cord2.indexOf(")");

        int x2 = Integer.parseInt(cord2.substring(1,indexOfX2));
        int y2 = Integer.parseInt(cord2.substring(indexOfX2 + 2,indexOfY2));

        boolean x1EqualsX2 = x1 == x2;

        System.out.println();
        LinearEquation calc = new LinearEquation(x1, y1, x2, y2);

        if (!x1EqualsX2) {
            System.out.println(calc.lineInfo());
            System.out.println();
            System.out.print("Enter a value for x: ");
            double x = scan.nextDouble();
            System.out.println();
            System.out.println("The point on the line is: " + calc.coordinateForX(x));
        } else {
            System.out.println("These points are on a vertical line: x = " + x1);
        }
    }
}
