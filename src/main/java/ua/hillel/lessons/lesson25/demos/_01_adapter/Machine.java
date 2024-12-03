package ua.hillel.lessons.lesson25.demos._01_adapter;

public class Machine {

    private final DetailA detailA;

    // Конструктор класу Machine
    // має як параметр змінну
    // типу DetailA, оскільки машина безпосередньо
    // працює лише з деталлю A.
    public Machine(DetailA detailA) {
        this.detailA = detailA;
    }

    void workA() {
        detailA.workA();
    }
}
