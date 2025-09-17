/**
 * 
 */
package bai01;

/**
 * @description Iuh_Fit_Cs_Stt36_24741631
 * @author Phan Đức Toàn
 * @version 1.0
 * @created date17 thg 9, 2025 time17:01:01
 */
public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	/**
	 * @return the chieuDai
	 */
	public double getChieuDai() {
		return chieuDai;
	}
	/**
	 * @param chieuDai the chieuDai to set
	 */
	public void setChieuDai(double chieuDai) {
		if(chieuDai <= 0) {
			throw new IllegalArgumentException("Chieu dai khong am!");
		}
		this.chieuDai = chieuDai;
	}
	/**
	 * @return the chieuRong
	 */
	public double getChieuRong() {
		return chieuRong;
	}
	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(double chieuRong) {
		if(chieuRong <= 0) {
			throw new IllegalArgumentException("Chieu rong khong am!");
		}
		this.chieuRong = chieuRong;
	}
	/**
	 * 
	 */
	public HinhChuNhat() {
		this(1.0,1.0);
	}
	/**
	 * @param chieuDai
	 * @param chieuRong
	 */
	public HinhChuNhat(double chieuDai, double chieuRong) {
		setChieuDai(chieuDai);
		setChieuRong(chieuRong);
	}
	
	public double dienTich() {
	    return chieuDai * chieuRong;
	}

	public double chuVi() {
	    return 2 * (chieuDai + chieuRong);
	}

	@Override
	public String toString() {
	    return String.format("Chiều dài: %.2f | Chiều rộng: %.2f | Diện tích: %.2f | Chu vi: %.2f",
	                         chieuDai, chieuRong, dienTich(), chuVi());
	}

}
