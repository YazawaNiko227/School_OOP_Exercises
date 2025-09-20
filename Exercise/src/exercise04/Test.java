/**
 * 
 */
package exercise04;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date20 thg 9, 2025 time11:20:12
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Tạo tài khoản mẫu
        Account acc1 = new Account(123456, "Phan Duc Toan", 0, null, null);
        Account acc2 = new Account(654321, "Nguyen Van B", 0, null, null);

        // In thông tin ban đầu
        System.out.println("== Thông tin ban đầu ==");
        System.out.println(acc1);
        System.out.println(acc2);

        // Nạp tiền vào acc1
        System.out.println("\n== Nạp tiền vào acc1 ==");
        acc1.deposit(500000);
        System.out.println(acc1);

        // Rút tiền từ acc1
        System.out.println("\n== Rút tiền từ acc1 ==");
        acc1.withdraw(200000);
        System.out.println(acc1);

        // Chuyển tiền từ acc1 sang acc2
        System.out.println("\n== Chuyển tiền từ acc1 sang acc2 ==");
        acc1.transfer(acc2, 100000);
        System.out.println("Sau khi chuyển:");
        System.out.println(acc1);
        System.out.println(acc2);

        // Đáo hạn acc2
        System.out.println("\n== Đáo hạn acc2 ==");
        acc2.matureInterest();
        System.out.println(acc2);
	}

}
