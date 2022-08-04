// Program to Calculate Compound Interest.
import java.util.Scanner;
class Calc_CI{
    public double Comp_Int(int p,int t,double r,int n){
        return p * Math.pow(1 + (r / n), n * t);
    }
}
class Compound_Int{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calc_CI ci = new Calc_CI();
        int P,T,N;
        double R,amount,interest;
        System.out.print("Enter Principal Amount : ");
        P = s.nextInt();
        System.out.print("Enter Rate of Interest : ");
        R = s.nextDouble();
        System.out.print("Enter Time (in yrs) : ");
        T = s.nextInt();
        System.out.print("Enter Compounded times : ");
        N = s.nextInt();
        amount = ci.Comp_Int(P,T,R,N);
        interest = amount - P;
        System.out.println("Compound interest after "+T+" years = "+interest);
        System.out.println("Amount After "+T+" years = "+amount);
    }
}
