package ua.hillel.lessons.lesson26.grasp.demos._7_pure_fabrication;

import java.util.ArrayList;
import java.util.List;

class ProductDaoImpl implements ProductDao {

    List<Product> products = new ArrayList<>();

    // Create products
    @Override
    public void createProduct(Product product) {
        products.add(product);
        System.out.println("Product's created.");
    }

    // Read products
    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    // Update product
    @Override
    public void updateProduct(Product product) {
        products.get(product.getId() - 1)
                .setName(product.getName());
        System.out.println("Product's updated");
    }

    // Delete product
    @Override
    public void deleteProduct(Product product) {
        products.remove(product.getId());
        System.out.println("Product's deleted");
    }
}
