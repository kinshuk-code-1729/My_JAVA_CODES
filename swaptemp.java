import java.util.Scanner;
class swaptemp{
    public static void main(String[] args) {
        int m,n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("m = "+m);
        System.out.println("n = "+n);

        temp = m;
        m = n;
        n = temp;
        System.out.println("After Swapping");
        System.out.println("m = "+m);
        System.out.println("n = "+n);
    }
}