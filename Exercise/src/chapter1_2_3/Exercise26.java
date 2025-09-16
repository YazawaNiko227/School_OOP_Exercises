/**
 * 
 */
package chapter1_2_3;

import java.util.Scanner;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date16 thg 9, 2025 time15:51:52
 */
public class Exercise26 {

	/**
	 * @param args
	 */
	public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập N: ");
			int N = scanner.nextInt();

			int dem = 0;    
			int so = 2;      
			int tong = 0;    

			while (dem < N) {
			    if (laSoNguyenTo(so)) {
			        tong += so;
			        dem++;
			    }
			    so++;
			}

			System.out.println("Tổng " + N + " số nguyên tố đầu tiên là: " + tong);
		}
    }
}
