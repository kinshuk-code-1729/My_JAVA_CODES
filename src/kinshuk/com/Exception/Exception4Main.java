package kinshuk.com.Exception;

public class Exception4Main {
    public static void main(String[] args) {
        calc(7,3);
        calc(8,0);
    }
    public static int calc(int p ,int q){
        int r = 0;
//        System.exit(0);
        try{
            r =  p/q;
            System.out.println(r);
//            System.exit(0);
        }
        finally {
            System.out.println("Inside Finally Block ..");
        }
//        System.exit(0);
        System.out.println("Exiting Function Body .....");
        return r;
    }
}
