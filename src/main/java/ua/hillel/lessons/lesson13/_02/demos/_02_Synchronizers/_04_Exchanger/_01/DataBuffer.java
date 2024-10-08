package ua.hillel.lessons.lesson13._02.demos._02_Synchronizers._04_Exchanger._01;

import java.util.ArrayList;
import java.util.List;

public class DataBuffer {

    private final List<String> data = new ArrayList<>();

    public String getData() {
        return data.removeFirst();
    }

    public void addToBuffer(String str) {
        data.add(str);
    }

    public boolean isFull() {
        return data.size() == 1;
    }
}
