/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:54:17
 */
public class Exercise27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số nguyên n: ");
	        int n = scanner.nextInt();

	        int a = 1, b = 1;

	        System.out.print("Chuỗi Fibonacci: ");
	        if (n >= 1) System.out.print(a + " ");
	        if (n >= 2) System.out.print(b + " ");

	        for (int i = 3; i <= n; i++) {
	            int next = a + b;
	            System.out.print(next + " ");
	            a = b;
	            b = next;
	        }
		  }
	}

}
