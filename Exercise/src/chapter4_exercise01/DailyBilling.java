/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 00:34:28
 */
package chapter4_exercise01;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 
 */
public class DailyBilling extends Bill{

	private int numberOfRentalDays;
	
	public DailyBilling(String billCode, LocalDateTime billDate, String clientName, String roomCode, double price) {
		super(billCode, billDate, clientName, roomCode, price);
	}

	public DailyBilling() {
		super();
	}

	
	public int getNumberOfRentalDays() {
		Duration duration = Duration.between(getBillDate(), LocalDateTime.now());
		numberOfRentalDays = (int) duration.toDays();
		return numberOfRentalDays;
	}

	@Override
	public double intoMoney() {
	    int days = getNumberOfRentalDays();
	    if (days > 7) {
	        return 7 * getPrice() + (days - 7) * getPrice() * 0.80;
	    }
	    return days * getPrice();
	}
}
