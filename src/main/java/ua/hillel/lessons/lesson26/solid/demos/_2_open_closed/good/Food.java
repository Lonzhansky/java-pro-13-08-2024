package ua.hillel.lessons.lesson26.solid.demos._2_open_closed.good;

public class Food extends Product {

    private String name;
    private String type = "food";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Підрахунок суми за категорією (ціна + податок з продажів)
    @Override
    public double calculatePriceWithTax() {
        return getPrice() + getPrice() * 5 / 100;
    }
}
