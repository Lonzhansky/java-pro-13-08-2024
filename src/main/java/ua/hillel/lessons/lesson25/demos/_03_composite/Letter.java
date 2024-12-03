package ua.hillel.lessons.lesson25.demos._03_composite;

public class Letter extends LetterComposite {

    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }
}
