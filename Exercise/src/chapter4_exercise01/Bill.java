/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @created 3 thg 10, 2025 22:36:16
 */
package chapter4_exercise01;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * 
 */
public abstract class Bill {
	protected String billCode;
	protected LocalDateTime billDate;
	protected String clientName;
	protected String roomCode;
	protected double price;
	
	public Bill(String billCode, LocalDateTime billDate, String clientName, String roomCode, double price) {
		setBillCode(billCode);
		setBillDate(billDate);
		setClientName(clientName);
		setRoomCode(roomCode);
		setPrice(price);
	}

	public Bill() {
		this("Empty", LocalDateTime.now(), "Empty", "Empty", 0.0);
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		if(billCode == null || billCode.isEmpty()) {
			billCode = "Empty";
		}
		this.billCode = billCode;
	}

	public LocalDateTime getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDateTime billDate) {
		if(billDate.isAfter(LocalDateTime.now()) || billDate == null) {
			billDate = LocalDateTime.now();
		}
		this.billDate = billDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		if(clientName == null || clientName.isEmpty()) {
			clientName = "Empty";
		}
		this.clientName = clientName;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		if(roomCode == null || roomCode.isEmpty()) {
			roomCode = "Empty";
		}
		this.roomCode = roomCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0.0) {
			price = 0.0;
		}
		this.price = price;
	}
	
	public abstract double intoMoney();
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		@SuppressWarnings("deprecation")
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("| %s | %s | %s | %s | %s |",
				getBillCode(),
				dtf.format(getBillDate()),
				getClientName(),
				getRoomCode(),
				nf.format(getPrice())
				);
	}
}
