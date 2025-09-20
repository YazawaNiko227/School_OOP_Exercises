/**
 * 
 */
package exercise05;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date20 thg 9, 2025 time13:09:24
 */
public class CompactDisk {
	private int codeCD;
	private String titleCD;
	private int numSongs;
	private double prices;
	
	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
	/**
	 * @param codeCD
	 * @param titleCD
	 * @param numSongs
	 * @param prices
	 */
	public CompactDisk(int codeCD, String titleCD, int numSongs, double prices) {
		setCodeCD(codeCD);
		setTitleCD(titleCD);
		setNumSongs(numSongs);
		setPrices(prices);
	}
	/**
	 * 
	 */
	public CompactDisk() {
		this(999999, "chưa xác định", 1, 1.0);
	}
	/**
	 * @return the codeCD
	 */
	public int getCodeCD() {
		return codeCD;
	}
	/**
	 * @param codeCD the codeCD to set
	 */
	public void setCodeCD(int codeCD) {
		if(codeCD <= 0) {
			this.codeCD = 999999;
		}else {
			this.codeCD = codeCD;
		}
	}
	/**
	 * @return the titleCD
	 */
	public String getTitleCD() {
		return titleCD;
	}
	/**
	 * @param titleCD the titleCD to set
	 */
	public void setTitleCD(String titleCD) {
		if(titleCD == null || titleCD.isEmpty()) {
			titleCD = "chưa xác định";
		}else {
			this.titleCD = titleCD;
		}
	}
	/**
	 * @return the numSongs
	 */
	public int getNumSongs() {
		return numSongs;
	}
	/**
	 * @param numSongs the numSongs to set
	 */
	public void setNumSongs(int numSongs) {
		if(numSongs <= 0) {
			throw new IllegalArgumentException("So bai hat phai lon hon 0.");
		}
		this.numSongs = numSongs;
	}
	/**
	 * @return the prices
	 */
	public double getPrices() {
		return prices;
	}
	/**
	 * @param prices the prices to set
	 */
	public void setPrices(double prices) {
		if(prices <= 0) {
			throw new IllegalArgumentException("So tien phai lon hon 0.");
		}
		this.prices = prices;
	}
	
	@Override
	public String toString() {
	    return String.format("%06d | %-15s | %3d | %s", codeCD, titleCD, numSongs, nf.format(prices));
	}

}
