// Area of an equilateral triangle.
import java.util.Scanner;
public class Equilateral {
    public static void main(String[] args) {
        double area , side;
        Scanner s = new Scanner(System.in);
        System.out.print("For equilateral triangle enter its length of side : ");
        side = s.nextDouble();
        area =  (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area = "+area+" sq. units");
    }
}
