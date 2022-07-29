// Area of a rectangle.
import java.util.Scanner;
public class rectangle{
    public static void main(String[] args) {
        int l,b;
        long arr;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        l = s.nextInt();
        System.out.print("Enter width of rectangle : ");
        b = s.nextInt();
        arr = l * b ;
        System.out.println("Area = "+arr+" sq. units");
    }
}
