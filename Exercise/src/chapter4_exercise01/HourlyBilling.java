/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 4 thg 10, 2025 00:21:07
 */
package chapter4_exercise01;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 
 */
public class HourlyBilling extends Bill{
	private int rentalHours;

	public HourlyBilling(String billCode, LocalDateTime billDate, String clientName, String roomCode, double price) {
		super(billCode, billDate, clientName, roomCode, price);
	}

	public HourlyBilling() {
		super();
	}

	public int getRentalHours() {
		Duration duration = Duration.between(getBillDate(), LocalDateTime.now());
		rentalHours = (int) duration.toHours();
		return rentalHours;
	}

	@Override
	public double intoMoney() {
	    int hours = getRentalHours();
	    if (hours > 24 && hours < 30) {
	        return 24 * getPrice();
	    } else if (hours >= 30) {
	        int days = hours / 24;
	        if (days > 7) {
	            return 7 * getPrice() + (days - 7) * getPrice() * 0.80;
	        } else {
	            return days * getPrice();
	        }
	    }
	    return hours * getPrice();
	}
}
