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

        }
    }
}
