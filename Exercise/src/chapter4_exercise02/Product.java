/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 12:32:02
 */
package chapter4_exercise02;

public class Product {
    private String productID;
    private String description;
    private double price;

    public Product(String productID, String description, double price) {
        setProductID(productID);
        setDescription(description);
        setPrice(price);
    }

    public Product() {
        this("Empty", "Empty", 0.0);
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = (productID == null || productID.isEmpty()) ? "Empty" : productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = (description == null || description.isEmpty()) ? "Empty" : description;
    }

    public double getPrice() {
        return Math.max(price, 0.0);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0.0);
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %.2f", productID, description, price);
    }
}
