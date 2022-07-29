// Area of a square.
import java.util.Scanner;
public class square{
    public static void main(String[] args) {
        int side;
        long area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of side of square : ");
        side = s.nextInt();
        area =  side * side;
        System.out.println("Area = "+area+" sq. units");
    }
}
