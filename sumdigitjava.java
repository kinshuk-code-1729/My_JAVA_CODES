import java.util.Scanner;
class sumdigitjava {
    public static void main(String args[]) {
        int n, r, s = 0, tmp;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        n = x.nextInt();
        tmp = n;
        while (n != 0) {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println("Sum of digits of the number " + tmp + " = " + s);
    }
}