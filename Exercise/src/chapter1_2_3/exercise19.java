/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:05:49
 */
public class exercise19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.toLowerCase().charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
