// Program to find Equivalent Capacitance in a series connection of capacitors.
import java.util.Scanner;
public class Series_Capacitance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] c = new float[10];
        float max_c,sum1=0,rec,sum;
        System.out.print("Enter total number of capacitors : ");
        max_c = sc.nextFloat();
        for (int k = 0; k < max_c; k++) {
            System.out.print("Enter value of capacitance "+(k+1)+" : ");
            c[k] = sc.nextFloat();
        }
        System.out.println("The capacitors are....");
        for (int j = 0; j < max_c; j++) {
            System.out.println("Capacitance "+(j+1)+" : "+(int)c[j]+" F");
        }
        for (int i = 0; i < max_c; i++) {
            rec = 1/c[i];
            sum1 += rec;
        }
        sum = 1 / sum1;
        System.out.println("Equivalent Series Capacitance = "+sum+" F");
    }
}
