/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:13:56
 */
public class Exercise20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if(Character.isDigit(string.charAt(i))) {
				count++;
			}
		}System.out.println(count);
	}

}
