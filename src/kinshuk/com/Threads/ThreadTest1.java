package kinshuk.com.Threads;

public class ThreadTest1 extends Thread{
//    run() method performs action for thread
    @Override
    public void run(){
        int x = 74;
        int y = 36;
        int z = x + y;
        System.out.println("Thread has been started and it is running !!!!");
        System.out.println("Addition is = "+z);
    }
}
