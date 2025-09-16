/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;


/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time14:54:58
 */
public class exercise17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number % 2 == 0 && number != 0) {
			System.out.println("So chan");
		}else if(number % 2 != 0) {
			System.out.println("So le");
		}else{
			System.out.println("Zero");
		}
	}

}
