package ua.hillel.lessons.lesson9.demos._01_generics_intro;

public class ContainerA {

    private int id;
    private int quota;

    ContainerA(int id, int quota) {
        this.id = id;
        this.quota = quota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
