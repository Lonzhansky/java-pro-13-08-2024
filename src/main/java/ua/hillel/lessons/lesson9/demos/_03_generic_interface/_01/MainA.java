package ua.hillel.lessons.lesson9.demos._03_generic_interface._01;

public class MainA {

    public static void main(String[] args) {

        ProductA<String> product = new ProductA<>();
        product.setName("Orange");

        System.out.println("Product: " + product.getName());
    }
}
