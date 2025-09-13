/**
 * 
 */
package chapter1_2_3;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date13 thg 9, 2025 time23:02:45
 */
public class exercise09 {
	public static void main(String[] args) {
		int testScore = 76;
		char grade;
		if(testScore >= 90) {
			grade = 'A';
		}else if(testScore >= 80) {
			grade = 'B';
		}else if (testScore >= 70) {
			grade = 'C';
		}else if (testScore >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
		
		int month = 8;
	    String monthString;
		
		switch (month) {
        case 1:  monthString = "January"; break;
        case 2:  monthString = "February"; break;
        case 3:  monthString = "March"; break;
        case 4:  monthString = "April"; break;
        case 5:  monthString = "May"; break;
        case 6:  monthString = "June"; break;
        case 7:  monthString = "July"; break;
        case 8:  monthString = "August"; break;
        case 9:  monthString = "September"; break;
        case 10: monthString = "October"; break;
        case 11: monthString = "November"; break;
        case 12: monthString = "December"; break;
        default: monthString = "Invalid month"; break;
		}
        System.out.println(monthString);
        
        for (int i = 1; i < 11; i++) {
			System.out.println("Count is: " + i);
		}
        
        int count = 1;
        while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}
        do {
        	System.out.println("Count is: " + count);
        	count++;
        }while(count < 11);
	}
}
