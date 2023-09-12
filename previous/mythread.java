public class mythread extends Thread {
    public void  run(){
        System.out.println("the thrread has been intialized ");
    }
    public static void main(String args[])
    {
        mythread th = new mythread();

        th.start();
        System.out.println("the thread is running");
    }
}
