package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._03_CyclicBarrier._01;

import java.util.List;

// Дія бар'єру, яка має виконуватися
// при спрацьовуванні бар'єру
class BarrierAction implements Runnable {

    private final List<Integer> dataList;

    BarrierAction(List<Integer> dataList){
        this.dataList = dataList;
    }

    @Override
    public void run() {
        System.out.println("It's Barrier's action, " +
                "start further processing on list " +
                "with length " + dataList.size() + "     " + dataList);
    }
}
