// Program to Check whether a number is a Palindrome Number.
import java.util.Scanner;
class palindromejava {
    public static void main(String args[]) {
        int n, r, s = 0, tmp;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        n = x.nextInt();
        tmp = n;
        while (n != 0) {
            r = n % 10;
            s = s * 10 + r;
            n /= 10;
        }
        if (tmp == s) {
            System.out.println(tmp + " is a palindrome number");
        }
        else {
            System.out.println(tmp + " is not a palindrome number");
        }
    }
}
