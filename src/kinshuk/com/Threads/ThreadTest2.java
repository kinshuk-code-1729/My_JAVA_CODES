package kinshuk.com.Threads;

public class ThreadTest2 implements Runnable{
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    String name;
    Thread thread;
    public ThreadTest2(String name){
        this.name = name;
        thread = new Thread(this,name);
        System.out.println("New Thread "+thread+" is created \n");
        thread.start();
    }
    @Override
    public void run() {
        try{
            for (int j = 5; j > 0 ; j--) {
                System.out.println(name+" : "+j);
//                System.out.println(Thread.currentThread().getName()+" : "+j); // same as name
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name+" thread interrupted !!!!!");
        }
        System.out.println(name+" exiting thread .....");
    }
}
