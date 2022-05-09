import java.util.Scanner;
public class Parallel_Capacitance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[10];
        int max_c,sum = 0;
        System.out.print("Enter total number of Capacitors : ");
        max_c = sc.nextInt();
        for (int i = 0; i < max_c; i++) {
            System.out.print("Enter value of capacitance : "+(i+1)+" : ");
            c[i] = sc.nextInt();
        }
        System.out.println("The capacitors are....");
        for (int i = 0; i < max_c; i++){
            System.out.println("Capacitance "+(i+1)+" : "+ c[i]+" F");
        }
        for (int k = 0; k < max_c; k++) {
            sum += c[k];
        }
        System.out.println("Equivalent Parallel Capacitance = "+sum+" F");
    }
}