package ua.hillel.lessons.lesson9.demos._02_generic_class._01;

// Узагальнений клас.
// Сутність, створена через узагальнення.
// Має узагальнений тип властивостей
public class GenericEntity<T, S> {

    private final T propA;
    private final S propB;

    public GenericEntity(T propA, S propB) {
        this.propA = propA;
        this.propB = propB;
    }

    public T getPropA() {
        return propA;
    }

    public S getPropB() {
        return propB;
    }
}
