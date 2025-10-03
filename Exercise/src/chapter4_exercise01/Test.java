/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 01:14:39
 */
package chapter4_exercise01;

import java.time.LocalDateTime;

/**
 * 
 */
public class Test {
	public static void main(String[] args) {
        // Hóa đơn theo giờ: dưới 24 giờ
        Bill hourly1 = new HourlyBilling("H001", LocalDateTime.now().minusHours(10), "Nguyễn Văn A", "P101", 100_000);
        System.out.println(hourly1);
        System.out.println("Thành tiền: " + hourly1.intoMoney());

        // Hóa đơn theo giờ: từ 25 đến 30 giờ
        Bill hourly2 = new HourlyBilling("H002", LocalDateTime.now().minusHours(28), "Trần Thị B", "P102", 100_000);
        System.out.println(hourly2);
        System.out.println("Thành tiền: " + hourly2.intoMoney());

        // Hóa đơn theo giờ: trên 30 giờ (sử dụng công thức DailyBilling)
        Bill hourly3 = new HourlyBilling("H003", LocalDateTime.now().minusHours(80), "Lê Văn C", "P103", 100_000);
        System.out.println(hourly3);
        System.out.println("Thành tiền: " + hourly3.intoMoney());

        // Hóa đơn theo ngày: dưới 7 ngày
        Bill daily1 = new DailyBilling("D001", LocalDateTime.now().minusDays(5), "Phạm Thị D", "P201", 500_000);
        System.out.println(daily1);
        System.out.println("Thành tiền: " + daily1.intoMoney());

        // Hóa đơn theo ngày: trên 7 ngày (áp dụng giảm giá)
        Bill daily2 = new DailyBilling("D002", LocalDateTime.now().minusDays(10), "Hoàng Văn E", "P202", 500_000);
        System.out.println(daily2);
        System.out.println("Thành tiền: " + daily2.intoMoney());
    }
}
