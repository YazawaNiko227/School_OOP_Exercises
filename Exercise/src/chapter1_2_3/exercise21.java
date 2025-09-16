/**
 * 
 */
package chapter1_2_3;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:17:12
 */
public class exercise21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "Bai Tap Mon Lap Trinh Java";
		String[] newString = string.split(" ");
		int lenghtString = newString.length;
		int i = 0;
		while(lenghtString-- != 0) {
			System.out.println(newString[i++]);
		}
	}

}
