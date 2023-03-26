package kinshuk.com.Threads;

public class ThreadTest2Main {
    public static void main(String[] args) {
        new ThreadTest2("Thread 1");
        new ThreadTest2("Thread 2");
        new ThreadTest2("Thread 3");
        try {
            Thread.sleep(8000);
        }
        catch (InterruptedException e){
            System.out.println("Interruption occurs in Main Thread");
        }
        System.out.println("We are exiting main thread !!!");
    }
}
