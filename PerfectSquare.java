import java.util.Scanner;
class checkPS {
    public static boolean isPftSq(int k) {
        if (k >= 0) {
            int rt = (int) Math.sqrt(k);
            return ((rt * rt) == k);
        }
        return false;
    }
}
class PerfectSquare{
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = s.nextInt();
        if(checkPS.isPftSq(num)) System.out.println(num+" is a perfect square");
        else System.out.println(num+" is not a perfect square");
    }
}