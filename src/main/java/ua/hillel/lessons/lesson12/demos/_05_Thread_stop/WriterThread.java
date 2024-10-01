package ua.hillel.lessons.lesson12.demos._05_Thread_stop;

public class WriterThread extends  Thread {
    SharedResource resource;

    public WriterThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.addData("Елемент " + i);
        }
    }
}
