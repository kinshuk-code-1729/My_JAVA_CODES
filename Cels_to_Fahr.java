import java.util.Scanner;
public class Cels_to_Fahr {
    public static void main(String[] args) {
        double cels,fahr;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in degree celsius : ");
        cels = s.nextDouble();
        fahr = 1.8 * cels + 32;
        System.out.println("Temperature in Fahrenheit is "+fahr);
    }
}
