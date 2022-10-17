import java.util.Scanner;
public class LinearRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter coords: ");
        String cord1 = scan.nextLine();
        System.out.print("Enter coords: ");
        String cord2 = scan.nextLine();

        int indexOfX1 = cord1.indexOf(",");
        int indexOfX2 = cord1.indexOf(",");
        int indexOfY1 = cord2.indexOf(")");
        int indexOfY2 = cord2.indexOf(")");

        int x1 = Integer.parseInt(cord1.substring(1,indexOfX1));
        int y1 = Integer.parseInt(cord1.substring(indexOfX1 + 2,indexOfY1));
        int x2 = Integer.parseInt(cord2.substring(1,indexOfX2));
        int y2 = Integer.parseInt(cord2.substring(indexOfX2 + 2,indexOfY2));

        LinearCalculator calc = new LinearCalculator(x1, y1, x2, y2);
        System.out.println(calc.distance());
    }
}
