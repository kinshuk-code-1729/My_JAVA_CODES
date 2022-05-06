import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        double rad,ar,pmtr;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Radius of circle : ");
        rad = s.nextDouble();
        ar = Math.PI * rad * rad;
        pmtr = 2 * Math.PI * rad;
        System.out.print("Area = "+ar+" sq.units\nCircumference = "+pmtr+" units");
    }
}
