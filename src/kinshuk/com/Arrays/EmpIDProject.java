package kinshuk.com.Arrays;
import java.util.Scanner;
public class EmpIDProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello , Enter the number of employees in your company : ");
        int noe = sc.nextInt();
        int EmpArr[] = new int[noe];

        for (int i = 0; i < EmpArr.length; i++) {
            System.out.print("Enter EmpID of employee "+(i+1)+" : ");
            EmpArr[i] = sc.nextInt();
        }
        for (int i = 0; i < EmpArr.length; i++) {
            System.out.println("EmpID of employee "+(i+1)+" is "+EmpArr[i]);
        }
    }
}
