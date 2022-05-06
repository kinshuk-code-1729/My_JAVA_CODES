import java.util.Scanner;
public class power_bill{
    public static void main(String[] args) {
        byte custno;
        float consumption,amt=0.0F;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter customer number : ");
        custno = s.nextByte();
        System.out.print("Enter power units consumed : ");
        consumption = s.nextFloat();
        if(consumption>=0 && consumption<=200){
            amt = consumption * 0.50F;
        }
        else if(consumption>=201 & consumption<=400){
            amt = 100 + (0.65F * (consumption - 200));
        }
        else if(consumption>=401 & consumption<=600){
            amt = 230 + (0.80F * (consumption - 400));
        }
        System.out.println("Net payable amount = Rs. "+ amt);
    }
}
