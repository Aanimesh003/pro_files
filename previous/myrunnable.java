import java.lang.Runnable;
public class myrunnable implements Runnable {
    public void run(){
        System.out.println("the thread is running ");
    }
    public static void main(String args[])
    {
        Thread th = new Thread(new myrunnable());
        th.start();

        System.out.println("the thread has been intialised");
    }
}
