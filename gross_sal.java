// Calculate Gross Salary of an Employee.
import java.util.Scanner;
class gross_sal{
    public static void main(String[] args){
        float Basic_sal,DA,HRA,da,hra,Gross_Sal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary : ");
        Basic_sal = sc.nextFloat();

        System.out.print("Enter value of DA : ");
        da = sc.nextFloat();

        System.out.print("Enter HRA Value : ");
        hra = sc.nextFloat();

        DA = (da * Basic_sal) / 100;
        HRA = (hra * Basic_sal) / 100;

        Gross_Sal = Basic_sal + DA + HRA;

        System.out.println("Net Gross Salary = "+Gross_Sal);
    }
}
