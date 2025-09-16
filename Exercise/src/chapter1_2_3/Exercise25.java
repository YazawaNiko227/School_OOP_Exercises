/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:44:33
 */
public class Exercise25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		for (int i = 2; i < num; i++) {
			if(checkPrime(i)) {
				sum += i;
			}
		}System.out.println(sum);
	}

	/**
	 * @param i
	 * @return
	 */
	private static boolean checkPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
