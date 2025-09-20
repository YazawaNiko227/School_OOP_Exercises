/**
 * 
 */
package exercise04;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date20 thg 9, 2025 time10:41:40
 */
public enum StatusAccount {
	ACTIVE("Tai khoan dang hoat dong."),
	INACTIVE("Tai khoan khong hoat dong."),
	CLOSED("Tai khoan da dong");
	
	private String values;

	/**
	 * @return the values
	 */
	public String getValues() {
		return values;
	}

	private StatusAccount(String values) {
		this.values = values;
	}
}
