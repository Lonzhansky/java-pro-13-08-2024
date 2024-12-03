package ua.hillel.lessons.lesson25.demos._05_facade;

// WorkerC - підсистема
public class WorkerC extends PlantWorker {

    @Override
    public void work() {
        System.out.println(name() + " makes operation C");
    }

    @Override
    public String name() {
        return "WorkerC";
    }
}
