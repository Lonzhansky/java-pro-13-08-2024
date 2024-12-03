package ua.hillel.lessons.lesson25.demos._05_facade;

import java.util.Collection;
import java.util.List;

// Facade забезпечує єдиний інтерфейс, через який
// користувачі можуть керувати підсистемами, що
// спрощує керування всією системою (заводом)
public class PlantFacade {

    private final List<PlantWorker> workers;

    public PlantFacade() {
        workers = List.of(
                new WorkerA(),
                new WorkerB(),
                new WorkerC());
    }

    public void startDay() {
        makeActions(workers, Action.WAKE_UP, Action.GO_TO_PLANT);
    }

    public void makeProduct() {
        makeActions(workers, Action.WORK);
    }

    public void endDay() {
        makeActions(workers, Action.GO_HOME, Action.GO_TO_SLEEP);
    }

    private static void makeActions(List<PlantWorker> workers, Action... actions) {
        workers.forEach(worker -> worker.action(actions));
    }
}
