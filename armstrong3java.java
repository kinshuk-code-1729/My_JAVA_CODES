import java.util.Scanner;
class armstrong3java {
    public static void main(String args[]) {
        int n, r, s = 0, tmp;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        n = x.nextInt();
        tmp = n;
        while (n != 0) {
            r = n % 10;
            s += r * r * r;
            n /= 10;
        }
        if (tmp == s) {
            System.out.println(tmp + " is an armstrong number");
        } 
        else {
            System.out.println(tmp + " is not an armstrong number");
        }
    }
}