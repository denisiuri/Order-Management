package businessLayer;

public class Product {
    private int productID;
    private String productName;
    private float price;
    private int quantity;

    public Product(int id, String name, float price, int q) {
        this.productID = id;
        this.productName = name;
        this.price = price;
        this.quantity = q;
    }

    public Product() {

    }

    public int getProduct_id() {
        return productID;
    }

    public void setProduct_id(int productID) {
        this.productID = productID;
    }

    public String getProduct_name() {
        return productName;
    }

    public void setProduct_name(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
