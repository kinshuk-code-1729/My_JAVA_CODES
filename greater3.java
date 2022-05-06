import java.util.Scanner;
public class greater3 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if(x>y){
            if(x>z){
                System.out.println(x+" is greatest");
            }
            else{
                System.out.println(z+" is greatest");
            }
        }
        else{
            if(y>z){
                System.out.println(y+" is greatest");
            }
            else{
                System.out.println(z+" is greatest");
            }
        }
    }
}
