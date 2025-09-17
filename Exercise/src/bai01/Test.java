/**
 * 
 */
package bai01;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date17 thg 9, 2025 time17:10:43
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số lượng hình chữ nhật: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
		    System.out.printf("Hình %d - Nhập chiều dài: ", i + 1);
		    double dai = input.nextDouble();
		    System.out.print("Nhập chiều rộng: ");
		    double rong = input.nextDouble();

		    HinhChuNhat hcn = new HinhChuNhat(dai, rong);
		    System.out.println(hcn);
		}

	}

}	
