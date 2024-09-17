package ua.hillel.lessons.lesson9.demos._01_generics_intro;

// Застосування типу Object
public class ContainerB {

    private Object id;
    private int quota;

    ContainerB(Object id, int quota) {
        this.id = id;
        this.quota = quota;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
