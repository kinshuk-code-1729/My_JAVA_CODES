// Calculate Overall GST on a Product.
import java.util.Scanner;
class calc_GST{
    public double calc_cgst(double x){
        double cgst;
        cgst = 0.05 * x;
        return cgst;
    }
    public double calc_sgst(double y){
        double sgst;
        sgst = 0.05 * y;
        return sgst;
    }
}
class GST_Calc{
    public static void main(String[] args) {
        calc_GST tax = new calc_GST();
        Scanner sc = new Scanner(System.in);
        double act_price,final_price,pw_tax;
        System.out.print("Enter actual price : ");
        act_price = sc.nextDouble();
        pw_tax = tax.calc_cgst(act_price) + tax.calc_sgst(act_price);
        final_price = act_price + pw_tax;
        System.out.println("Final Price with GST = Rs. "+final_price);
    }
}
