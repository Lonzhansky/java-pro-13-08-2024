package ua.hillel.lessons.lesson25.demos._06_flyweight;

import java.util.EnumMap;
import java.util.Map;

// MedicineFactory є Flyweight у цьому прикладі.
// Це мінімізує використання пам’яті завдяки спільному
// використанню об’єктів.
// Він містить Map екземплярів medicines, і нові medicines
// створюються лише тоді, коли немає жодного такого
// типу (MedicineType).
public class MedicineFactory {

    private final Map<MedicineType, Medicine> medicines;

    public MedicineFactory() {
        medicines = new EnumMap<>(MedicineType.class);
    }

    Medicine createMedicine(MedicineType type) {
        Medicine medicine = medicines.get(type);
        if (medicine == null) {
            switch (type) {
                case ALPHA -> medicine = new AlphaMedicine();
                case BETA -> medicine = new BetaMedicine();
                case GAMMA -> medicine = new GammaMedicine();
                case DELTA -> medicine = new DeltaMedicine();
                case EPSILON -> medicine = new EpsilonMedicine();
                default -> {
                }
            }
            if (medicine != null) {
                medicines.put(type, medicine);
            }
        }
        return medicine;
    }
}
