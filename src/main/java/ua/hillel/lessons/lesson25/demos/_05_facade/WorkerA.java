package ua.hillel.lessons.lesson25.demos._05_facade;

// WorkerA - підсистема
public class WorkerA extends PlantWorker {

    @Override
    public void work() {
        System.out.println(name() + " makes operation A");
    }

    @Override
    public String name() {
        return "WorkerA";
    }
}
