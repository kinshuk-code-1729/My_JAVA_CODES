package Lab_Works;
public class Exceptions {
    public static void main(String[] args) {
        try {
            float arr[] = new float[5];
            System.out.println("The val of 7th element is .... "+arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("Thrown Exception is : "+exp);
        }
        System.out.println("Out of the Exception Blocks ");
    }
}