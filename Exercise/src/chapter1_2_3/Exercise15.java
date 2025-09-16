/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date13 thg 9, 2025 time23:56:42
 */
public class Exercise15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);	
		int numInput = input.nextInt();
		int number;
		int[] numList = new int[numInput];
	
		for (int i = 0; i < numInput; i++) {
			number = input.nextInt();
			numList[i] = number;
		}
		
		int min = numList[0];
		int max = numList[0];
		
		for (int i = 0; i < numInput; i++) {
			if(numList[i] < min) {
				min = numList[i];
			}
			if(numList[i] > max) {
				max = numList[i];
			}
		}
		System.out.printf("Max: %d\nMin: %d",max , min);
	}
}
