import java.util.Scanner;
class Percentage{
    public static void main(String[] args) {
        float Max_m,m1,m2,m3,m4,m5,avg,pnt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Max. Marks in Exam : ");
        Max_m = sc.nextFloat();
        System.out.println("Enter marks of 5 subjects....");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();
        m4 = sc.nextFloat();
        m5 = sc.nextFloat();
        avg = (m1 + m2 + m3 + m4 + m5) / 5;
        System.out.println("Average Marks = "+avg);
        pnt = (avg/Max_m)*100;
        System.out.println("Percentage = "+pnt+" %");
    }
}