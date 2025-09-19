/**
 * 
 */
package exercise03b;

import java.time.LocalDate;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date19 thg 9, 2025 time22:51:52
 */
public class Test {
	public static void main(String[] args) {
		HangThucPham product = new HangThucPham("");
		HangThucPham product1 = new HangThucPham("TP001", 
	            "Sữa tươi Vinamilk", 
	            25000.0, 
	            LocalDate.of(2025, 9, 18), 
	            LocalDate.of(2025, 10, 18)
	            );
		
		System.out.println(product);
		System.out.println(product1);
	}
}
