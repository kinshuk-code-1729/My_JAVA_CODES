package kinshuk.com.Exception;

public class Exception1Main {
    public static void main(String[] args) {
//        int x = 8;
//        int y = 0;
//        calculate(6,3);
        calculate(9,0); // gives division by zero error
    }
    public static void calculate(int x,int y){
        try{
            int z = x/y;
            System.out.println(z);
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Exiting function Body");
    }
}
