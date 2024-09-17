package ua.hillel.lessons.lesson9.demos._03_generic_interface._01;

public class MainC {

    public static void main(String[] args) {

        ProductC<String, Integer> product = new ProductC<>();
        product.setName("Orange");
        product.setQuantity(12);

        System.out.println("Product: " + product.getName()
                + ", " + product.getQuantity() + " kg");

//        IProduct<String> iProduct = new ProductC<String, Integer>();
//
//        ((ProductC) iProduct).setQuantity(123);
//        System.out.println(((ProductC) iProduct).getQuantity());

    }
}
