package ua.hillel.lessons.lesson26.grasp.demos._3_controller;

import java.util.Locale;
import java.util.Scanner;

// View
public class ProductView {

    public Product getData() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        Product product = new Product();
        System.out.print("Enter product name: ");
        product.setName(scanner.nextLine());
        System.out.print("Enter product quota, pcs.: ");
        product.setQuota(scanner.nextInt());
        System.out.print("Enter product price, USD: ");
        product.setPrice(scanner.nextDouble());
        return product;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
