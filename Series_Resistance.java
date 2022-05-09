import java.util.Scanner;
public class Series_Resistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] r = new int[10];
        int max_r,sum = 0;
        System.out.print("Enter total number of Resistors : ");
        max_r = scanner.nextInt();
        for (int i = 0; i < max_r; i++) {
            System.out.print("Enter value of resistance : "+(i+1)+" : ");
            r[i] = scanner.nextInt();
        }
        System.out.println("The resistors are....");
        for (int i = 0; i < max_r; i++) {
            System.out.println("Resistance "+(i+1)+" : "+ r[i]+" Ω");
        }
        for (int k = 0; k < max_r; k++) {
            sum += r[k];
        }
        System.out.println("Equivalent Series Resistance = "+sum+" Ω");
    }
}