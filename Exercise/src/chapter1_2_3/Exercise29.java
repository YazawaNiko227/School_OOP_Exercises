/**
 * 
 */
package chapter1_2_3;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:58:53
 */
public class Exercise29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        hinh1();
        hinh2();
        hinh3();
        
    }

    public static void hinh1() {
        int n = 5;
        System.out.println("\nHình 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hinh2() {
        int n = 5;
        System.out.println("\nHình 2:");
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print("  ");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void hinh3() {
        int n = 5;
        System.out.println("\nHình 3:");
        int i = 1;
        do {
            int space = 1;
            while (space <= n - i) {
                System.out.print("  ");
                space++;
            }

            int star = 1;
            while (star <= 2 * i - 1) {
                System.out.print("* ");
                star++;
            }

            System.out.println();
            i++;
        } while (i <= n);
    }
}
