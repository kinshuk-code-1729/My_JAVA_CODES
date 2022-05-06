import java.util.Scanner;
public class feet_to_centi{
    public static void main(String[] args) {
        double feet , centi;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Length in Feet : ");
        feet = s.nextDouble();
        centi = 30.48 * feet;
        System.out.println("Length in Centimeters = "+centi);
    }
}