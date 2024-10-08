package ua.hillel.lessons.lesson13._02.demos._01_Locks._02_ReentrantReadWriteLock;

class ReaderThread extends Thread {
    private final SharedResource resource;

    public ReaderThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.readCounter();  // Читаємо лічильник кілька разів
            try {
                Thread.sleep(100);  // Симулюємо затримку
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}