/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 21 thg 10, 2025 21:14:20
 */
package chapter5_exercise01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProblemB {
	public static void main(String[] args) {
		 Set<String> tenNhanVien = new HashSet<>(Arrays.asList("An", "Bình", "Chi", "An", "Dũng", "Chi"));
	        Iterator<String> it = tenNhanVien.iterator();
	        if (it.hasNext()) {
	            String tenSanPham = it.next();
	            it.remove(); 
	            System.out.println("Tên sản phẩm mới: " + tenSanPham);
	        } else {
	            System.out.println("Không còn tên để dùng.");
	        }
	}
}
