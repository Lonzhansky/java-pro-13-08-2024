package ua.hillel.lessons.lesson9.demos._01_generics_intro;

// Застосування узагальнення
public class ContainerC<T> {

    private T id;
    private int quota;

    ContainerC(T id, int quota) {
        this.id = id;
        this.quota = quota;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
