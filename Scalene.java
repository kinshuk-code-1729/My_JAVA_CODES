import java.util.Scanner;
public class Scalene {
    public static void main(String[] args) {
        double x,y,z,sp,area;
        Scanner s = new Scanner(System.in);
        System.out.println("For a Scalene Triangle enter values of sides below.....");
        System.out.print("Enter 1st side : ");
        x = s.nextDouble();
        System.out.print("Enter 2nd side : ");
        y = s.nextDouble();
        System.out.print("Enter 3rd side : ");
        z = s.nextDouble();
        sp = (x + y + z)/2;
        area = Math.sqrt( (sp) * (sp - x) * (sp - y) * (sp - z) );
        System.out.println("Area of triangle = "+area+" sq. units");
    }
}
