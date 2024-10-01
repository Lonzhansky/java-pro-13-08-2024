package ua.hillel.lessons.lesson12.demos._07_Volatile;

public class ThreadMaker extends Thread {

    @Override
    public void run() {

        int localValue = DataRepository.INT_VALUE;

        while (DataRepository.INT_VALUE < 5) {
            System.out.println( "Incrementing value to " + (++localValue));
            DataRepository.INT_VALUE = localValue;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
