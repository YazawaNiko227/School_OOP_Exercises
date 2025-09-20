/**
 * 
 */
package exercise04;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date20 thg 9, 2025 time11:24:15
 */
public class AccountList {
	private Account[] list;
	private int count = 0;
	
	public AccountList(int capacity) {
		if(capacity < 0) {
			list = new Account[10];
		}
		list = new Account[capacity];
	}

	public AccountList() {
		this(10);
	}
	
	public void addAccount(Account list) {
		if(count > this.list.length || list == null) {
			throw new IllegalArgumentException("Them tai khoan that bai.");
		}
		this.list[count++] = list;
	}
}
