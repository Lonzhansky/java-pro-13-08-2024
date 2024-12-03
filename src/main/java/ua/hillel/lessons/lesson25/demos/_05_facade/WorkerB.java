package ua.hillel.lessons.lesson25.demos._05_facade;

// WorkerB - підсистема
public class WorkerB extends PlantWorker {

    @Override
    public void work() {
        System.out.println(name() + " makes operation B");
    }

    @Override
    public String name() {
        return "WorkerB";
    }
}
