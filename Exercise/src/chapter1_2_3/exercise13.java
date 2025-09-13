/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date13 thg 9, 2025 time23:41:00
 */
public class exercise13 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		StringBuilder output = new StringBuilder();
		for (int i = 1; i <= number; i++) {
			output.append(i);
			if(i < number) {
				output.append('+');
			}
		}
		System.out.println(output);
	}

}
