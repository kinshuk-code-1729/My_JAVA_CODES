import java.util.Scanner;
class SI{
    public float amt(float x,float y,float z){
        float intrst = (x*y*z)/100;
        return intrst;
    }
}
class SimpleInt{
    public static void main(String[] args) {
        float p,r,t,s;
        Scanner sc = new Scanner(System.in);
        SI a = new SI();
        System.out.print("Enter P : ");
        p = sc.nextFloat();
        System.out.print("Enter R : ");
        r = sc.nextFloat();
        System.out.print("Enter T : ");
        t = sc.nextFloat();
        s = a.amt(p, r, t);
        System.out.print("SI = "+s);
    }
}