/**
 * 
 */
package chapter1_2_3;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date13 thg 9, 2025 time23:34:43
 */
public class exercise12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		int sum = 0;
		while(number++ < 100) {
			if(number % 7 == 0) {
				sum += number;
			}
		}
		System.out.println(sum);
	}

}
