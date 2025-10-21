/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 21 thg 10, 2025 21:07:35
 */
package chapter5_exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ProblemA {
	public static void main(String[] args) {
		ArrayList<String> Employee = new ArrayList<String>(Arrays.asList("An", "Bình", "Chi", "Dũng", "Hà", "Lan"));
		Random random = new Random();
		String gift = Employee.get(random.nextInt(Employee.size()));
		System.out.println("Employee who is gifted is: " + gift);
	}
}
