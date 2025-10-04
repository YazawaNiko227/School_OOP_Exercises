package chapter4_exercise02;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		Product p = new Product("P001", "Laptop", 1500.0);
		OrderDetail od = new OrderDetail(2, p);
		Order order = new Order(101, Date.valueOf("2025-10-04"), od);

		System.out.println(order);

	}
}
