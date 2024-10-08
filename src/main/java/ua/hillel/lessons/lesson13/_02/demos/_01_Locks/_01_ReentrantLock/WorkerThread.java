package ua.hillel.lessons.lesson13._02.demos._01_Locks._01_ReentrantLock;

class WorkerThread extends Thread {
    private final SharedResource resource;

    public WorkerThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment();  // Кожен потік збільшує лічильник 5 разів
            try {
                Thread.sleep(100);  // Симулюємо деяку затримку
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}