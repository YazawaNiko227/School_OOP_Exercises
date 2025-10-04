package chapter4_exercise02;

import java.sql.Date;

public class Test {
	public static void main(String[] args) {
        // Tạo sản phẩm
        Product product = new Product("SP001", "Chuột không dây", 250000.0);

        // Tạo chi tiết đơn hàng
        OrderDetail detail = new OrderDetail(3, product);

        // Tạo đơn hàng
        Order order = new Order(1001, Date.valueOf("2025-10-04"), detail);

        // In tiêu đề bảng
        System.out.printf("%-10s | %-12s | %-12s | %-20s | %-10s | %-10s | %-12s\n",
            "Mã đơn", "Ngày lập", "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng", "Thành tiền");

        // In dữ liệu đơn hàng
        System.out.printf("%-10d | %-12s | %-12s | %-20s | %-10.0f | %-10d | %-12.0f\n",
            order.getOrderID(),
            order.getOrderDate(),
            product.getProductID(),
            product.getDescription(),
            product.getPrice(),
            detail.getQuantity(),
            detail.calcTotalPrice());
    }
}
