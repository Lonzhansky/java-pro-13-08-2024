package ua.hillel.lessons.lesson25.demos._06_flyweight;

import java.util.List;

// Pharmacy тримає ліки на своїх полицях,
// використовує MedicineFactory для надання ліків.
public class Pharmacy {

    private final List<Medicine> topShelf;
    private final List<Medicine> bottomShelf;

    public Pharmacy() {
        MedicineFactory factory = new MedicineFactory();

        topShelf = List.of(
                factory.createMedicine(MedicineType.BETA),
                factory.createMedicine(MedicineType.BETA),
                factory.createMedicine(MedicineType.GAMMA),
                factory.createMedicine(MedicineType.ALPHA),
                factory.createMedicine(MedicineType.BETA),
                factory.createMedicine(MedicineType.GAMMA),
                factory.createMedicine(MedicineType.ALPHA),
                factory.createMedicine(MedicineType.ALPHA),
                factory.createMedicine(MedicineType.BETA)
        );

        bottomShelf = List.of(
                factory.createMedicine(MedicineType.EPSILON),
                factory.createMedicine(MedicineType.EPSILON),
                factory.createMedicine(MedicineType.EPSILON),
                factory.createMedicine(MedicineType.DELTA),
                factory.createMedicine(MedicineType.DELTA)
        );
    }

    // Ліки з верхньої полиці.
    // Доступний лише для читання список усіх предметів
    // на верхній полиці.
    public final List<Medicine> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    // Ліки з нижньої полиці.
    // Доступний лише для читання список усіх предметів
    // на нижній полиці.
    public final List<Medicine> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    // Приймати всі ліки
    public void drinkAllMedicines() {
        System.out.println("\nDrinking TOP shelf medicines");
        topShelf.forEach(Medicine::drink);
        System.out.println("\nDrinking BOTTOM shelf medicines");
        bottomShelf.forEach(Medicine::drink);
    }
}
