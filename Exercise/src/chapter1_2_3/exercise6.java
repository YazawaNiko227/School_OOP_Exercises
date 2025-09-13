/**
 * 
 */
package chapter1_2_3;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date13 thg 9, 2025 time22:48:15
 */
public class exercise6 {
	    public static void main(String[] args) {
	    	int result = 1 + 2;            // result = 3
	    	System.out.println("1 + 2 = " + result);  // In ra: 1 + 2 = 3

	    	result = result - 1;           // result = 2
	    	System.out.println("3 - 1 = " + result);  // In ra: 3 - 1 = 2

	    	result = result * 2;           // result = 4
	    	System.out.println("2 * 2 = " + result);  // In ra: 2 * 2 = 4

	    	result = result / 2;           // result = 2
	    	System.out.println("4 / 2 = " + result);  // In ra: 4 / 2 = 2

	    	result = result + 8;           // result = 10
	    	result = result % 7;           // result = 10 % 7 = 3
	    	System.out.println("12 % 7 = " + result); // In ra: 12 % 7 = 3

	
	    	String firstString = "This is";
	    	String secondString = " a concatenated string.";
	    	String thirdString = firstString + secondString;
	    	System.out.println(thirdString);  // In ra: This is a concatenated string.


	    	int result1 = +1;               // result = 1
	    	System.out.println(result1);    // In ra: 1

	    	result1--;                      // result = 0
	    	System.out.println(result1);    // In ra: 0

	    	result1++;                      // result = 1
	    	System.out.println(result1);    // In ra: 1

	    	result1 = -result1;              // result = -1
	    	System.out.println(result1);    // In ra: -1

	    	boolean success = false;
	    	System.out.println(success);   // In ra: false
	    	System.out.println(!success); // In ra: true

	    	int i = 3;

	    	i++;                          // i = 4
	    	System.out.println(i);       // In ra: 4

	    	++i;                          // i = 5
	    	System.out.println(i);       // In ra: 5

	    	System.out.println(++i);     // i tăng lên 6, in ra: 6

	    	System.out.println(i++);     // in ra: 6, sau đó i = 7

	    	System.out.println(i);       // In ra: 7

	    }
}
