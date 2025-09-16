/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;


/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:39:26
 */
public class Exercise24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		int sum = 0;
		for (int i = 0; i < inputNumber; i++) {
			int number = input.nextInt();
			sum += number;
		}
		System.out.println(sum);
	}
}
