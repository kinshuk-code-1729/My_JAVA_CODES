import java.util.Scanner;
public class rt_angle{
    public static void main(String[] args) {
        double area , base , height;
        Scanner s = new Scanner(System.in);
        System.out.println("For a right angled triangle enter base and height...");
        System.out.print("Base = ");
        base = s.nextDouble();
        System.out.print("Height = ");
        height = s.nextDouble();
        area = 0.5 * base * height;
        System.out.println("Area = "+area+" sq. units");
    }
}
