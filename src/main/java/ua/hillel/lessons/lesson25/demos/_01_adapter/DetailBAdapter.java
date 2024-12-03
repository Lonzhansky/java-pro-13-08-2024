package ua.hillel.lessons.lesson25.demos._01_adapter;

public class DetailBAdapter implements DetailA {

    private final DetailB detailB = new DetailB();

    public void workA() {
        detailB.workB();
    }
}