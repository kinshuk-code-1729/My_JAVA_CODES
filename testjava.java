import java.util.Scanner;
class testjava{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first Name : ");
        String fname = input.next();

        System.out.print("Enter your last Name : ");
        String lname = input.next();

        System.out.print("your full Name is : "+fname+" "+lname);
    }
}