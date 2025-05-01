class Product {
    private static int totalProducts = 0;
    private int productId;
    private String productName;
    private String category;
    private double price;

    public Product() {
        this.productId = 0;
        this.productName = "Default Product";
        this.category = "General";
        this.price = 0.0;
        totalProducts++;
    }
    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }
    public double getPrice() {
        return price;
    }
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    public double calculateStockValue(int quantity, double discountRate) {
        double totalValue = price * quantity;
        return totalValue - (totalValue * discountRate / 100);
    }
}

public class Experiment_4_5 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", "Electronics", 800.50);
        Product p3 = new Product(102, "Smartphone", "Electronics", 500.75);

        Product.displayTotalProducts();
        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();
        int quantity = 10;
        System.out.println("Stock Value (Laptop, 10 units): Rs." + p2.calculateStockValue(quantity));
        System.out.println("Stock Value (Smartphone, 10 units, 10% discount): $" + p3.calculateStockValue(quantity, 10));
    }
}