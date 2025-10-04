/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 12:09:50
 */
package chapter4_exercise02;

import java.sql.Date;
import java.time.LocalDate;

public class Order {
    private int orderID;
    private Date orderDate;
    private OrderDetail orderDetail;

    public Order(int orderID, Date orderDate, OrderDetail orderDetail) {
        this.orderID = Math.max(orderID, 0);
        setOrderDate(orderDate);
        setOrderDetail(orderDetail);
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        if (orderDate == null || orderDate.after(Date.valueOf(LocalDate.now()))) {
            orderDate = Date.valueOf(LocalDate.now());
        }
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        if (orderDetail == null) {
            orderDetail = new OrderDetail(0, new Product());
        }
        this.orderDetail = orderDetail;
    }

    public double calcTotalCharge() {
        return orderDetail != null ? orderDetail.calcTotalPrice() : 0.0;
    }

    @Override
    public String toString() {
        return String.format("%d | %s | %.2f", orderID, orderDate, calcTotalCharge());
    }
}
