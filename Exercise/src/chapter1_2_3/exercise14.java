/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date13 thg 9, 2025 time23:45:19
 */
public class exercise14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number =  input.nextInt();
		StringBuilder output = new StringBuilder();
		if(number % 2 == 0) {
			for (int i = 1; i <= number; i++) {
				if(i % 2 == 0) {
					sum += i;
					output.append(i);
					if(i < number) {
						output.append('+');
					}
				}
			}
		}else {
			for (int i = 1; i <= number; i++) {
				if(i % 2 != 0) {
					sum += i;
					output.append(i);
					if(i < number) {
						output.append('+');
					}
				}
			}
		}
		System.out.println(output + "=" + sum);
	}

}
