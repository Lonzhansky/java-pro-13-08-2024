package ua.hillel.lessons.lesson12.demos._07_Volatile;

public class ThreadListener extends Thread {

    @Override
    public void run() {

        int localValue = DataRepository.INT_VALUE;

        while (localValue < 5) {
            if (localValue != DataRepository.INT_VALUE) {
                System.out.println("Got change for value : " +
                        DataRepository.INT_VALUE);
                localValue = DataRepository.INT_VALUE;
            }
        }
    }
}
