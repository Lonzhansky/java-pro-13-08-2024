package ua.hillel.lessons.lesson25.demos._03_composite;

import java.util.ArrayList;
import java.util.List;

// Composite interface.
public abstract class LetterComposite {

    private final List<LetterComposite> part = new ArrayList<>();

    public void add(LetterComposite letter) {
        part.add(letter);
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print() {
        printThisBefore();
        part.forEach(LetterComposite::print);
        printThisAfter();
    }
}
