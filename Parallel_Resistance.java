import java.util.Scanner;
public class Parallel_Resistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] r = new float[10];
        float max_r,sum1 = 0,rec,sum;
        System.out.print("Enter total number of resistors : ");
        max_r = scanner.nextFloat();
        for (int j = 0; j < max_r; j++) {
            System.out.print("Enter value of resistance "+(j+1)+" : ");
            r[j] = scanner.nextFloat();
        }
        System.out.println("The resistors are....");
        for (int i = 0; i < max_r; i++) {
            System.out.println("Resistance "+(i+1)+" : "+(int)r[i]+" Ω");
        }
        for (int k = 0; k < max_r; k++) {
            rec = 1/r[k];
            sum1 += rec;
        }
        sum = 1 / sum1;
        System.out.println("Equivalent Parallel Resistance = "+sum+" Ω");
    }
}
