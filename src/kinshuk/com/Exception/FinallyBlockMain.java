package kinshuk.com.Exception;

public class FinallyBlockMain {
    public static void main(String[] args) {
        try{
            int data = 16/4;
            System.out.println(data);
        }
        catch(NullPointerException npe){
            System.out.println(npe);
        }
        finally {
            System.out.println("No matter exception is there or not , finally block always executes !!!");
            System.out.println("Database connection closing, or File operation closing or any cleaning activity can be done in finally block");
        }
        System.out.println("Remaining code.......");
        try {

        }
        finally {
            System.out.println("try with finally exists !!");
        }
        try {
            System.exit(0);
        }
        finally {
            System.out.println("Finally block will not be executed as System.exit() was called");
        }
    }
}
