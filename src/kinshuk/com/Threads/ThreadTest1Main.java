package kinshuk.com.Threads;

public class ThreadTest1Main {
    public static void main(String[] args) {
//        Instance creation of thread that Extends Thread Class
        ThreadTest1 test1 = new ThreadTest1();
//        System.out.println(test1); // 'toString()' is overridden as it shows the value as Thread
//        calling 'start()' to execute 'run(); of Thread class
        test1.start();
    }
}
