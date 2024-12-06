package ua.hillel.lessons.lesson26.grasp.demos._7_pure_fabrication;

class App {

    static ProductDao productDao;
    static Product product;

    public static void main(String[] args) {

        productDao = new ProductDaoImpl();

        System.out.println("CREATE --------------------------------");
        createProducts();

        System.out.println("\nREAD ----------------------------------");
        readProducts();

        System.out.println("\nUPDATE --------------------------------");
        product = productDao.getAllProducts().get(0);
        updateProduct(product);
        readProducts();

        System.out.println("\nDELETE --------------------------------");
        product = productDao.getAllProducts().get(1);
        deleteProduct(product);
        readProducts();
    }

    // Create product method
    static void createProducts() {
        Product product1 = new Product("Orange", 1);
        productDao.createProduct(product1);
        Product product2 = new Product("Milk", 2);
        productDao.createProduct(product2);
        Product product3 = new Product("Rice", 3);
        productDao.createProduct(product3);
    }

    // Read products method
    static void readProducts() {
        for (Product product : productDao.getAllProducts()) {
            System.out.println("Product id: " + product.getId()
                    + ", name: " + product.getName()
            );
        }
    }

    // Update product method
    static void updateProduct(Product product) {
        product.setName("Grape");
        product.setId(1);
        productDao.updateProduct(product);
    }

    // Delete product method
    static void deleteProduct(Product product) {
        product.setId(1);
        productDao.deleteProduct(product);
    }
}
