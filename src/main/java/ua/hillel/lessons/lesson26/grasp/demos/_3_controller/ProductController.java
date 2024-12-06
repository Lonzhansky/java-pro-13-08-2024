package ua.hillel.lessons.lesson26.grasp.demos._3_controller;

// Controller
public class ProductController {

    private final ProductView view;
    private final ProductModel model;

    public ProductController(ProductView view, ProductModel model) {
        this.view = view;
        this.model = model;
    }

    public void runApp() {
        Product product = view.getData();
        String name = product.getName();
        double cost = model.calcCost(product.getQuota(), product.getPrice());
        String output = "Product: " + name + ", cost is USD " + cost;
        view.getOutput(output);
    }
}
