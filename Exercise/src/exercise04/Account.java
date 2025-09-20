/**
 * 
 */
package exercise04;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date20 thg 9, 2025 time10:39:16
 */
public class Account {
	private long numberAccount;
	private String nameAccount;
	private double moneyAccount;
	private StatusAccount status;
	private String message;
	public final double INTEREST_RATE = 0.035;
	
	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	/**
	 * @param numberAccount
	 * @param nameAccount
	 * @param moneyAccount
	 * @param status
	 * @param message 
	 */
	public Account(long numberAccount, String nameAccount, double moneyAccount, StatusAccount status, String message) {
		this.message = message;
		setNumberAccount(numberAccount);
		setNameAccount(nameAccount);
		setMoneyAccount(moneyAccount);
		setStatus(status);
	}

	public Account() {
		this(999999, "Chưa xác định", 50, StatusAccount.ACTIVE, "");
	}

	/**
	 * @return the numberAccount
	 */
	public long getNumberAccount() {
		return numberAccount;
	}

	/**
	 * @param numberAccount the numberAccount to set
	 */
	public void setNumberAccount(long numberAccount) {
		if(numberAccount <= 0 || numberAccount == 999999) {
			this.numberAccount = 999999;
			this.message += "So tai khoan; ";
		}
		this.numberAccount = numberAccount;
	}

	/**
	 * @return the nameAccount
	 */
	public String getNameAccount() {
		return nameAccount;
	}

	/**
	 * @param nameAccount the nameAccount to set
	 */
	public void setNameAccount(String nameAccount) {
		if(nameAccount == null || nameAccount.isEmpty()) {
			this.nameAccount = "Chưa xác định";
			this.message += "Ten tai khoan; ";
		}
		this.nameAccount = nameAccount;
	}

	/**
	 * @return the moneyAccount
	 */
	public double getMoneyAccount() {
		return moneyAccount;
	}

	/**
	 * @param moneyAccount the moneyAccount to set
	 */
	public void setMoneyAccount(double moneyAccount) {
		if(moneyAccount < 50) {
			this.moneyAccount = 50;
			this.message += "Tien tai khoan; ";
		}
		this.moneyAccount = moneyAccount;
	}

	/**
	 * @return the status
	 */
	public StatusAccount getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusAccount status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	public double deposit(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("So tien khong hop le");
		}
		this.moneyAccount += amount;
		return moneyAccount;
	}
	
	public double withdraw(double amount) {
		if(amount >= moneyAccount || amount <= 0) {
			throw new IllegalArgumentException("So tien khong hop le");
		}
		this.moneyAccount -= amount;
		return moneyAccount;
	}
	
	public double transfer(Account orther, double amount) {
		if(orther == null || amount <= 0 || amount > this.moneyAccount) {
			throw new IllegalArgumentException("Chuyen tien that bai");
		}
		this.moneyAccount -= amount;
		orther.moneyAccount += amount;
		return moneyAccount;
	}
	
	public double matureInterest() {
	    this.moneyAccount += this.moneyAccount * INTEREST_RATE;
	    return moneyAccount;
	}

	@Override
	public String toString() {

		return String.format("%6s | %20s | %15s | %10s | %20s", 
				numberAccount,
				nameAccount,
				nf.format(moneyAccount),
				status,
				message
				);
	}
}
