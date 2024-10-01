package ua.hillel.lessons.lesson12.demos._05_Thread_stop;

public class ReaderThread extends  Thread {
    SharedResource resource;

    public ReaderThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Стан даних: " + resource.getData());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
