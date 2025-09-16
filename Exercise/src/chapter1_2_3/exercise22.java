/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:24:04
 */
public class exercise22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(check(number)) {
			System.out.println("La so nguyen to");
		}else {
			System.out.println("Khong phai la so nguyen to");
		}
	}
	
	public static boolean check(int number) {
		if(number < 2) {
			return false;
		}else {
			for (int i = 2; i < Math.sqrt(number); i++) {
				if(number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
