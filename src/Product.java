public class Product {
    private final String name;
    private final double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new IllegalArgumentException(name + " is out of stock");
        }
        stock -= quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + ": " + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
