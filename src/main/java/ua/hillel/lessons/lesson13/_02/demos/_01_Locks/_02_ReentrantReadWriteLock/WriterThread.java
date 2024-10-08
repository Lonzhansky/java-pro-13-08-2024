package ua.hillel.lessons.lesson13._02.demos._01_Locks._02_ReentrantReadWriteLock;

class WriterThread extends Thread {
    private final SharedResource resource;

    public WriterThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.writeCounter(i);  // Оновлюємо лічильник
            try {
                Thread.sleep(200);  // Симулюємо затримку
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}