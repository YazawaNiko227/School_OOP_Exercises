/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 12:25:36
 */
package chapter4_exercise02;

public class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(int quantity, Product product) {
        setQuantity(quantity);
        setProduct(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if (product == null) {
            product = new Product();
        }
        this.product = product;
    }

    public double calcTotalPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%d | %s", quantity, product);
    }
}
